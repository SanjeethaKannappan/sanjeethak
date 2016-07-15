public class EvenOdd {

	
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the numbers");
	int number=s.nextInt();
	if(number==0){
		System.out.println("the number is zero");
	}
	else if(number%2==1){
		System.out.println("the number is odd");
	}
	
	else{
		System.out.println("the number is even");
		}
	s.close();
	}
	}
