import javax.servlet.annotation.WebServlet;

import javax.servlet.http.*;
import java.io.IOException;

/**
 * @author kaikanwu
 * created on 9/6/2020
 */
@WebServlet(urlPatterns = "/hello-servlet")
public class ServletDemo extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.getWriter().println("hello-servlet running!");
    }

}
