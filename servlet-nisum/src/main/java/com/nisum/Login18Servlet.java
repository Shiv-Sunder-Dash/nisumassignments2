package com.nisum;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class Login18Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String uname = req.getParameter("username");
        String pass = req.getParameter("password");

        resp.setContentType("text/html");
        if ("admin".equals(uname) && "1234".equals(pass)) {
            HttpSession session = req.getSession();
            session.setAttribute("user", uname);
            resp.sendRedirect("dashboard");
        } else {
            resp.getWriter().println("<h3>Invalid login</h3>");
            resp.getWriter().println("<a href='login18.html'>Try Again</a>");
        }
    }
}
