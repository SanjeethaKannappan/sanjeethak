public class VowelOrConsonants {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the character");
		char ch = s.next().charAt(0);
		switch (ch) {
		case 'a':
			System.out.println("The given character " + ch + " is vowel");
			break;

		case 'e':
			System.out.println("The given character " + ch + " is vowel");
			break;

		case 'i':
			System.out.println("The given character " + ch + " is vowel");
			break;

		case 'o':
			System.out.println("The given character " + ch + " is vowel");
			break;

		case 'u':
			System.out.println("The given character " + ch + " is vowel");
			break;

		default:
			System.out.println("The given character " + ch + " is consonant");
			break;
		}

	}
}
