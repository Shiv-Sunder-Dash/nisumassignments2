package com.nisum;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class CookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");

        // Check for existing cookies
        Cookie[] cookies = req.getCookies();
        String name = null;
        if (cookies != null) {
            for (Cookie c : cookies) {
                if ("username".equals(c.getName())) {
                    name = c.getValue();
                    break;
                }
            }
        }

        // If not found, set the cookie
        if (name == null) {
            name = "Ravi";
            Cookie cookie = new Cookie("username", name);
            cookie.setMaxAge(60 * 60); // 1 hour
            resp.addCookie(cookie);
            resp.getWriter().println("<p>Cookie 'username' set to: " + name + "</p>");
        } else {
            resp.getWriter().println("<p>Welcome back, " + name + " (from cookie)</p>");
        }
    }
}

