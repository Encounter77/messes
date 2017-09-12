package mvc.ex;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Query_stu_condition
 */
@WebServlet("/Query_stu_condition")
public class Query_stu_condition extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Query_stu_condition() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String sex = request.getParameter("sex");
		float weight1 = Float.parseFloat(request.getParameter("w1"));
		float weight2 = Float.parseFloat(request.getParameter("w2"));
		String sql = "select * from stu_info where sex='"+sex+"'and weight>="+weight1+" and weight<="+weight2;
		DBUtil run = new DBUtil();
		ResultSet rs = run.querySQL(sql);
		request.setAttribute("rs", rs);
		request.getRequestDispatcher("query_stu_result_all.jsp").forward(request, response);
	}

}
