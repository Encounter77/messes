package mvc.ex;

import java.sql.ResultSet;

public class User {
	private String uname;
	private String upassword;
	
	public User(String name,String password) {
		this.uname = name;
		this.upassword = password;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	
	public boolean loginCheck(){
		try {
			DBBean db = new DBBean();
			//
			String sql = "select * from user_b where uname='"+uname+"'and upassword="+upassword;
			ResultSet rs = db.executeQuery(sql);
			if(rs.next()){
				if(rs!=null){
					rs.close();
				}
				return true;
			}else{				
				return false;
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
	}
}
