package mvc.ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Insert_stu
 */
@WebServlet("/Insert_stu")
public class Insert_stu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert_stu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		int age = Integer.parseInt(request.getParameter("age"));
		float weight = Float.parseFloat(request.getParameter("weight"));
		float hight = Float.parseFloat(request.getParameter("hight"));
		//String类型数据执行操作时要加单引号('name')!!!
		String sql = "insert into stu_info(id,name,sex,age,weight,hight) values ("+id+",'"+name+"','"+sex+"',"+age+","+weight+","+hight+")";
		DBUtil run = new DBUtil();
		int n = run.updateSQL(sql);
		if(n>=1){
			request.getRequestDispatcher("operate_success.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("operate_error.jsp").forward(request, response);
		}
	}

}
