package movies;

import java.util.ArrayList;
import java.util.List;

public class RentManager
{
	public static void main(String[] args)
	{
		  Person ali = new Person("Lakatos", "Ali", Gender.MALE, 1000);

		  Person kisErno = new Person("Kis", "Erno", Gender.FEMALE, 1100);

		  List<Person> renter = new ArrayList<Person>();
		  renter.add(ali);
		  renter.add(kisErno);

		  // AUTHORS
		  Person miki = new Person("Miki", "Endre", Gender.MALE, 1600);

		  Person tuskes = new Person("Tuskes", "Laura", Gender.MALE, 1800);

		  // ACTORS
		  Person kisMiska = new Person("Kis", "Miska", Gender.MALE, 1100);

		  Person nagyAladar = new Person("Nagy", "Aladar", Gender.MALE, 1200);

		  // BOOKS
		  Book uk = new Book("Ures Konyv", ali, miki);

		  Book konyv = new Book("konyv", ali, tuskes);

		  // MOVIE
		  
		  List<Person> cast = new ArrayList<Person>();
		  cast.add(nagyAladar);
		  cast.add(kisMiska);
		  
		  Movie m1 = new Movie("Film", kisErno, Genre.ACTION, 211, 8.9, cast, 1000);

		  Movie m2 = new Movie("FILM 2", ali, Genre.ACTION, 132, 6.7, cast, 1200);

		  // GAMES
		  List<Person> staff = new ArrayList<Person>();
		  staff.add(ali);
		  staff.add(kisErno);
		  
		  Game lol = new Game("LOL", ali, false, staff , 10000);

		  Game wow = new Game("wow", ali, true, staff , 15000);

		  List<Buyable> buy = new ArrayList<Buyable>();
		  buy.add(m1);
		  buy.add(m2);
		  buy.add(lol);
		  buy.add(wow);
		  
		  System.out.println(uk.getInvenstment());
		  System.out.println(konyv.getInvenstment());
		  System.out.println(m1.getInvenstment());
		  System.out.println(m2.getInvenstment());
		  System.out.println(lol.getInvenstment());
		  System.out.println(wow.getInvenstment());
		  
		  System.out.println(totalIncome(buy));
	}
		
	public static long totalIncome(List<Buyable> buy)
	{
		long sum = 0;
		for (Buyable buyable : buy) {
			sum += buyable.getPrice();
		}
		return sum;
	}
}
