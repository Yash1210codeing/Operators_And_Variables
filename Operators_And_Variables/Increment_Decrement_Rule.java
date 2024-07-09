package Operators_And_Variables;
public class Increment_Decrement_Rule {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=9;
        a++; //a=a+1;  // Post Increment
        ++a; //a=a+1;  // Pre Increment
        System.out.println(a++);
        System.out.println(a);
        
        int b=7;
        b--;  //b=b-1; // Post Decrement 
        --b; // b=b-1; // Pre Decrement
        System.out.println(b--);
        System.out.println(b);
	}

}
