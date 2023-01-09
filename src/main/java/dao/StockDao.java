package dao;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DbConnection;
import model.Stock;
public class StockDao {
DbConnection db = new DbConnection();

public int registerCustomerPreparedStatement( Stock stock) {
	try {
		String query = "insert into stock(s_ProductQTY, s_Price, s_ID, s_ProductName) values(?,?,?,?)";
		
		PreparedStatement st = db.con.prepareStatement(query);
	
		st.setInt(1, stock.getS_ProductQTY());
		st.setFloat(2, stock.getS_Price());
		st.setInt(3, stock.getS_ID());
		st.setString(4, stock.getS_ProductName());
	

return db.manipulate(st);


}catch(SQLException e) {
e.printStackTrace();
return 0;
}
}
public List<Stock> getAllCustomers() {
	String query;
	query = "select * from stock";
	db = new DbConnection();
	ResultSet rs = db.retrieve(query);
	List<Stock>lstStock = new ArrayList<Stock>();
	
	try {
		while(rs.next()) {
			Stock stock = new Stock();
			stock.setS_ProductID(rs.getInt("stockProductID"));
			stock.setS_ProductQTY(rs.getInt("stockProductQTY"));
			stock.setS_Price(rs.getFloat("stockPrice"));
			stock.setS_ID(rs.getInt("supplierID"));
			stock.setS_ProductName(rs.getString("stockProductName"));
			
			
			
			lstStock.add(stock);
		}
	}catch(Exception ex) {
		System.out.print("Error" + ex);
	}
	return lstStock;
}
}
