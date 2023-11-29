package project5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class MyException extends Exception 
		{ 
		    public MyException(String s) 
		    { 
		        super(s); 
		    } 
		} 
		
		{ 
		    
		        try
		        { 
		            throw new MyException("temp"); 
		        } 
		        catch (MyException ex) 
		        { 
		            System.out.println("Caught"); 
		            System.out.println(ex.getMessage()); 
		        } 
		    } 
		}

	}

