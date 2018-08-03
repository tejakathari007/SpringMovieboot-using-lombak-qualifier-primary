package com.stackroute.excercise;

public class MemberClassA extends MemberClass{
	public static void main(String args[]) {
		MemberClassA obj=new MemberClassA();
	          System.out.println("Member name :"+obj.Name);
	          System.out.println("Member age :"+obj.Age);
	          System.out.println("Member salary :"+obj.Salary);
	}
	
}
 class MemberClass {
	 String Name= "Harry Potter";
	   int Age = 30;
	 double Salary = 2500.3;

}

