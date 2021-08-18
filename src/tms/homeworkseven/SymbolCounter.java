package tms.homeworkseven;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class SymbolCounter {

    private Scanner reader;

    public SymbolCounter(String path) {
        try {
            reader = new Scanner(new File(path));
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    public HashMap<String, Integer> count() {
        HashMap<String, Integer> result = new HashMap<>();

        while (reader.hasNext()) {
            String line = reader.nextLine();
            for (int i = 0; i < line.length(); ++i) {
                String letter = String.valueOf(line.charAt(i));
                if(letter.charAt(0) == ' ') {
                    letter = "space";
                }
                Integer value = result.get(letter);
                if (value == null) {
                    value = 1;
                } else {
                    value++;
                }
                result.put(letter, value);
            }
        }
        return result;
    }
//    public void countTwo(String file) throws FileNotFoundException {
//        BufferedReader result = new BufferedReader(new InputStreamReader(new FileInputStream(new File(file))));
//        String text = result.lines().collect(Collectors.joining());
//    }

}
