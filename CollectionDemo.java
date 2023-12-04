package project05;


		// TODO Auto-generated method stub

		import java.util.*;
		public class CollectionDemo {

			

					public static void main(String[] args) {
						//creating arraylist
						System.out.println("ArrayList");
						ArrayList<String> city=new ArrayList<String>();   
					      city.add("Bangalore");//
					      city.add("Gulbarga");    	   
					      System.out.println(city);  
						
						//creating vector
					      System.out.println("\n");
					      System.out.println("Vector");
					      Vector<Integer> vec = new Vector();
					      vec.addElement(30); 
					      vec.addElement(40); 
					      System.out.println(vec);
						
						//creating linkedlist
					      System.out.println("\n");
					      System.out.println("LinkedList");
					      LinkedList<String> names=new LinkedList<String>();  
					      names.add("janu");  
					      names.add("sanu");  	      
					      Iterator<String> itr=names.iterator();  
					      while(itr.hasNext()){  
					       System.out.println(itr.next());  
					       
					       //creating hashset
					       System.out.println("\n");
					       System.out.println("HashSet");
					       HashSet<Integer> set=new HashSet<Integer>();  
					       set.add(121);  
					       set.add(122);  
					       set.add(123);
					       set.add(124);
					       System.out.println(set);
					       
					       //creating linkedhashset
					       System.out.println("\n");
					       System.out.println("LinkedHashSet");
					       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
					       set2.add(15);  
					       set2.add(16);  
					       set2.add(17);
					       set2.add(18);	       
					       System.out.println(set2);
					      	} 
					      }  
	}

