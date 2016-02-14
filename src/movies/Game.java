package movies;

import java.util.List;

public class Game extends Product implements Buyable
{
	boolean preOrdered;
	List<Person> staff;
	int price;
	
	public Game(String title, Person person, boolean preOrdered, List<Person> staff, int price) {
		super(title, person);
		this.preOrdered = preOrdered;
		this.staff = staff;
		this.price = price;
	}

	public boolean isPreOrdered() {
		return preOrdered;
	}

	public void setPreOrdered(boolean preOrdered) {
		this.preOrdered = preOrdered;
	}

	public List<Person> getStaff() {
		return staff;
	}

	public void setStaff(List<Person> staff) {
		this.staff = staff;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public long getInvenstment() 
	{
		long sum = 0;
		for (Person person : staff)
		{
			sum += person.salary;
		}
		return (long) (this.preOrdered ? sum : sum * 0.8);
	}
	
	
	
}
