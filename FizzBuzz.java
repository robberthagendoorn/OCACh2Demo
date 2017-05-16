public class FizzBuzz {
	
	private void ifElse (int n) {
		for (int i = 1; i < n; i++) {
			String line;
			if (i % 3 == 0) {
				line = (i % 5 == 0) ? "FizzBuzz" : "Fizz";
			} else if (i % 5 == 0) {
				line = "Buzz";
			} else {
				line = Integer.toString(i);
			}
			System.out.println(line);
		}
	}
	
	private void ternary (int n) {
		for (int i = 1; i <= n; i++) {
			// This is just for fun, don't do it like this
			String line = i % 3 == 0 ? i % 5 == 0 ? "FizzBuzz" : "Fizz" : i % 5 == 0 ? "Buzz" : Integer.toString(i);
			System.out.println(line);
		}
	}
	
	public static void main (String[] args) {
		// Would add exception handling here but haven't reached this chapter yet
		int n = Integer.parseInt(args[0]);
		FizzBuzz fb = new FizzBuzz();
		fb.ternary(n);
	}
}