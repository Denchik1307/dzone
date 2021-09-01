package tms.homeworkeleven.scientistone;

import tms.homeworkeleven.dump.FabricDump;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AcolyteOneScientist extends Thread {

    public static final String ACOLYTE_ONE = "ACOLYTE_ONE";
    private static final List<String> basketAcolyteOne = new LinkedList<>();
    private static boolean runOnce = true;

    @Override
    public void run() {
        if (runOnce) {
            Thread.currentThread().setName(ACOLYTE_ONE);
            runOnce = false;
        }
        for (int i = 0; i < Math.round(Math.random() * 3); i++) {
            basketAcolyteOne.add(FabricDump.dumpGet());
        }
//        System.out.println(ACOLYTE_ONE);
        System.out.println("basketAcolyteOne: " + basketAcolyteOne);
    }
}