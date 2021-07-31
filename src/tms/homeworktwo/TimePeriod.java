package tms.homeworktwo;

public class TimePeriod {
    public int second;
    public int minutes;
    public int hours;

    public TimePeriod(int second, int minutes, int hours) {
        this.hours = hours;
        this.minutes = minutes;
        this.second = second;
    }

    public TimePeriod(int fullSeconds) {
        hours = fullSeconds / 3600;
        minutes = (fullSeconds % 3600) / 60;
        second = (fullSeconds % 3600) % 60;
        System.out.println(hours + "_hour; " + minutes + "_minutes; " + second + "_seconds;");
    }

}
