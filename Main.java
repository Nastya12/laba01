package haupt;

public class Main {
	public static void main(String[] args)
	{
		int mas1[]={1, 2, 3};
		int mas2[]={1, 1, 4};
		ContinuedFraction objectOne=new ContinuedFraction(mas1);
		ContinuedFraction objectSecond=new ContinuedFraction(mas2);
		
		System.out.println();
		System.out.println("Addition two continued fraction: ");
		System.out.println("coefficients the result continued fraction: " + objectOne.addition(objectSecond));
		
		System.out.println();
		System.out.println("Subtraction two continued fraction: ");
		System.out.println("coefficients the result continued fraction: " + objectOne.subtraction(objectSecond));
		
		System.out.println();
		System.out.println("Multiplication two continued fraction: ");
		System.out.println("coefficients the result continued fraction: " + objectOne.multiplication(objectSecond));
		
		System.out.println();
		System.out.println("Division two continued fraction: ");
		System.out.println("coefficients the result continued fraction: " + objectOne.division(objectSecond));
	}

}
