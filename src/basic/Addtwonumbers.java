package basic;

public class Addtwonumbers {

     public static void main(String[] args) {
    	 //decision making
    	 //1. if .. else statement
    	 //2. if .. else .. else statement
    	 //3. switch .. case statement
    	 
    	 //subtract two numbers -- small from bigger
    	 //70, 50 --70-50
    	 //70, 90 --90-70
    	 
    	 //70, 50
    	 //70, 100
    	 //70, 70
    	 //70, abc
    	 
    	 int num1 =70;
    	 int num2 =50;
    	 
    	 int result;
    	 
    	 if (num1 > num2) 
    		 result = num1 - num2;
    	 else
    		 result = num2 -num1;
    	 
    	 System.out.println(result);
}
}