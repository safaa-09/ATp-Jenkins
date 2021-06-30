package com.tpexp.A_Master_Example;

public class ATriangle {
	String TriangleType(int side1, int side2, int side3) 
	{ 		
		/*if((side1 == 0) || (side2 == 0) || (side3 == 0))
			 throw new IllegalArgumentException();	*/
	    // condition 
		if(side1==side2 && side2==side3) 
	    {
	        /* tous ses côtés sont égaux */
			//System.out.println("Equilateral triangle.");
			 return "Equilateral";	       
	    }
	    else if(side1==side2 || side1==side3 || side2==side3) 
	    {
	        /* au moins deux côtés sont égaux */
	    	return "Isocèle";
	    }
	    else 
	    {	        /* aucun côté n'est égal à l'autre */
	    	return "Scalene";
	    	
	    }	 
		
	}
}
