package interviewAutomation;

import java.util.HashMap;

public class OccurenceOFString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,Integer> map=new HashMap<String,Integer>();
String str1="java is a programming Language";
String arr[]=str1.split(" ");
for(String i:arr) {
	if(map.containsKey(arr)) {
		map.put(i,map.get(i)+1);
	}
	else {
		
	map.put(i,1);
}}
System.out.println(map);}}




