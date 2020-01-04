package com.hopu.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hopu.model.Users;
import com.hopu.util.DBUtil;


public class UserDao {
	
	private ResultSet rs;
	private PreparedStatement pst;

	
	public List<Users> findAll() {
		List<Users> list = new ArrayList<Users>();
		Users u = null;
		String sql = "select * from userbase";
		pst = DBUtil.getPst(sql);
		try {
			rs = pst.executeQuery();
			
			while (rs.next()) {
				u = new Users(rs.getString("UserID"), rs.getString("UserName"), 
						rs.getString("PassWord"), rs.getString("UserNo"), rs.getString("ClassroomID"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(rs);
		}
		return list;
	}
	
}
