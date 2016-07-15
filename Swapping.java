public class Swapping {


	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers"); 
       int n1=s.nextInt();
		int n2=s.nextInt();
		System.out.println("before swapping " + n1+" \t" +n2);
		int temp;
		temp=n2;
		n2=n1;
		n1=temp;
		System.out.println("after swapping" + n1 +"\t"+n2);
	    s.close();

	}

}
