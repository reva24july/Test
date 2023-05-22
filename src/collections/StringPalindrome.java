package collections;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String arr[]= {"Mom","dad","son","cat"};
int count=0;
for(String str:arr) {
	StringBuilder sb=new StringBuilder(str);
	 sb.reverse();
	 String rstr=sb.toString();
	 System.out.println(rstr);
	 if(str.equalsIgnoreCase(rstr)) {
		 count++;
	 }
	   }System.out.println(count);
     


}
	}
