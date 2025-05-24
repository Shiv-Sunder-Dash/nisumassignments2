package com.nisum;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class SessionReadServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession(false); // Don't create a new session

        resp.setContentType("text/html");

        if (session != null && session.getAttribute("user") != null) {
            String user = (String) session.getAttribute("user");
            resp.getWriter().println("<h2>Welcome, " + user + "!</h2>");
        } else {
            resp.getWriter().println("<h2>No session attribute found.</h2>");
        }
    }
}

