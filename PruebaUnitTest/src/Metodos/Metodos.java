package Metodos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Metodos {
	  public  boolean isValid1(String cadena){
	    	 String abc = "?????abcdefghijklmn?opqrstuvwxyz1234567890";
	    	 List<Integer> indices = new ArrayList<>(); 
	    	 List<Integer> indices_ok = new ArrayList<>(); 
	    	 char c = 'a'; 
	    	 for(int j=0; j<abc.length(); j++){
	    		 c = abc.charAt(j); 
	    		 indices  = new ArrayList<>(); 
	    		 for(int i = 0; i < cadena.length(); i++) {
	 	    	    if (cadena.charAt(i) == abc.charAt(j) ) {
	 	    	    	indices.add(i);
	 	    	    }
	 	    	 } 
	    		 if(indices.size() > 0){ 
	    			 indices_ok.add(indices.size());
	    		 } 
	    	 } 
	    	 int consta = indices_ok.get(0);
	    	 for(Integer lst:indices_ok){
	    		if( consta != lst) return false;
	    	 } 
	    	  return true; 
	    } 
	    
	    public  boolean isValid2(String cadena){
	    	 String abc = "?????abcdefghijklmn?opqrstuvwxyz1234567890";
	    	 List<Integer> indices = new ArrayList<>(); 
	    	 List<Integer> indices_ok = new ArrayList<>(); 
	    	 char c = 'a'; 
	    	 for(int j=0; j<abc.length(); j++){
	    		 c = abc.charAt(j); 
	    		 indices  = new ArrayList<>(); 
	    		 for(int i = 0; i < cadena.length(); i++) {
	 	    	    if (cadena.charAt(i) == abc.charAt(j) ) {
	 	    	    	indices.add(i);
	 	    	    }
	 	    	 }
	    		 if(indices.size() > 0){ 
	    			 indices_ok.add(indices.size());
	    		 } 
	    	 } 
	     
	    	  if(indices_ok.size() > 2){ 
	    		  List<Integer> listWithDuplicates = indices_ok; 
	    		  List<Integer> listWithoutDuplicates = new ArrayList<>(
	    		  new HashSet<>(listWithDuplicates)); 
	    		  if(listWithoutDuplicates.get(0) + 1 == listWithoutDuplicates.get(1)
	    				  || listWithoutDuplicates.get(0) - 1 == listWithoutDuplicates.get(1)){ 
	    		  }else{
	    			  return false;
	    		  } 
	    	  }else{
	    		  if(indices_ok.size() == 2){
	    			  if(indices_ok.get(0) + 1 == indices_ok.get(1)
		    				  || indices_ok.get(0) - 1 == indices_ok.get(1)){ 
		    		  }else{
		    			  return false;
		    		  }
	    		  }else if(indices_ok.size() == 1){
	    			  
	    		  }
	    	  } 
	    	  return true; 
	    } 
}
