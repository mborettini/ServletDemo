package com.sda;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebInitParam;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "HelloServlet",
//        urlPatterns = {"/hello", "/Hello"},
//        initParams = {
//                @WebInitParam(name = "who", value = "World"),
//                @WebInitParam(name = "times", value = "5")
//        },
//        loadOnStartup = 1) //adnotacje - przykłady. Alternatywna konfiguracja servletu dla web.xml
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        response.setContentType("text/html;charset=utf-8"); //zapewnia wyświetlanie polskich znaków
        writer.println("<p>Hello World<p>");

        //http://localhost:8080/task?priority=LOW
        //String priority = request.getParameter("priority"); <- wyciągnięcie parametrów przekazanych w URL
    }
}
