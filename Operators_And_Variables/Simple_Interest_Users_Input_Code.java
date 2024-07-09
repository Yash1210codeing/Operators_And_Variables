package Operators_And_Variables;
import java.util.*;
public class Simple_Interest_Users_Input_Code {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        //int si=p*r*t/100;
        int si=(p*r*t)/100;
        System.out.println(si);
	}
}
