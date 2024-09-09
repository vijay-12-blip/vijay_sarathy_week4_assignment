package week4;

public class ExceptionHandlingExample 
{
	// Method that may throw various exceptions
	public static void riskyMethod(int divisor, String str) throws CustomException 
	{
		// Example of handling ArithmeticException
		try {
			int result = 10 / divisor;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Caught an ArithmeticException: " + e.getMessage());
		}

		// Example of handling NullPointerException
		try {
			int length = str.length(); // This may throw NullPointerException if str is null
			System.out.println("Length of string: " + length);
		} catch (NullPointerException e) {
			System.out.println("Caught a NullPointerException: " + e.getMessage());
		}

		// Example of throwing and handling a custom exception
		if (str == null) {
			throw new CustomException("CustomException: String cannot be null");
		}
	}

	public static void main(String[] args) {
		try {
			// Call riskyMethod with various inputs to test exception handling
			riskyMethod(0, null); // This will trigger ArithmeticException and NullPointerException
		} catch (CustomException e) {
			System.out.println("Caught a CustomException: " + e.getMessage());
		}
	}
}
