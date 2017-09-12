package cn.qdgxy.jsontest.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * ${DESCRIPTION}
 *
 * @author 李欣
 * @version ${VERSION}
 * @since 2017-04-10 9:51
 */
@WebServlet(name = "JsonServlet", urlPatterns = "/JsonServlet")
public class JsonServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		response.addHeader("Access-Control-Allow-Origin", "*");


		// 获取通过Ajax传递过来的数据
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("username:" + username + "\npassword:" + password);

		// 向页面传递json数据
		PrintWriter writer = response.getWriter();
		writer.print("");
		writer.flush();
		writer.close();
	}

}
