package com.nisum;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ContextServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        ServletContext context = getServletContext();
        String trainer = context.getInitParameter("trainer");

        resp.setContentType("text/html");
        resp.getWriter().println("<h2>Trainer from ServletContext: " + trainer + "</h2>");
    }
}

