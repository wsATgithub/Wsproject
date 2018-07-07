package com.ws.dl.www.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ws.dl.www.utils.PropertyUtil;

public class MySQLConnector {

	public static String getName(String id) {
		String driverClassName = PropertyUtil.getValue("jdbc.driverClassName");
		String url = PropertyUtil.getValue("jdbc.url");
		String username = PropertyUtil.getValue("jdbc.username");
		String password = PropertyUtil.getValue("jdbc.password");

		Connection conn = null;

		try {
			Class.forName(driverClassName);

			conn = DriverManager.getConnection(url, username, password);
			String sql = "select name from my_login where id =?";
			PreparedStatement ps =conn.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				return rs.getString("name");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return "そのた";
	}
}
