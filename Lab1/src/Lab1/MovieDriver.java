package Lab1;
import java.util.*;

public class MovieDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Movie movie = new Movie();
		String title, rating;
		int soldTickets;
		String answer;
		do
		{
			System.out.println("Please enter, the title of your movie");
			title = sc.nextLine();
			movie.setTitle(title);
			System.out.println("Please enter, the rating of your movie");
			rating = sc.nextLine();
			movie.setRating(rating);
			System.out.println("Please enter, the number of tickets sold");
			soldTickets = sc.nextInt();
			sc.nextLine();
			movie.setSoldTickets(soldTickets);
			System.out.println(movie.toString());
			System.out.println("Do you want to continue: Y or N ?");
			answer = sc.nextLine();
			System.out.println();
		}while(answer.equalsIgnoreCase("y"));
	}
}
