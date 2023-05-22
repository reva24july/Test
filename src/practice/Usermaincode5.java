package practice;

public class Usermaincode5 {
public static void formnewword(String s,int n) {
String ss=new String(s);
String ss1=ss.substring(0,n);
String ss2=ss.substring(ss.length()-n,ss.length());
System.out.println(ss1+ss2);

}
}
