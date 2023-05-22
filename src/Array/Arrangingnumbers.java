package Array;

public class Arrangingnumbers {
public void arrangenum() {
	int num[]= {25,16,35,89,12,56,42};
	System.out.println("length of the array is "+num.length);
	int i,j,a;
	for(i=0;i<num.length ; i++) {
	System.out.print(num[i]);
	System.out.print( " ");
     }	System.out.println(" ");
	for(i=0;i<num.length;i++) {
		for(j=0;j<num.length;j++) {
			if(num[i]<num[j]) {
				a=num[i];
				num[i]=num[j];
				num[j]=a;	
			}
		}
	}
	for(i=0;i<num.length;i++) {
		System.out.println(num[i]);
	}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Arrangingnumbers a=new Arrangingnumbers();
a.arrangenum();
	}
}
