import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class ActivityGen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        List<String> categories = new ArrayList<>();
        categories.add("exercise");
        categories.add("work");
        categories.add("play");
        categories.add("read");

        Map<String, String> bookRecommendations = new HashMap<>();
        bookRecommendations.put("mystery", "The Hound of the Baskervilles by Arthur Conan Doyle");
        bookRecommendations.put("science fiction", "Dune by Frank Herbert");
        bookRecommendations.put("fantasy", "The Hobbit by J.R.R. Tolkien");
        // Add more genres and recommendations as needed

        String selectedCategory = categories.get(random.nextInt(categories.size()));
        System.out.println("Selected category: " + selectedCategory);

        if (selectedCategory.equals("exercise")) {
            String exerciseType;
            do {
                System.out.println("Choose a type of exercise: arms, legs, or cardio");
                exerciseType = scanner.nextLine().trim().toLowerCase();

                switch (exerciseType) {
                    case "arms":
                        System.out.println("Do 20 pushups");
                        break;
                    case "legs":
                        System.out.println("Do 25 squats");
                        break;
                    case "cardio":
                        System.out.println("Go for a 10 minute walk");
                        break;
                    default:
                        System.out.println("Invalid exercise type. Please try again.");
                }
            } while (!exerciseType.equals("arms") && !exerciseType.equals("legs") && !exerciseType.equals("cardio"));
        } else if (selectedCategory.equals("work")) {
            System.out.println("Do 30 minutes of work and then spin again :)");
        } else if (selectedCategory.equals("play")) {
            System.out.println("Relax for 15 minutes and spin again!");
        } else if (selectedCategory.equals("read")) {
            String genre;
            do {
                System.out.println("What genre of book would you like to read mystery, science fiction, fantasy");
                genre = scanner.nextLine().trim().toLowerCase();

                if (bookRecommendations.containsKey(genre)) {
                    System.out.println("Recommended book: " + bookRecommendations.get(genre));
                } else {
                    System.out.println("No recommendations available for this genre. Please try again.");
                }
            } while (!bookRecommendations.containsKey(genre));
        } else {
            System.out.println("Invalid category");
        }

        scanner.close();
    }
}
