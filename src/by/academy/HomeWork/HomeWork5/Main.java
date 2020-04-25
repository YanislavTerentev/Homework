package by.academy.HomeWork.HomeWork5;

import java.nio.file.Files;
import java.nio.file.Paths;


public class Main {
    private static char[] chars = ";-:)(!?./,'\"".toCharArray();

    public static void main(String[] args) throws Exception {
        String data = readFileAsString("C:\\Users\\User\\IdeaProjects\\Война и мир.txt");
        data = replaceAllChars(data, chars);
        String[] words = data.toLowerCase().split("\\s+");

        SearchWord search = new SearchWord();
        String result = search.search("слово война встречается", words ) + search.search("и", words)
                + search.search("мир", words);
        System.out.println(result);

    }

    public static String readFileAsString(String fileName) throws Exception {
        String data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    public static String replaceAllChars(String str, char[] chars) {
        for (char aChar : chars) {
            while (str.indexOf(aChar) > -1) {
                str = str.replace(String.valueOf(aChar), " ");
            }
        }
        return str;
    }
}
