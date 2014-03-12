package haupt;

@SuppressWarnings("unused")
class ContinuedFraction {
	private double denominator, valueFraction;
	private static int []arr=new int [256];
	ContinuedFraction()
	{
		denominator=0;
		valueFraction=0;	
	}
		
	public static void showArr(int [] array)
	{
		arr=array;
		System.out.print("Array of coefficient for fraction = ");
		for(int i=0;i<arr.length;i++){
			System.out.print( " " + arr[i]);
		}
	}
	
	private double calculationFraction(int []arr)
	{
		valueFraction=arr[arr.length];
		for(int i=arr.length;i>arr.length; i--){
			denominator=arr[arr.length-1]+1/valueFraction;
			valueFraction=denominator;
		}
		return valueFraction;
	}
	
	private static void convertToContinuedFraction (double number)
	{
		int []mas=new int[256];
		double []x=new double [256];
		mas[0]=(int) Math.rint(number);
		x[0]=number-mas[0];
		for(int i=1; i<256; i++)
		{
			mas[i]=(int) Math.rint(1/x[i-1]);
			x[i]=(int)((1/x[i-1])-mas[i]);
		}
		if (mas[256] != 0)
		{
			System.out.println(" Fraction is infinite. ");
		}
		else showArr(mas);
	}
	
	@SuppressWarnings("null")
	public static void addition (int []mas1, int []mas2)
	{
		ContinuedFraction objOne = null, objSecond = null;
		double objectOne, objectSecond, additionDouble;
		objectOne=objOne.calculationFraction(mas1);
		objectSecond=objSecond.calculationFraction(mas2);
		additionDouble=objectOne+objectSecond;
		convertToContinuedFraction(additionDouble);
	}
	
	@SuppressWarnings("null")
	public static void subtraction (int []mas1, int []mas2)
	{
		ContinuedFraction objOne = null, objSecond = null;
		double objectOne, objectSecond, subtractionDouble;
		objectOne=objOne.calculationFraction(mas1);
		objectSecond=objSecond.calculationFraction(mas2);
		subtractionDouble=objectOne-objectSecond;
		convertToContinuedFraction(subtractionDouble);
	}
	
	@SuppressWarnings("null")
	public static void multiplication (int []mas1, int []mas2)
	{
		ContinuedFraction objOne = null, objSecond = null;
		double objectOne, objectSecond, multiplicationDouble;
		objectOne=objOne.calculationFraction(mas1);
		objectSecond=objSecond.calculationFraction(mas2);
		multiplicationDouble=objectOne-objectSecond;
		convertToContinuedFraction(multiplicationDouble);
	}

	@SuppressWarnings("null")
	public static void division (int []mas1, int []mas2)
	{
		ContinuedFraction objOne = null, objSecond = null;
		double objectOne, objectSecond, divisionDouble;
		objectOne=objOne.calculationFraction(mas1);
		objectSecond=objSecond.calculationFraction(mas2);
		divisionDouble=objectOne-objectSecond;
		convertToContinuedFraction(divisionDouble);
	}
	
	public static class Calculation{
		public static void main(String[] args)
		{
			int mas1[]={1, 2, 3};
			int mas2[]={1, 1, 4};
			
			System.out.println("Coefficients the first continued fraction: " );
			showArr(mas1);System.out.println();
			System.out.println("Coefficients the second continued fraction: ");
			showArr(mas2);System.out.println();
			System.out.println();
			System.out.println("Addition two continued fraction: ");
			System.out.println("coefficients the result continued fraction: ");
			addition(mas1,mas2);
			
			System.out.println();
			System.out.println("Subtraction two continued fraction: ");
			System.out.println("coefficients the result continued fraction: ");
			subtraction(mas1,mas2);
			
			System.out.println();
			System.out.println("Multiplication two continued fraction: ");
			System.out.println("coefficients the result continued fraction: ");
			multiplication(mas1,mas2);
			
			System.out.println();
			System.out.println("Division two continued fraction: ");
			System.out.println("coefficients the result continued fraction: ");
			division(mas1,mas2);
		}

	}

}


