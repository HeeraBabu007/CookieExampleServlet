

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletCookie")
public class MyServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name=request.getParameter("username");
		
		Cookie c1 = new Cookie("user", name);
		response.addCookie(c1);
		out.println("Hello !"+name);
	
		out.println("<form action="+"myservlet"+">");
		out.println("<input type="+"submit"+" value="+"submit"+ ">");
	
		
	}

}
