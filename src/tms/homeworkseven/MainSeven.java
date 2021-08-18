package tms.homeworkseven;

import java.io.FileNotFoundException;

public class MainSeven {

    public static void main(String[] args) throws FileNotFoundException {
        SymbolCounter counter = new SymbolCounter("D:\\IdeaProjects\\dzone\\src\\tms\\homeworkseven\\file\\message.txt");

        System.out.println(counter.count());

        FileWorker worker = new FileWorker("D:\\IdeaProjects\\dzone\\src\\tms\\homeworkseven\\file");

        worker.writeRandomSequenceToUnsortedFile();
        worker.writeSortedDataFromUnsortedSource();
    }
}
