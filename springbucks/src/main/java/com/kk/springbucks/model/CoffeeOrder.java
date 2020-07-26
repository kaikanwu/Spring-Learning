package com.kk.springbucks.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author kaikanwu
 * created on 7/25/2020
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("T_ORDER")
@Entity
@Builder
public class CoffeeOrder {


    @Id
    @GeneratedValue
    private Long id;


    private String customer;
    

    @ManyToMany
    @JoinTable("T_ORDER_COFFEE")
    private List<Coffee> items;


    @Column(nullable = false)
    private Integer state;


    @CreationTimestamp
    @Column(updatable = false)
    private Date createTime;


    @UpdateTimestamp
    private Date updateTime;


}
