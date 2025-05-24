package com.nisum;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class SessionSetServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("user", "Ramesh");

        resp.setContentType("text/html");
        resp.getWriter().println("<p>Session attribute 'user' set to 'Ramesh'</p>");
        resp.getWriter().println("<a href='readsession'>Go to Read Session Servlet</a>");
    }
}
