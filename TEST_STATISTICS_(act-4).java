import java.util.Scanner;

public class TextStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();

        int characters = text.length();

        int words = text.trim().isEmpty() ? 0 : text.trim().split("\\s+").length;

        int lines = text.isEmpty() ? 0 : 1;

        System.out.println("\nTEXT STATISTICS");
        System.out.println("Characters : " + characters);
        System.out.println("Words      : " + words);
        System.out.println("Lines      : " + lines);

        sc.close();
    }
}