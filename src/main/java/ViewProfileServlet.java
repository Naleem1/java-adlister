import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        boolean isLoggedIn = session.getAttribute("user") != null;

        if(!isLoggedIn) {
            response.sendRedirect("/login");
            return;
        }
        String username = session.getAttribute("user").toString();
        request.setAttribute("username", username);
        request.getRequestDispatcher("WEB-INF/profile.jsp").forward(request, response);
    }
}
