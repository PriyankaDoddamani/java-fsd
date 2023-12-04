package project06;


		// TODO Auto-generated method stub

		import java.util.*;
		public class ClassMaps {

			

					public static void main(String[] args) {
						// map
						
						//Hashmap
						HashMap<Integer,String> hm=new HashMap<Integer,String>();      
					      hm.put(1,"sim");    
					      hm.put(2,"Marry");    
					      hm.put(3,"cut");   
					       
					      System.out.println("\nThe elements of Hashmap are ");  
					      for(Map.Entry m:hm.entrySet()){    
					       System.out.println(m.getKey()+" "+m.getValue());    
					      }
					      
					     //HashTable
					       
					      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
					      
					      ht.put(4,"aman");  
					      ht.put(5,"alan");  
					      ht.put(6,"mohan");  
					      ht.put(7,"madan");  

					      System.out.println("\nThe elements of HashTable are ");  
					      for(Map.Entry n:ht.entrySet()){    
					       System.out.println(n.getKey()+" "+n.getValue());    
					      }
					      
					      
					      //TreeMap
					      
					      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
					      map.put(8,"ruby");    
					      map.put(9,"dhyafny");    
					      map.put(10,"sana");       
					      
					      System.out.println("\nThe elements of TreeMap are ");  
					      for(Map.Entry l:map.entrySet()){    
					       System.out.println(l.getKey()+" "+l.getValue());    
					      }    
					      
					   }  
				
	}


