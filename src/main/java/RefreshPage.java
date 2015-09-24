import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/RefreshPage")
public class RefreshPage extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html;charset=euc-kr");
		
		PrintWriter out = res.getWriter();
		
		res.setHeader("Refresh", "5;URL=http://www.naver.net/");
		
		out.println("<html><body>");
		out.println("<h2> 5초후에 이동합니다.</h2>");
		out.println("</body></html>");
			
	}
	
}
