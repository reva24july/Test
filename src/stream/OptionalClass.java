package stream;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] s=new String[5];
s[3]="REVATHI";
Optional<String> checknull=Optional.ofNullable(s[3]);
if(checknull.isPresent()) {
	String lowercase=s[3].toLowerCase();
	System.out.println(lowercase);

}else {
	System.out.println("String value is not present");
}
	}

}
