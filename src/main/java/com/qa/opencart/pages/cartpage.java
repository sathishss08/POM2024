package com.qa.opencart.pages;

public class cartpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String productname = "iphone";
		
		
		
		int len = productname.length();
		String rev =" ";
		
		for (int i=len-1;i>=0;i--)
		{
			
			rev = rev+productname.charAt(i);
		}
			
			
			System.out.println(rev);
			
			
		}
		
		
		
		
		
		

	}


