package practice;

import java.util.StringTokenizer;

public class Usermaincode4 {
public static int checkcharecters(String s) {
	StringTokenizer str=new StringTokenizer(s," ");
	int r;
String ss=str.nextToken();
String s1=ss;//Initialization of string.s1=first token...like i=0..
	while(str.hasMoreTokens()) {
		  s1=str.nextToken();//checks each token, at last the end token is saved in s1
}
if(ss.charAt(0)==s1.charAt(s1.length()-1)) {
	r=1;
}else {
	r=-1;
}return r;
}
}
