package model;

public class Supplier {
	
	 	private int s_ID;
	    private String s_Name;
	    private String s_Phone;
	    private String s_Address;
	    
	    
	    public Supplier() {
			// TODO Auto-generated constructor stub
		}
	    
	    public Supplier(String s_Name,String s_Phone ,String s_Address){
	        this.s_Name = s_Name;
	        this.s_Phone = s_Phone;
	        this.s_Address = s_Address;
	    }

	    public Supplier(int s_ID, String s_Name,String s_Phone ,String s_Address){
	    	this.s_ID=s_ID;
	    	this.s_Name = s_Name;
	        this.s_Phone = s_Phone;
	        this.s_Address = s_Address;
	    }

	    
	 
	    

		public int getS_ID() {
	        return s_ID;
	    }

	   
	    public void setS_ID(int s_ID) {
	        this.s_ID = s_ID;
	    }

	   
	    public String getS_Name() {
	        return s_Name;
	    }

	   
	    public void setS_Name(String s_Name) {
	        this.s_Name = s_Name;
	    }

	    public String getS_Phone() {
	        return s_Phone;
	    }

	    public void setS_Phone(String s_Phone) {
	        this.s_Phone = s_Phone;
	    }

	  
	    public String getS_Address() {
	        return s_Address;
	    }

	   
	    public void setS_Address(String s_Address) {
	        this.s_Address = s_Address;
	    }

	    

	  

		

}
