package Operators_And_Variables;
import java.util.*;
public class Age_Limit_Questions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18) {
        	System.out.println("Adult");        	
        }else {
        	System.out.println("Not Adult");
        }
	}
}
