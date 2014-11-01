package org.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class TestServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        Object first = request.getSession().getAttribute("first");
        if (first != null) {
            response.getWriter().write("First access: " + first);
        } else {
            first = new Date();
            request.getSession().setAttribute("first", first);
            response.getWriter().write("First access: " + first);
        }
    }
}