package com.nisum;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class Step2Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();
        String name = (String) session.getAttribute("name");
        String email = req.getParameter("email");

        resp.setContentType("text/html");
        resp.getWriter().println("<h2>Summary</h2>");
        resp.getWriter().println("Name: " + name + "<br/>");
        resp.getWriter().println("Email: " + email);
    }
}

