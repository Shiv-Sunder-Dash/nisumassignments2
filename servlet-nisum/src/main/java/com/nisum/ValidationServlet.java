package com.nisum;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ValidationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String ageStr = req.getParameter("age");

        resp.setContentType("text/html");

        try {
            int age = Integer.parseInt(ageStr);

            if (name == null || name.trim().isEmpty() || age <= 0) {
                resp.getWriter().println("<h2>Error: Invalid input</h2>");
            } else {
                resp.getWriter().println("<h2>Success: Data is valid</h2>");
                resp.getWriter().println("Name: " + name + "<br/>Age: " + age);
            }

        } catch (NumberFormatException e) {
            resp.getWriter().println("<h2>Error: Age must be a valid number</h2>");
        }
    }
}