public class LeapYearOrNot {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the year");
		int Year=s.nextInt();
		if(Year % 4 == 0){
			System.out.println( " The Given Year Is Leap Year");
		}
		else{
			System.out.println("The Given Year Is Not a Leap Year");
		}

	}

}
