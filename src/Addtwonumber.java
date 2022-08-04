
public class Addtwonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//70, 50 -- 70-50
		//70, 100 -- 100-70
		//70, 70 -- 0
		//70, abc -- -1
		
		int num1 = 70;
		int num2 =50;
		
		int result;
		
		if(num1>num2)
			result = num1-num2;
		else if(num2>num1)
			result = num2-num1;
		else if(num1==num2)
			result =0;
			else
				result = -1;
		
		System.out.println(result);
		
	}//end of main
	
}//end of class	

