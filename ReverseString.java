
public class ReverseString {
	
	public static void main(String[] args) {
		
		String reverseString = reverse("java");
		System.out.println("String is now  -> " + reverseString);
	}
	
	public static String reverse(String str) {
		
		char[] letters = new char[str.length()];
		int index = 0;
		for (int i =str.length() - 1; i >= 0; i--) {
			letters[index] = str.charAt(i);
			index++;
		}
		
		String reverseString = "";
		for (int i = 0; i < str.length(); i++) {
			reverseString = reverseString + letters[i];
		}
		System.out.println("Before reverse -> " + str);
		return reverseString;
	}
}
