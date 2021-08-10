package tms.homeworkfour;

public final class RomeToArabNumber {
    private int val = 0;
    private int val_next = 0;
    private int temp = 0;
    private int result = 0;

    public int romeToArabNumber(String roman){
        roman = roman.toUpperCase();
        for (int i = 0; i < roman.length(); i++) {
            val = converter(roman.charAt(i));
            if (i < roman.length() - 1) {
                val_next = converter(roman.charAt(i + 1));
            } else val_next = 0;


            if (val_next == 0) {
                temp = val;
            } else {
                if (val > val_next) temp = val;
                else if (val < val_next) {
                    temp = val_next - val;
                    i++;
                } else {
                    temp = val;
                }
            }
            result += temp;
        }
        return result;
    }

    private int converter(char val) {
        int a = 0;
        switch (val) {
            case 'M':
                a = 1000;
                break;
            case 'D':
                a = 500;
                break;
            case 'C':
                a = 100;
                break;
            case 'L':
                a = 50;
                break;
            case 'X':
                a = 10;
                break;
            case 'V':
                a = 5;
                break;
            case 'I':
                a = 1;
                break;
            default:
        }
        return a;
    }
}