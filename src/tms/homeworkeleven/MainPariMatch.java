package tms.homeworkeleven;

import tms.homeworkeleven.dump.Fabric;
import tms.homeworkeleven.scientistone.AcolyteOneScientist;
import tms.homeworkeleven.scientisttwo.AcolyteTwoScientist;

public class MainPariMatch {

    public static void main(String[] args) {

        Fabric.fillDump();

        Thread fabric = new Fabric();
        fabric.start();

        Thread acolyteOne = new AcolyteOneScientist();
        acolyteOne.start();

        Thread acolyteTwo = new AcolyteTwoScientist();
        acolyteTwo.start();
    }
}
