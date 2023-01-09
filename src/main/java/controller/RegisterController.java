package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Customer;

import java.io.IOException;
import java.io.PrintWriter;

import dao.CustomerDao;


public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDao customerdao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		customerdao = new CustomerDao();
		PrintWriter out=response.getWriter();
		String c_Fname= request.getParameter("firstName");
		String c_Lname= request.getParameter("lastName");
		String c_Phone= request.getParameter("phoneNo");
		String c_Address= request.getParameter("address");
		String c_UserName= request.getParameter("username");
		String c_Password= request.getParameter("password");
		
		Customer customer= new Customer(c_Fname,c_Lname,c_Phone,c_Address,c_UserName,c_Password);
		try {
			int insert= customerdao.registerCustomerPreparedStatement(customer);
			if(insert==1) {
				out.print("Successfully added");
			}else {
				out.print("Error registring customer");
			}
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		

	}

}
