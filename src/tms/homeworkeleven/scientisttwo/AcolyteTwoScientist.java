package tms.homeworkeleven.scientisttwo;

import tms.homeworkeleven.dump.FabricDump;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class AcolyteTwoScientist extends Thread {

    public static final String ACOLYTE_TWO = "ACOLYTE_TWO";
    private static final List<String> basketAcolyteTwo = new LinkedList<>();
    private static boolean runOnce = true;

    @Override
    public void run() {
        if (runOnce) {
            Thread.currentThread().setName(ACOLYTE_TWO);
            runOnce = false;
        }
        for (int i = 0; i < Math.round(Math.random() * 3); i++) {
            basketAcolyteTwo.add(FabricDump.dumpGet());
        }
//        System.out.println(ACOLYTE_TWO);
        System.out.println("basketAcolyteTwo: " + basketAcolyteTwo);
    }
}
