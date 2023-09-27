package ChapterThree;

public class Clock {

    private int hour;
    private int minute;
    private int second;

    private String setTime;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public void setHour(int hours) {
        if (hours <= 23) {
            this.hour = hours;
        } else {
            hour = 0;
        }

    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minutes) {
        if (minutes <= 59) {
            this.minute = minutes;
        } else {
            minute = 0;
        }
    }

    public int getMinute() {
        return minute;

    }

    public void setSecond(int seconds) {
        if (seconds <= 59) {
            this.second = seconds;
        } else {
            second = 0;
        }


    }

    public int getSecond() {
        return second;
    }
    public void setDisplayTime() {
        this.setTime = hour + ":" + minute + ":" + second;

    }
    public String getDisplayTime() {
        return setTime;

    }
}
