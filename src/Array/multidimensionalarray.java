package Array;

public class multidimensionalarray {
	public static void main(String[] args) {
int marks[][]=new int[2][3];
int i,j;
marks[0][0]=101;
marks[0][1]=102;
marks[0][2]=103;
marks[1][0]=201;
marks[1][1]=202;
marks[1][2]=203;
for(i=0;i<2;i++) {

	for(j=0;j<3;j++) {
		System.out.print(marks[i][j]);
		System.out.print(" ");
	}System.out.println(" ");
}
}
}