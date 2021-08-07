package tms.homeworkfour;

public final class CheckPalindromString {

    private final String textToChek;

    public CheckPalindromString(String textToChek) {
        this.textToChek = textToChek;
    }

    public boolean palindromBuilder(String textToChek) {
        String textForCheck = textToChek.replace(" ", "").toLowerCase();
        StringBuilder text = new StringBuilder(textForCheck);
        StringBuilder reversText = text.reverse();
        return (reversText.toString()).equals(textForCheck);
    }
}
