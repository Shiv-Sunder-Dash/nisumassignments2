package com.nisum;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ForwardingServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setAttribute("message", "This message was forwarded.");
        RequestDispatcher rd = req.getRequestDispatcher("target");
        rd.forward(req, resp); // internal forwarding
    }
}