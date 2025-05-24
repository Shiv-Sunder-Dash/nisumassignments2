package com.nisum;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");

        resp.setContentType("text/html");

        if ("admin".equals(uname) && "1234".equals(pass)) {
            resp.getWriter().println("<h2>Login Successful</h2>");
        } else {
            resp.getWriter().println("<h2>Invalid Credentials</h2>");
        }
    }
}
