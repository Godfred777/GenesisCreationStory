import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreationStory creationStory = new CreationStory();
        creationStory.getStories();
        System.out.println("Enter the day you want to know");
        int day = scanner.nextInt();
        System.out.println(creationStory.getStoryAtIndex(day));
    }
}