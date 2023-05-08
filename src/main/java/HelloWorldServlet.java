import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name = req.getParameter("name");
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        if( name != null) {
            out.println("<h3>Hello " + name + "!</h3>");
        }else {
            out.print("<h3>Hello, World!<h3>");
        }
    }
}
