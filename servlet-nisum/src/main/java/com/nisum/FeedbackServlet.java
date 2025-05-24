package com.nisum;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.*;

public class FeedbackServlet extends HttpServlet {
    private static final List<String> feedbackList = new ArrayList<>();

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter("name");
        String message = req.getParameter("message");

        if (name != null && message != null && !message.trim().isEmpty()) {
            feedbackList.add(name + ": " + message);
        }

        resp.setContentType("text/html");
        resp.getWriter().println("<h2>Thank you for your feedback!</h2>");
        resp.getWriter().println("<a href='feedback.html'>Submit Another</a>");
    }
}
