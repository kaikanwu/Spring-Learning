package com.kk.hellospring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, JdbcTemplateAutoConfiguration.class})
@RestController
@Slf4j
public class HelloSpringApplication implements CommandLineRunner {
//
//    @Autowired
//    private DataSource dataSource;


//    @Autowired
//    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello spring 2020";
    }



    @Override
    public void run(String... args) throws Exception {
        showConnection();
        showData();
    }


    // 依赖关系： DataSourceProperties -> DataSource -> DataSourceTransactionManager
    @Bean
    @ConfigurationProperties("foo.datasource")
    public DataSourceProperties fooDataSourceProperties() {
        return new DataSourceProperties();
    }


    @Bean
    public DataSource fooDataSource() {
        DataSourceProperties dataSourceProperties = fooDataSourceProperties();
        return dataSourceProperties.initializeDataSourceBuilder().build();
    }


    // 注意这里的参数名称，会去找对应名称的 bean
    @Bean
    public DataSourceTransactionManager fooTxManagerName(DataSource barDataSource) {
        return new DataSourceTransactionManager(barDataSource);
    }




    @Bean
    @ConfigurationProperties("bar.datasource")
    public DataSourceProperties barDataSourceProperties() {
        return new DataSourceProperties();
    }


    @Bean
    public DataSource barDataSource() {
        DataSourceProperties dataSourceProperties = barDataSourceProperties();
        return dataSourceProperties.initializeDataSourceBuilder().build();
    }


    @Bean
    public DataSourceTransactionManager barTxManager(DataSource barDataSource) {
        return new DataSourceTransactionManager(barDataSource);
    }




    private void showConnection() throws SQLException {
//        log.info(dataSource.toString());
//        Connection connection = dataSource.getConnection();
//        log.info(connection.toString());
//        connection.close();
    }


    private void showData() {
//        jdbcTemplate.queryForList("select * from FOO").forEach(row-> log.info(row.toString()));
    }






}
