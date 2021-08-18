package tms.homeworkseven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileWorker {
    private File unsortedFile;
    private File sortedFile;

    public FileWorker(String path) {
        unsortedFile = new File(new StringBuilder(path).append("/unsorted.txt").toString());
        sortedFile = new File(new StringBuilder(path).append("/sorted.txt").toString());

        try {
            unsortedFile.createNewFile();
            sortedFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeRandomSequenceToUnsortedFile() {
        try {
            FileWriter writer = new FileWriter(unsortedFile);

            for (int i = 0; i < 10; ++i) {
                writer.write(String.valueOf(Math.round(Math.random() * 100)));
                writer.write('\n');
            }

            writer.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void writeSortedDataFromUnsortedSource() {
        try {
            FileWriter writer = new FileWriter(sortedFile);
            Scanner reader = new Scanner(unsortedFile);

            int length = 0;

            while (reader.hasNext()) {
                reader.nextInt();
                length++;
            }

            int[] array = new int[length];
            int index = 0;

            reader = new Scanner(unsortedFile);

            while (reader.hasNext()) {
                array[index] = reader.nextInt();
                index += 1;
            }

            Arrays.sort(array);

            for(int i =0; i < length; ++i) {
                writer.write(String.valueOf(array[i]));
                writer.write('\n');
            }

            writer.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
