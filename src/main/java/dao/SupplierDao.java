package dao;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DbConnection;
import model.Supplier;

public class SupplierDao {
DbConnection db = new DbConnection();

public int registerCustomerPreparedStatement(Supplier supplier) {
	try {
		String query = "insert into supplier(s_Name,s_Address," + 
				"s_Phone) values(?,?,?)";
					PreparedStatement st = db.con.prepareStatement(query);
					
					st.setString(1, supplier.getS_Name());
					st.setString(2, supplier.getS_Address());
					st.setString(3, supplier.getS_Phone());
		
		return db.manipulate(st);
		
		
	}catch(SQLException e) {
		e.printStackTrace();
		return 0;
	}
}
public List<Supplier> getAllSuppliers() {
	String query;
	query = "select * from supplier";
	db = new DbConnection();
	ResultSet rs = db.retrieve(query);
	List<Supplier>lstSuppliers = new ArrayList<Supplier>();
	
	try {
		while(rs.next()) {
			Supplier supplier = new Supplier();
			supplier.setS_ID(rs.getInt("supplierID"));
			supplier.setS_Name(rs.getString("supplierName"));
			supplier.setS_Address(rs.getString("supplierAddress"));
			supplier.setS_Phone(rs.getString("supplierPhone"));
			
			
			lstSuppliers.add(supplier);
		}
	}catch(Exception ex) {
		System.out.print("Error" + ex);
	}
	return lstSuppliers;
}
}
