package interviewAutomation;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String arr[]= {"java","aaa","son","cat"	,"java"};
LinkedHashSet<String> set=new LinkedHashSet<String>();
for(String str:arr)
{
	set.add(str);
}
System.out.println(set);
	}


}
