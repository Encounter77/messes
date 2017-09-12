package mvc.ex;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Delete_stu
 */
@WebServlet("/Delete_stu")
public class Delete_stu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete_stu() {
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
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String ww1 = request.getParameter("w1");
		String ww2 = request.getParameter("w2");
		//对提交的空值进行判断
		String s = "1=1" ;	
		if (!name.equals(""))
			s = s + " and name='" + name + "'";
		if (sex != null)
			s = s + " and sex='" + sex + "'";
		float w1, w2;
		if (ww1.equals("")) {
			w1 = Float.parseFloat(ww1);
			s = s + " and weight>=" + w1;
		}
		if (ww2.equals("")) {
			w2 = Float.parseFloat(ww2);
			s = s + " and weight<=" + w2;
		}
		String sql = "delete from stu_info where " + s;
		DBUtil run = new DBUtil();
		int n = run.updateSQL(sql);
		if(n>=1){
			request.getRequestDispatcher("operate_success.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("operate_error.jsp").forward(request, response);
		}
	}

}
