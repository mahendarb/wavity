package com.wavity.dispacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class LoginDao {
	private static Connection connection = null;

	private static Connection getConnection() {
		try {
			Context init = new InitialContext();
			Context env = (Context) init.lookup("java:/comp/env");
			DataSource dataSource = (DataSource) env.lookup("jdbc/userDB");
			connection = dataSource.getConnection();
		} catch (NamingException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return connection;
	}

	public static boolean getLogin(String name, String pass) {
		boolean status = false;
		try {
			connection = getConnection();
			String sql = "select *  from public.login where name=? and pass=?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			status = rs.next();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return status;

	}

}
