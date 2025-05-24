package com.nisum;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class TargetServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String msg = (String) req.getAttribute("message");

        resp.setContentType("text/html");
        resp.getWriter().println("<h2>Received Message:</h2>");
        resp.getWriter().println("<p>" + msg + "</p>");
    }
}
