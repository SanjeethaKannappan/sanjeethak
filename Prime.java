public class Prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int n=s.nextInt();
		int flag=0;
		for(int i=2;i<=n;i++){
		if(n%i==0)
		{
			flag=1;
		}
		}
		if(flag==0){
			System.out.println("the given number is prime");
		}
		else
		{
			System.out.println("the given number is not prime");
		}
		s.close();
	}

}
