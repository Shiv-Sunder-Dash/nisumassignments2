package com.nisum;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;

public class CartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String item = req.getParameter("item");
        HttpSession session = req.getSession();

        ArrayList<String> cart = (ArrayList<String>) session.getAttribute("cart");
        if (cart == null) {
            cart = new ArrayList<>();
        }

        if (item != null && !item.trim().isEmpty()) {
            cart.add(item);
        }

        session.setAttribute("cart", cart);

        resp.setContentType("text/html");
        resp.getWriter().println("<h2>Items in Cart:</h2>");
        for (String i : cart) {
            resp.getWriter().println(i + "<br/>");
        }
        resp.getWriter().println("<br/><a href='cart.html'>Add More Items</a>");
    }
}

