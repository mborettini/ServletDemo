package com.sda.note;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class NoteServlet extends HttpServlet {

    private static final Logger log = Logger.getLogger(NoteServlet.class);

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String noteContent = request.getParameter("nameContent"); //ta sama nazwa musi być w atrybucie input
        if (noteContent.isEmpty()) {
            throw new IllegalArgumentException("Note can not be empty");
        }
        log.info("note content: " + noteContent);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        //writer.println("<html>");
        //writer.println("<head>");
        //writer.println("<title>ServletDemo</title>");
        //writer.println("</head>");
        //writer.println("<body>");
        writer.println("<form action='/note' method='post'>");
        writer.println("<label for='noteInput'>Note:</label>");
        writer.println("<input id='noteInput' type='text' name='noteContent'/>");

        writer.println("<br/><br/>");
        writer.println("<input type='submit' value='AddNote'/>");
        writer.println("</form>");
        //writer.println("</body>");
        //writer.println("</html>");
    }

}
