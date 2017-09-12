package mvc.ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Model_Servlet
 */
@WebServlet("/Model_Servlet")
public class Model_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Model_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String realpart1 = request.getParameter("realpart1");
		String imaginarypart1 = request.getParameter("imaginarypart1");
		String realpart2 = request.getParameter("realpart2");
		String imaginarypart2 = request.getParameter("imaginarypart2");
		double r1 = Double.parseDouble(realpart1);
		double i1 = Double.parseDouble(imaginarypart1);
		double r2 = Double.parseDouble(realpart2);
		double i2 = Double.parseDouble(imaginarypart2);
		Complex com = new Complex(r1, i1);
		Complex addr = com.add(new Complex(r2, i2));
		Complex subr = com.sub(new Complex(r2, i2));
		Complex mulr = com.mul(new Complex(r2, i2));
		Complex divr = com.div(new Complex(r2, i2));
		request.setAttribute("addr", addr);
		request.setAttribute("subr", subr);
		request.setAttribute("mulr", mulr);
		request.setAttribute("divr", divr);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
