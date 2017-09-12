package mvc.ex;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Update_stu_check
 */
@WebServlet("/Update_stu_check")
public class Update_stu_check extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update_stu_check() {
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
		String name = request.getParameter("name");
		String sql = "select * from stu_info where sex='"+sex+"' and name='"+name+"'";
		DBUtil run = new DBUtil();
		ResultSet rs = run.querySQL(sql);
		try {
			if (rs.next()) {
			request.setAttribute("rs", rs);
			request.getRequestDispatcher("update_stu_view.jsp").forward(request, response);
			}else{
				System.out.println("没有找到合适条件的记录！！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
