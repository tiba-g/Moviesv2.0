package movies;

public class IdGenerator
{
	static int movCounter;
	static int gamCounter;
	static int booCounter;
	
	public static String generate(Product product)
	{
		String result = null; 
		if(product instanceof Movie)
		{
			result = "MOV" + ++movCounter;
		}
		else if(product instanceof Game)
		{
			result = "GAM" + ++gamCounter;
		}
		else if(product instanceof Book)
		{
			result = "BOO" + ++booCounter;
		}
		return result;
	}
}
