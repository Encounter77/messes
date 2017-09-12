package mvc.ex;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Update_stu
 */
@WebServlet("/Update_stu")
public class Update_stu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update_stu() {
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
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name2");
		String sex = request.getParameter("sex2");
		int age = Integer.parseInt(request.getParameter("age"));
		float weight = Float.parseFloat(request.getParameter("weight"));
		float hight = Float.parseFloat(request.getParameter("hight"));
		String nameold = (String) request.getSession().getAttribute("name");
		String sexold = (String) request.getSession().getAttribute("sex");
		String sql = "update stu_info set id="+id+","+"name='"+name+"',sex='"+sex+"',age="+age+",weight="+weight
				+",hight="+hight+" where name='"+nameold+"' and sex='"+sexold+"'";
		DBUtil run = new DBUtil();
		int n = run.updateSQL(sql);
		if(n>=1){
			request.getRequestDispatcher("operate_success.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("operate_error.jsp").forward(request, response);
		}
	}

}
