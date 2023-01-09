package dao;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DbConnection;
import model.Sales;

public class SalesDao {
DbConnection db = new DbConnection();

public int registerCustomerPreparedStatement(Sales sales) {
	try {
		String query = "insert into sales(sl_ProductName,sl_ProductQTY,sl_Price, s_Date) values(?,?,?,?)";
					PreparedStatement st = db.con.prepareStatement(query);
					
					st.setString(1, sales.getSl_ProductName());
					st.setInt(2, sales.getSl_ProductQTY());
					st.setFloat(3, sales.getSl_Price());
					st.setString(4, sales.getS_Date());
		
		return db.manipulate(st);
		
		
	}catch(SQLException e) {
		e.printStackTrace();
		return 0;
	}
}
public List<Sales> getAllSales() {
	String query;
	query = "select * from sales";
	db = new DbConnection();
	ResultSet rs = db.retrieve(query);
	List<Sales>lstSales = new ArrayList<Sales>();
	
	try {
		while(rs.next()) {
			Sales sales = new Sales();
			sales.setSl_ID(rs.getInt("salesID"));
			sales.setSl_ProductName(rs.getString("salesProductName"));
			sales.setSl_ProductQTY(rs.getInt("salesProductQTY"));
			sales.setSl_Price(rs.getFloat("salesPrice"));;
			sales.setS_Date(rs.getString("salesDate"));
			
			
			lstSales.add(sales);
		}
	}catch(Exception ex) {
		System.out.print("Error" + ex);
	}
	return lstSales;
}
}
