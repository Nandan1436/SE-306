package Exception;

import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {
	public static int quotient(int numerator,int denominator) 
	throws ArithmeticException{
		return numerator/denominator;
	}
}
