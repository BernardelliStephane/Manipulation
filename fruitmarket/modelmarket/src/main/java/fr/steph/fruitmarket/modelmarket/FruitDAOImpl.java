package fr.steph.fruitmarket.modelmarket;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FruitDAOImpl implements FruitDAO{
	
	String url = "jdbc:mysql://localhost:3306/market?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
	String driver = "com.mysql.cj.jdbc.Driver";
	String username = "root";
	String password = "root";
	
	@Override
	public ArrayList<Fruit> findAll() throws Exception {
		ArrayList<Fruit> allFruits = new ArrayList<>();
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url,username,password);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from fruits");
		while(rs.next()) {
			allFruits.add(new Fruit(rs.getInt("id"),rs.getString("name"), rs.getFloat("price")));
		}
		
		rs.close();
		stmt.close();
		conn.close();
		
		return allFruits;
	}
	
	
}
