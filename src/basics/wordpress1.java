package basics;

public class wordpress1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Woordpress wp1=new Woordpress();
wp1.posts=25;
Woordpress wp2=wp1;
wp1=null;
System.out.println("posts:"+wp2.posts);
System.out.println("posts:"+wp1.posts);
	}

}
