
package model;

public class Sales{
	
	 	private int sl_ID;
	 	private int o_ID;
	    private String sl_ProductName;
	    private int sl_ProductQTY;
	    private float sl_Price;
	    private String s_Date;
	    
	    
	    public Sales() {
			// TODO Auto-generated constructor stub
		}
	    
	    public Sales(int sl_ID, int o_ID, String sl_ProductName ,
	    		int sl_ProductQTY, float sl_Price, String sl_Date){
	        this.sl_ID = sl_ID;
	        this.o_ID=o_ID;
	        this.sl_ProductName = sl_ProductName;
	        this.sl_ProductQTY=sl_ProductQTY;
	        this.sl_Price= sl_Price;
	        this.s_Date=sl_Date;
	    }

	    public Sales(int o_ID, String sl_ProductName ,
	    		int sl_ProductQTY, float sl_Price, String sl_Date){
	  
	        this.o_ID=o_ID;
	        this.sl_ProductName = sl_ProductName;
	        this.sl_ProductQTY=sl_ProductQTY;
	        this.sl_Price= sl_Price;
	        this.s_Date=sl_Date;
	    }

	    
	   
	    public int getSl_ID() {
	        return sl_ID;
	    }

	   
	    public void setSl_ID(int salesID) {
	        this.sl_ID = salesID;
	    }
	    
	    public int getO_ID() {
	        return o_ID;
	    }

	   
	    public void setO_ID(int o_ID) {
	        this.o_ID = o_ID;
	    }
	    
		public String getSl_ProductName() {
	        return sl_ProductName;
	    }

	   
	    public void setSl_ProductName(String sl_ProductName) {
	        this.sl_ProductName = sl_ProductName;
	    }

	   
	    public int getSl_ProductQTY() {
	        return sl_ProductQTY;
	    }

	   
	    public void setSl_ProductQTY(int sl_ProductQTY) {
	        this.sl_ProductQTY = sl_ProductQTY;
	    }

	    public float getSl_Price() {
	        return sl_Price;
	    }

	    public void setSl_Price(float sl_Price) {
	        this.sl_Price = sl_Price;
	    }

	  
	    public String getS_Date() {
	        return s_Date;
	    }

	   
	    public void setS_Date(String sl_Date) {
	        this.s_Date = sl_Date;
	    }

	    

	  

		

}
