package collections;

import java.util.HashMap;

public class RepeatingWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Learn java with Selenium Automation java";
String arr[]=s.split(" ");
HashMap<String,Integer> map=new HashMap<String,Integer>();
for(int i=0;i<arr.length;i++) {
	if(map.containsKey(arr[i])) {
		map.put(arr[i], map.get((arr[i])+1));
		}
		else
		{
			map.put(arr[i],1);
			}}
System.out.println(map);
	}
		
	

	}


