package practice;

public class Usermaincode3 {
	public static void getMiddleCharecters(String s) {
		String str=new String(s);
		System.out.println("length of the string"+str.length());
		int n=str.length();
		char ch=str.charAt((n/2)-1);
		char ch2=str.charAt(n/2);
		
		System.out.println("Middle charecters:"+ch+ch2);	
	}

}
