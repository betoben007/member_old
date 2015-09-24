import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/httpGetServlet")
public class HttpGetServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();
		
		String helloName = req.getParameter("name");
		out.println("<html><body>");
		out.println("<h1>doGet Method</h1>");
		if(!helloName.equals(""))
			out.println("<h2>"+ helloName +"</h2>");
		out.println("</body></html>");
		
		
	}
}
