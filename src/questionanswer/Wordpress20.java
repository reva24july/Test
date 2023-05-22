package questionanswer;
	class Testing20{
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Wordpress wp1=new Wordpress();
	wp1.posts=25;
	Wordpress wp2=wp1;
	wp1=null;
	System.out.println("posts="+wp2.posts);
		}
		

}
