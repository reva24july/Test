package interviewAutomation;

public class ReverseSentenceWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Java is a programming Lang";
		//String arr[]=str.split(" ");
		char arr[]=str.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
			
		}
	}

}
