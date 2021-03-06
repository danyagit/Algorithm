package com.xjf.decorator;

import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;

public class MyDataSource implements DataSource {

	private static Properties props = new Properties();
	private List<Connection> list = new ArrayList<Connection>();
	static {
		InputStream in = MyDataSource.class.getClassLoader().getResourceAsStream("dbconfig.properties");
		try {
			props.load(in);
			Class.forName(props.getProperty("driverClassName"));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public MyDataSource() throws SQLException {
		for (int i = 0; i < 5; i++) {
			Connection con = DriverManager.getConnection(props.getProperty("url"),
					props.getProperty("username"), props.getProperty("password"));
			//对Connection的close方法进行增强
			MyConnection con1 = new MyConnection(con,this);
			list.add(con1);
		}
	}
	
	public void add(Connection con) {
		list.add(con);
	}
	
	

	@Override
	public Connection getConnection() throws SQLException {
		return list.remove(0);
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}



	

}
