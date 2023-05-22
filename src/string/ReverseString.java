package string;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Revathi";
String rstr=" ";
for(int i=0;i<str.length();i++) {
char c=str.charAt(i);
rstr=c+rstr;
	
}
System.out.println("Reverse String:"+rstr);
	}

}
