package practice;

public class Usermaincode1 {
public static void validatenumber(String s) {

	String str=new String(s);
		if(str.charAt(3)=='-' &&str.charAt(7)=='-') {
			if(str.charAt(0)>=0 &&str.charAt(0)<=9)	{
				if(str.charAt(1)>=0 &&str.charAt(1)<=9)	{
					if(str.charAt(2)>=0 &&str.charAt(2)<=9)	{
						if(str.charAt(4)>=0 &&str.charAt(4)<=9)	{	
							if(str.charAt(5)>=0 &&str.charAt(5)<=9)	{
								if(str.charAt(6)>=0 &&str.charAt(6)<=9)	{
									if(str.charAt(8)>=0 &&str.charAt(8)<=9)	{
										if(str.charAt(9)>=0 &&str.charAt(9)<=9)	{
											if(str.charAt(10)>=0 &&str.charAt(10)<=9)	{
												if(str.charAt(11)>=0 && str.charAt(11)<=9) {
												System.out.println("The number is valid");
											}}}}}}}}}}}
	

						
	
	
}


}
