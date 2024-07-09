package Operators_And_Variables;
import java.util.*;
public class Find_Max_Of_Three_Numbers_questions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>=b&&a>=c) {
        	System.out.println(a+"a is max");
        }else if(b>=a&&b>=c){
        	System.out.println(b+"b is max");
        }else {
        	System.out.println(c+"c is max");
        }
	}

}
