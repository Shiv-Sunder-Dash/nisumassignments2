package com.nisum;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class Step1Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter("name");
        HttpSession session = req.getSession();
        session.setAttribute("name", name);

        resp.setContentType("text/html");
        resp.getWriter().println("<h2>Step 2: Enter Email</h2>");
        resp.getWriter().println("<form action='step2' method='post'>");
        resp.getWriter().println("Email: <input type='email' name='email' />");
        resp.getWriter().println("<input type='submit' value='Finish' />");
        resp.getWriter().println("</form>");
    }
}
