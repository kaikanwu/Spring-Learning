package ch00.servlet;

import ch00.service.ServiceDemo;
import ch00.service.impl.ServiceDemoImpl;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.*;
import java.io.IOException;

/**
 * @author kaikanwu
 * created on 9/6/2020
 */
@WebServlet(urlPatterns = "/hello-servlet")
public class ServletDemo extends HttpServlet {

    private ServiceDemo serviceDemo = new ServiceDemoImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println(serviceDemo.findAll().toString());
    }

}
