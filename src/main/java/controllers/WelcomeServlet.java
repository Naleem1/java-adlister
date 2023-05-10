package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h2>Welcome," + username + "!</h2>");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("Inside welcome doGet method");
        String car = req.getParameter("car");
//        System.out.printf("Car: %s%n", car);
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        if( car != "") {
            out.println("<h3>Your " + car + "is awesome!</h3>");
        }else {
            out.print("<h3>Tell me about your car!<h3>");
        }
    }
}
