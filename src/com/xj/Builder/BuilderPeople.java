package com.xj.Builder;  

import java.util.ArrayList;
import java.util.List;
  
public class BuilderPeople {

	private static List<InterfacetoPeople> list = new ArrayList<InterfacetoPeople>();  
	
	
	
	   @SuppressWarnings("rawtypes")
	public static List produceAmericaPeople(int count){ 
		   if(list!=null)
		   {
			   list=new ArrayList<InterfacetoPeople>();
		   }
	        for(int i=0; i<count; i++){  
	            list.add(new AmericaPeople());  
	        }
			return list;  
	    }  
	   
	   
	   @SuppressWarnings("rawtypes")
	public static List produceChinaPeople(int count){ 
		   if(list!=null)
		   {
			   list=new ArrayList<InterfacetoPeople>();
		   }
	        for(int i=0; i<count; i++){  
	            list.add(new ChinaPeople());  
	        }
			return list;  
	    }  
	   @SuppressWarnings("rawtypes")
	public  static List produceJapanPeople(int count){  
		   if(list!=null)
		   {
			   list=new ArrayList<InterfacetoPeople>();
		   }
	        for(int i=0; i<count; i++){  
	        	JapanPeople japanPeople = new JapanPeople();
	            list.add(japanPeople);  
	        }
			return list;  
	    }  
	
}
