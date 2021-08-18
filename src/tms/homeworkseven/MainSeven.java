package tms.homeworkseven;

import java.io.FileNotFoundException;

public class MainSeven {

    public static void main(String[] args) throws FileNotFoundException {

        SymbolCounter counter = new SymbolCounter("sours/file/message.txt");
        System.out.println(counter.count());

        FileWorker worker = new FileWorker("sours/file");

        worker.writeRandomSequenceToUnsortedFile();
        worker.writeSortedDataFromUnsortedSource();
    }
}
