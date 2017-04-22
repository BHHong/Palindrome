import java.util.Stack;

public class Palindrome {

	// simple and efficient, up to 0.5n comparison
	public static boolean isPalindrome(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

	// using stack, up to 0.5n comparisons but with overhead of n stack operations
	public static boolean isPalindrome2(String str) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length() / 2; i++) {
			stack.push(str.charAt(i));
		}
		int j = str.length()/2;
		if (str.length() % 2 != 0) {
			j++;
		}
		for (int i = j; i < str.length(); i++) {
			if (stack.pop() != str.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "live on no evil";
		String str2 = "noon";
		System.out.println("Using simple and efficient in place comparison");
		System.out.println('"'+str + '"'+ " is a Palindrome? " + isPalindrome(str));
		System.out.println('"'+str2 + '"'+ " is a Palindrome? " + isPalindrome(str2));
		System.out.println("Using stack structure");
		System.out.println('"'+str + '"'+ " is a Palindrome? " + isPalindrome2(str));
		System.out.println('"'+str2 + '"'+ " is a Palindrome? " + isPalindrome2(str2));
	}

}
