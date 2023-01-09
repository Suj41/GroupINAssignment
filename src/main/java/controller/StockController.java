package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Stock;

import java.io.IOException;
import java.io.PrintWriter;

import dao.StockDao;

/**
 * Servlet implementation class StockController
 */
public class StockController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StockDao stockdao;

    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StockController() {
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
		stockdao = new StockDao();
		PrintWriter out = response.getWriter();
        int stockProductQTY = Integer.parseInt(request.getParameter("stockProductQTY"));
		float stockPrice = Float.parseFloat(request.getParameter("stockPrice"));
	    int supplierID = Integer.parseInt(request.getParameter("supplierID"));
		String stockProductName = request.getParameter("stockProductName");
	
	Stock stock = new Stock(stockProductQTY,stockPrice,supplierID,stockProductName);
	try {
	int insert= stockdao.registerCustomerPreparedStatement(stock);
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

