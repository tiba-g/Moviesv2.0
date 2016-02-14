package movies;

public class Book extends Product 
{
	Person author;

	public Book(String title, Person person, Person author)
	{
		super(title, person);
		this.author = author;
	}

	@Override
	public long getInvenstment() {
		return author.salary;
	}
	
	
	
}
