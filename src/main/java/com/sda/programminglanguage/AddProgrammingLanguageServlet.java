package com.sda.programminglanguage;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//Strona dostępna pod adresem /addLanguage
public class AddProgrammingLanguageServlet extends HttpServlet {

    private static final Logger logger = Logger.getLogger(AddProgrammingLanguageServlet.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        response.setContentType("text/html;charset=utf-8");
        writer.println("<h1>Add new programming language</h1>");
        writer.println("<form action='/addLanguage' method='post'>");

        writer.println("<label for='name'>Programming language name:</label>");
        writer.println("<input type='text' id='name' name='name'><br>");
        writer.println("<br>");

        writer.println("<label for='level1'>Programming language level:</label>");

        writer.println("<input type='radio' id='level1' name='level' value='1/5'>");
        writer.println("<label for='level1'>1/5</label>");

        writer.println("<input type='radio' id='level2' name='level' value='2/5'>");
        writer.println("<label for='level2'>2/5</label>");

        writer.println("<input type='radio' id='level3' name='level' value='3/5'>");
        writer.println("<label for='level3'>3/5</label>");

        writer.println("<input type='radio' id='level4' name='level' value='4/5'>");
        writer.println("<label for='level4'>4/5</label>");

        writer.println("<input type='radio' id='level5' name='level' value='5/5'>");
        writer.println("<label for='level5'>5/5</label><br>");
        writer.println("<br>");

        writer.println("<label for='using'>Programming language using:</label>");
        writer.println("<input type='text' id='using' name='using'><br>");

        writer.println("<br/><br/>");
        writer.println("<input type='submit' value='Add'/>");

        writer.println("</form>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        String using = request.getParameter("using");
        String level = request.getParameter("level");

        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage(name,using,level);
        ProgrammingLanguageDataHolder.getInstance().addProgrammingLanguage(programmingLanguage);

        logger.info(name +" "+using+" "+level);
        response.sendRedirect("/languages");
    }

//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String name = request.getParameter("name");
//        String level = request.getParameter("level");
//        String using = request.getParameter("using");
//
//        logger.info(name + " " + level + " " + using);
//
//        response.sendRedirect("/programmingLanguageDashboardServlet"); //<- przekierowywanie
//
//    }

}
