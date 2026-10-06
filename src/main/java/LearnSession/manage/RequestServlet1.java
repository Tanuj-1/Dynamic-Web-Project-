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
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// We have to create a cookie:
		
		String username = "Durgesh";
// 		String userid = "1234";
		
		Cookie cookie = new Cookie("username",username);
		
		cookie.setMaxAge(10*60);
		
		resp.addCookie(cookie);
		
		
	}

	
	
	
}  
