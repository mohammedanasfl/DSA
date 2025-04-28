package string;

import java.util.List;

public class ReplaceWords {
    public static void main(String[] args) {
        System.out.println(replaceWords(List.of("cat","bat","rat"), "the cattle was rattled by the battery"));
    }

    private static String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = sentence.split(" ");

        for (String word : words) {
            String replacement = word;
            for (String root : dictionary) {
                if (word.startsWith(root)) {
                    if (root.length() < replacement.length()) {
                        replacement = root;
                    }
                }
            }
            stringBuilder.append(replacement).append(" ");
        }

        return stringBuilder.toString().trim();
    }

}
