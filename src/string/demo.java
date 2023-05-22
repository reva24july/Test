package string;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Apple";
String s2="Watermelon";
String s3="Apple";
String s4="Grape";
System.out.println(s1.length());//**to display the number of characters//
System.out.println(s2.length());
System.out.println(s3.charAt(4));//**to display mentioned index value character,,index starts with 0//
System.out.println(s1.concat(s2));//**joining two strings//
System.out.println(s3.toLowerCase());//**change to lowercase//
System.out.println(s2.toUpperCase());//*change to Uppercase//
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));//**To check the two strings equal or not**it considers the case*//
System.out.println(s1.equalsIgnoreCase(s3));
System.out.println(s4.startsWith("r"));//**checking the starting letter with specified char**boolean output**
System.out.println(s2.endsWith("n"));//**end letter checking..,output boolean output//
System.out.println(s4.indexOf("p"));//**index value of char or string//

System.out.println(s1.indexOf("e",s1.indexOf("p")));//**(s1.indexOf("e",1),using this for when string has same letters***
System.out.println(s2.lastIndexOf("e"));//**index value of last occurrence of the  specified letter****//
System.out.println(s2.substring(5));//**displays the string from the specified index**//
System.out.println(s2.substring(0,5));//**displays string between the specified index(here from 0 to 5....>water**
System.out.println(s4.replace("Grape","Orange"));//**replacing the string with other string**//
System.out.println(s1.trim());
	}

}
