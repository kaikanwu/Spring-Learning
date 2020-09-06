package ch01.servlet;

import ch01.service.ServiceDemo;
import ch01.service.impl.ServiceDemoImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author kaikanwu
 * created on 9/6/2020
 */
@WebServlet(urlPatterns = "/hello-servlet-1")
public class ServletDemo extends HttpServlet {


//    private ServiceDemo serviceDemo = new ServiceDemoImpl();
    private ServiceDemo serviceDemo = new ServiceDemoImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println(serviceDemo.findAll().toString());
    }

}
