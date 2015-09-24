import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/PrintHeader")
public class PrintHeader extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();
		
		out.println("<html><body>");
	 	Enumeration headerName = req.getHeaderNames();
		
	 	while(headerName.hasMoreElements()) {
	 		String name = (String) headerName.nextElement();
	 		String value = req.getHeader(name);
	 		
	 		out.println(name +":"+ value +"<br>");
	 	}
	 	
	 	out.println("</body></html>");
	}
}
