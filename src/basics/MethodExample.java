package basics;

public class MethodExample {


	    public static void main(String[] args) {

	        MethodExample methodExample=new MethodExample();//creation of object
	        methodExample.method();//non static method using object
	        System.out.println(method3());
	        System.out.println(MethodExample.method3());
	        //Classname.member.
	    }

	    void method(){//non static method
	    System.out.println(method1());
	    method3();
	    }


	    int method1(){


	        return 0;
	    }

	    static String method3(){

	        return null;
	    }
	}

