package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Sales;
import java.io.IOException;
import java.io.PrintWriter;
import dao.SalesDao;

/**
 * Servlet implementation class Sales
 */
public class SalesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SalesDao salesdao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SalesController() {
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
		salesdao = new SalesDao();
		PrintWriter out = response.getWriter();
		String salesProductName = request.getParameter("salesProductName");
        int salesProductQTY = Integer.parseInt(request.getParameter("salesProductQTY"));
		float salesPrice = Float.parseFloat(request.getParameter("salesPrice"));
		String salesDate = request.getParameter("salesDate");
	
	Sales sales = new Sales(salesProductName,salesProductQTY,salesPrice,salesDate);
	try {
	int insert= salesdao.registerCustomerPreparedStatement(sales);
	if(insert==1) {
		out.print("Successfully added");
	}else {
		out.print("Error inserting");
	}
	}catch(Exception ex) {
		ex.printStackTrace();
	}
	
}
	}


