package taylor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TaylorServlet extends HttpServlet {

	private static final long serialVersionUID = -8651501224816049300L;
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		String name=request.getParameter("name");
		request.setAttribute("result", "收到name为"+name);
		request.getRequestDispatcher("/index.jsp").forward(request,response);
	}

}
