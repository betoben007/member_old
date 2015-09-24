import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/now1")
public class MyServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html;charset=euc-kr");
	
			PrintWriter out = res.getWriter();
			
			out.println("<html><body>");
			out.println(req.getProtocol() + "<br>");
			out.println(req.getRemoteAddr() + "<br>");
			out.println(req.getRemoteHost() + "<br>");
			out.println(req.getScheme() + "<br>");
			out.println(req.getServerName() + "<br>");
			out.println(req.getServerPort() + "<br>");
			out.println("</body></html>");
	}
	
	
}
