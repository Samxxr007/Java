import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Paragraph:");
        String paragraph = sc.nextLine();

        String[] words = paragraph.toLowerCase().split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        System.out.println("Word Frequency:");

        for (String word : map.keySet()) {
            System.out.println(word + " : " + map.get(word));
        }

        sc.close();
    }
}