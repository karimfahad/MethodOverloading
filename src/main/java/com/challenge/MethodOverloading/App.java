package com.challenge.MethodOverloading;

/**
 * Hello world!
 * overloading method means keeping the same method name but changing input parameters
 * so basically changing the signature
 */
public class App 
{
    public static void main( String[] args )
    {
    	double cm = calcFeetAndInchesToCentimeters(-10);
    	System.out.println("cm = " + cm);
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
    	
    	
    	if ((feet<0) || (inches<0) || (inches>12)) {
    		
    		System.out.println("Invalid Number");
    		return -1;
    		
    	}
    		else {
    		double cm = (feet * 12 * 2.54);
    		System.out.println(feet + " feet and " + inches + " inches = " + cm + " Centimeters");
    		return cm;
    			
    		}
    	
    }
    	public static double calcFeetAndInchesToCentimeters(double inches) {
        	
        	
        	if (inches >= 0) {
        		double feet = (inches / 12);
        		double remainder = (int) inches % 12;
        		return calcFeetAndInchesToCentimeters(feet, remainder);
        	}
        		else return -1;	
    	
    }
}
