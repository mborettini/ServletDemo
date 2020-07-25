package com.sda;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ErrorHandlerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Throwable attribute =
                (Throwable) request.getAttribute(RequestDispatcher.ERROR_EXCEPTION);
        PrintWriter writer = response.getWriter();
        writer.println("<h2>Error occured</h2>");
        writer.println("<Error message: " + attribute.getMessage());
    }
}
