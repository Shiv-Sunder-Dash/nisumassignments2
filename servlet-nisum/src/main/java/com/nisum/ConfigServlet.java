package com.nisum;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ConfigServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        ServletConfig config = getServletConfig();
        String company = config.getInitParameter("companyName");

        resp.setContentType("text/html");
        resp.getWriter().println("<h2>Company Name from ServletConfig: " + company + "</h2>");
    }
}

