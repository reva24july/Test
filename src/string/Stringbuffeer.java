package string;

public class Stringbuffeer {
public void excludehash() {
	StringBuffer st=new StringBuffer("Test#String");
	System.out.println(st.delete(3,6));
	
StringBuffer st1=new StringBuffer("test##string");
System.out.println(st1.delete(3,7));
StringBuffer st2=new StringBuffer("test#the#string");
System.out.println(st2.substring(0,3)+st2.charAt(6)+(st2.substring(10,15)));
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringbuffeer m=new Stringbuffeer();
		m.excludehash();

	}

}
