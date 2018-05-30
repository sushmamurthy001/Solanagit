
public class array1 {
public void main1() {
	int  []x=new int[5];
	//above is array initialization
	x[0]=1;
	x[1]=2;
	x[2]=3;
	x[3]=4;
	x[4]=5;
	System.out.println("array length is" + x.length);
for(int i=0;i<x.length;i++) {
	System.out.println(x[i]);
}
	
}
public static void main(String args[]) {
	array1  n = new array1();
	n.main1();
}
}