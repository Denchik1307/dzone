package tms.homeworkfour;

public class Main {

    public static void main(String[] args) {
        CheckPalindromString text = new CheckPalindromString("");
        System.out.println(text.palindromBuilder("D321 1 2 3d"));

        //System.out.println(RomeToArabNumber("XMD"));
        RomeToArabNumber numberArab = new RomeToArabNumber();
        System.out.println(numberArab.romeToArabNumber("mix"));
    }
}
