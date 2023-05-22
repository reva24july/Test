package interviewAutomation;

import java.util.HashMap;

public class DuplicateStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String str="java is programming language java";
String arr[]= {"revathi","siva","siva","revathi","aadhvik"};
HashMap<String,Integer> map=new HashMap<String,Integer>();
for(String s:arr) {
	

if(map.containsKey(s)) {
map.put(s, map.get(s)+1);
	}
else {
	map.put(s,1);
	
}

}System.out.println(map);
}}
