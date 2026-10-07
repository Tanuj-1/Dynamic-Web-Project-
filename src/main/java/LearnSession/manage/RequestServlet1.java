package LearnSession.manage;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class RequestServlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // We have to create cookies

        String username = "Durgesh";
        String userid = "1234";

        // Create username cookie
        Cookie usernameCookie = new Cookie("username", username);

        // Create userid cookie
        Cookie useridCookie = new Cookie("userid", userid);

        // Cookie expiry time: 10 minutes
        usernameCookie.setMaxAge(10 * 60);
        useridCookie.setMaxAge(10 * 60);

        // Add cookies to response
        resp.addCookie(usernameCookie);
        resp.addCookie(useridCookie);
    }
}

