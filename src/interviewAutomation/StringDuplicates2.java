package interviewAutomation;

public class StringDuplicates2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Revathia";
		String str=s.toLowerCase();
		StringBuilder sb=new StringBuilder(s);
		for(int i=0;i<sb.length();i++) {
		for(int j=1;j<sb.length();j++)	{
		
if(sb.charAt(i)==sb.charAt(j)) {
	sb.deleteCharAt(i);
}
	}}
	System.out.println(sb);	
	}
}
