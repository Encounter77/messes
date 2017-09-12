package MVC;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class controller_Servlet
 */
@WebServlet("/controller_Servlet")
public class Controller_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String s1 = request.getParameter("hight");
		String s2 = request.getParameter("weight");
		double hight = Double.parseDouble(s1);
		double weight = Double.parseDouble(s2);
		Model_Bean m = new Model_Bean(hight, weight);
		double BMI = m.bmiResult();
		String result = m.result();
		request.setAttribute("BMI",BMI);
		request.setAttribute("result ",result );
		request.getRequestDispatcher("View_Result.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
