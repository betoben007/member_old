import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/StatusCode")
public class StatusCode extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int status = Integer.parseInt(req.getParameter("status"));
		
		switch(status) {
			
			case 400 :
				res.sendError(HttpServletResponse.SC_BAD_REQUEST);
				break;
			case 404 :
				res.sendError(HttpServletResponse.SC_NOT_FOUND);
				break;
			case 500 :
				res.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				break;
			default :
				res.sendError(HttpServletResponse.SC_OK);
			
		}
		
		
	}

}
