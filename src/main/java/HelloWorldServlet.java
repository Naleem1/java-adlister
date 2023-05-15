import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
// <<<<<<< javabeans

// @WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
// public class HelloWorldServlet extends HttpServlet {
//     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//         response.getWriter().println("<h1>Hello, World!</h1>");
// =======
import java.io.PrintWriter;

@WebServlet(name="HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello, World!</h1>");

// >>>>>>> servlets-start
    }
}
