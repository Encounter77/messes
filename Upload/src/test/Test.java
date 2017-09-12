package test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import cn.itcast.commons.CommonUtils;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// 处理中文乱码问题
		request.setCharacterEncoding("utf-8");

		// 1、创建一个DiskFileItemFactory工厂(缓存大小,临时目录)
		DiskFileItemFactory factory = new DiskFileItemFactory(20 * 1024,
				new File("J:/temp"));

		// 2、创建一个文件上传解析器
		ServletFileUpload sfu = new ServletFileUpload(factory);
		// 设置文件上传最大限制：100KB,设置表单上传最大限制：1MB
		sfu.setFileSizeMax(100 * 1024);
		//sfu.setSizeMax(1024 * 1024);

		try {
			// 1)得到 FileItem 的集合 fileitemList
			List<FileItem> fileitemList = sfu.parseRequest(request);
			for (FileItem item : fileitemList) {
				// 若是一个一般的表单域, 打印信息
				if (item.isFormField()) {
					String name = item.getFieldName();
					String value = item.getString("utf-8");
					System.out.println(name + ": " + value);

				} else {
					String root = this.getServletContext().getRealPath(
							"/WEB-INF/files/");
					String filename = item.getName();
					// 处理文件绝对路径问题,切割路径
					int index = filename.lastIndexOf("\\");
					if (index != -1) {
						filename = filename.substring(index + 1);
					}
					// 添加文件名前缀
					String savename = CommonUtils.uuid() + "_" + filename;
					// 哈希打散
					int Hcode = filename.hashCode();
					String Hex = Integer.toHexString(Hcode);
					// 获取Hex的前两个字母，与root连接，生成完整路径
					File dirFile = new File(root, Hex.charAt(0) + "/"
							+ Hex.charAt(1));
					// 创建目录链
					dirFile.mkdirs();
					// 创建目录文件
					File destFile = new File(dirFile, savename);
					// 保存文件
					item.write(destFile);
					//得到上传目录结构
					System.out.println(destFile.toString());
				}
		}
		} catch (FileUploadException e) {
			// 如果抛出上传文件超限制大小异常,反馈页面提示信息
			if (e instanceof FileUploadBase.FileSizeLimitExceededException) {
				request.setAttribute("msg", "您上传的文件超出了100KB！");
				request.getRequestDispatcher("/test1.jsp").forward(request,
						response);
			}
			if (e instanceof FileUploadBase.SizeLimitExceededException) {
				request.setAttribute("msg2", "您上传的表单大小超过了1M！");
				request.getRequestDispatcher("/test1.jsp").forward(request,
						response);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}