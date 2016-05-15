package com.demo.j2se.core.lang;

public class JavaTypeTest {
	
	char[] ch = {'a','b','c'}; 
	
	public static void main(String[] args) {
		
		
		
		JavaTypeTest test = new JavaTypeTest();
		test.stringToNumber();
		
		
		test.changeArr(test.ch);
		
		System.out.println(test.ch);
		
		
		
		 Integer var1=new Integer(1);
		   Integer var2=var1;
		   doSomething(var2);
		   System.out.print(var1.intValue());
		   System.out.print(var2.intValue());
		   System.out.print(var1==var2);
		   
		   
		  String[] s1 = {"a", "b"};
		  String s2[] = {"a", "b"};
		  System.out.print(s1);
		  System.out.print(s2);
		  System.out.print(s1 == s2);
	}
	
	private void numberToString() {
		int o = 0123;
		String so = String.valueOf(o);
		System.out.println(so);
	}
	
	private void stringToNumber() {
		String s = "100";
		String ss = String.valueOf(555);
		System.out.println(ss);
	}
	
	
	private void warpNumber() {
		int i = 10;
		Integer integer = Integer.valueOf(i);
		System.out.println(integer);
		int reslut = integer.compareTo(11);
		System.out.println(reslut);
	}
	
	private void changeArr(char c[]) {
		c[0] = 'd';
		
	}
	
	public static void doSomething(Integer integer){
	    integer=new Integer(2);
	    
	}
	
}
