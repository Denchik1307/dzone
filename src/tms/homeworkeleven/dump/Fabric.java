package tms.homeworkeleven.dump;

import tms.homeworkeleven.utils.RandomUtil;

public class Fabric extends Thread {

    public static final String HEAD = "Head";
    public static final String BODY = "Body";
    public static final String LEFT_HAND = "LeftHand";
    public static final String RIGHT_HAND = "RightHand";
    public static final String LEFT_LEG = "LeftLeg";
    public static final String RIGHT_LEG = "RightLeg";
    public static final String PROCESSOR = "Processor";
    public static final String MEMORY = "Memory";
    public static final String HARD_MEMORY = "HardMemory";
    public static final String FABRIC = "Fabric";
    private static boolean onceRun = true;
    private static String partsToDropForDump = "";

    public static void fillDump() {
        while (FabricDump.dump.size() < 1) {
            FabricDump.dump.add(randomPart());
        }
    }

    private static String randomPart() {
        switch (RandomUtil.RandomNumber(8)) {
            case 0 -> partsToDropForDump = HEAD;
            case 1 -> partsToDropForDump = BODY;
            case 2 -> partsToDropForDump = LEFT_HAND;
            case 3 -> partsToDropForDump = RIGHT_HAND;
            case 4 -> partsToDropForDump = LEFT_LEG;
            case 5 -> partsToDropForDump = RIGHT_LEG;
            case 6 -> partsToDropForDump = PROCESSOR;
            case 7 -> partsToDropForDump = MEMORY;
            case 8 -> partsToDropForDump = HARD_MEMORY;
        }
        return partsToDropForDump;
    }

    private static void partsToDropForDump() {
        for (int i = 0; i <= RandomUtil.RandomNumber(1); i++) {
            FabricDump.dumpSet(randomPart());
        }
    }

    @Override
    public void run() {
        if (onceRun) {
            Thread.currentThread().setName(FABRIC);
            onceRun = false;
        }
        partsToDropForDump();
    }
}

