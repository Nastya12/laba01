package haupt;

class ContinuedFraction {
	private int []arr=new int [256];
	
	ContinuedFraction(int [] mas)
	{
		for (int i=0;i<mas.length;i++){
			arr[i]=mas[i];
		}
	}
	
	ContinuedFraction(double number)
	{
		double []x=new double [256];
		arr[0]=(int) Math.rint(number);
		x[0]=number-arr[0];
		for(int i=1; i<256; i++)
		{
			arr[i]=(int) Math.rint(1/x[i-1]);
			x[i]=(int)((1/x[i-1])-arr[i]);
		}
	}
	
	public void showArr(int []mas)
	{
		for (int i=0; i<mas.length;i++)
		{
			System.out.println(" " +  mas[i]);
		}
	}
	
	private double calculationFraction()
	{
		double denominator, valueFraction;
		valueFraction=arr[arr.length];
		for(int i=arr.length;i>arr.length; i--){
			denominator=arr[arr.length-1]+1/valueFraction;
			valueFraction=denominator;
		}
		return valueFraction;
	}
	
	public ContinuedFraction addition (ContinuedFraction object)
	{
		double sum = 0;
		sum=this.calculationFraction()+object.calculationFraction();
		ContinuedFraction result=new ContinuedFraction(sum);
		return result;
	}
	
	public ContinuedFraction subtraction (ContinuedFraction object)
	{
		double subt = 0;
		subt=this.calculationFraction()-object.calculationFraction();
		ContinuedFraction result=new ContinuedFraction(subt);
		return result;
		
	}
	
	public ContinuedFraction multiplication (ContinuedFraction object)
	{
		double mult = 0;
		mult=this.calculationFraction()*object.calculationFraction();
		ContinuedFraction result=new ContinuedFraction(mult);
		return result;
		
	}

	public ContinuedFraction division (ContinuedFraction object)
	{
		double div = 0;
		div=this.calculationFraction()/object.calculationFraction();
		ContinuedFraction result=new ContinuedFraction(div);
		return result;
		
	}
}


