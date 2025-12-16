package practiceprogram;

public class Amazon
{
	static  void submit() throws AmazonException
	{
		int amt=4500;
		if(amt>=5000)
		{
			System.out.println("Discount are applied");
		}
		else
		{
			throw new AmazonException("Pantu illa chaddinu illa");
		}
		}
	public static void main(String[] args)
	{
		try {
			submit();
		}
		catch(AmazonException e)
		{
			System.out.println(e.get());
		}
	}
}
class AmazonException extends Exception
{
	String msg;
	AmazonException(String msg)
	{
		this.msg=msg;
	}
	public String get()
	{
		return msg;
	}
}
		
		

		

	


