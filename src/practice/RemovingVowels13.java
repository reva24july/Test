package practice;

public class RemovingVowels13 {
public static String RemoveEvenVowels(String str) {
	StringBuffer sb=new StringBuffer(str);
	StringBuffer sb1=new StringBuffer();

	int s=sb.length();
	for(int i=0;i<s;i++) {
		if((i%2)==0) {
			sb1.append(sb.charAt(i));
		}
		if((i%2)!=0) {
		if(sb.charAt(i)!='a'&& sb.charAt(i)!='e'&& sb.charAt(i)!='i'&& sb.charAt(i)!='o'&& sb.charAt(i)!='u') {
		
			//sb.deleteCharAt(i);
			sb1.append(sb.charAt(i));
		}
		
	}}
	return sb1.toString();
	

}
}