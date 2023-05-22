package interviewAutomation;

import java.util.HashMap;

public class OccurenceOfCharecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Beaut ifulsbea";
		char[] arr=str.toCharArray();
HashMap<Character,Integer> map=new HashMap<Character,Integer>();
for(char c:arr) {
	if(map.containsKey(c)) {
		map.put(c,map.get(c)+1);
	}else {
		map.put(c, 1);
		
	}}
	System.out.println(map);

	}

}
