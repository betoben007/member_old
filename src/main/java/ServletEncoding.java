import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/ServletEncoding")
public class ServletEncoding extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		process(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		process(req, res);
	}
	

	public void process(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = res.getWriter();
		String helloName = req.getParameter("name");
		
		out.println("<html><body>");
		out.println("<h1>Servlet Encoding Result</h1>");
		out.println("<h2>"+ helloName +"</h2>");
		out.println("</body></html>");
		
	}
	
}
