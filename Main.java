import java.util.Scanner;

public class Main {

   public static void main(String []args) {
      System.out.println("🗽 Welcome to the NYC Recommendation Bot!");

		Scanner scan = new Scanner(System.in);
		System.out.print("Is it raining? (y/n): ");
		String rainInput = scan.nextLine().toLowerCase();

		System.out.print("Is it cold? (y/n): ");
		String coldInput = scan.nextLine().toLowerCase();

		System.out.print("Do you prefer indoor activities? (y/n): ");
		String indoorPreference = scan.nextLine().toLowerCase();

		String recommendedPlace = "";

		if (rainInput.equals("y") && coldInput.equals("y")) {
			recommendedPlace = "Metropolitan Museum of Art";
			System.out.println("It's cold and rainy. You might want to visit the " + recommendedPlace + ".");
		} 
		else if (rainInput.equals("y") && indoorPreference.equals("n")) {
			recommendedPlace = "High Line";
			System.out.println("It's raining, but if you still want outdoor activities, consider visiting the " + recommendedPlace + " (bring an umbrella ☂️).");
		} 
		else if (rainInput.equals("n") && coldInput.equals("y") && indoorPreference.equals("y")) {
			recommendedPlace = "New York Public Library";
			System.out.println("It's cold outside. You might want to explore the " + recommendedPlace + ".");
		} 
		else if (rainInput.equals("n") && coldInput.equals("n")) {
			recommendedPlace = "Central Park";
			System.out.println("It's a great day! Consider having a picnic in " + recommendedPlace + " or taking the Roosevelt Island Tramway for a nice view.");
		} 
		else {
			recommendedPlace = "West Side Cow Tunnels";
			System.out.println("Idk what to tell you. Maybe see if you can access the " + recommendedPlace + " near 12th avenue?");
		}

		double estimatedFare = estimateCabFare(recommendedPlace);
		System.out.println("Estimated cab fare to " + recommendedPlace + ": $" + estimatedFare);

		scan.close();
   }

   // METHOD
	public static double estimateCabFare(String destination) {
		double baseFare = 2.50;
		double farePerMile;

		if (destination.equals("Central Park")) {
			farePerMile = 5;
		} 
		else if (destination.equals("Metropolitan Museum of Art") || destination.equals("New York Public Library") || destination.equals("High Line")) {
			farePerMile = 7;
		} 
		else if (destination.equals("Statue of Liberty") || destination.equals("Times Square") || destination.equals("Brooklyn Bridge")) {
			farePerMile = 10;
		} 
		else {
			farePerMile = 6;  // Default fare 
		}

		// Assuming a fixed distance of 2 miles for simplicity
		return baseFare + (2 * farePerMile);
	}
}
