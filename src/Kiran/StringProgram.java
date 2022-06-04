package Kiran;

public class StringProgram 
{
	public static void main(String[] args) 
	{
	/*
	 	//syntax1
		String a = "Roshan";
		System.out.println(a);
		
		//syntax2
		String b = new String ("Nikhil");
		System.out.println(b);*/
		
		//case3
		
		String s1 = "Apple";
		
		String s2 = "Mango";
		
		String s3 = "Apple";
		
		String s4 = "apple";
		
		//value checking
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.equals(s4));
		
		//sntax with new keyword
		String a = new String("Apple");
		String b = new String("Mango");
		String c = new String("Apple");
		
		//value checking
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
	}

}
