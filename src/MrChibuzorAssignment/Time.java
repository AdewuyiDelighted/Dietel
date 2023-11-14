package MrChibuzorAssignment;

public class Time {
    private int second;
    private int minute;
    private int hour;
    public Time(int hour,int minute,int seconds){
        validate(hour,minute,seconds);
        this.hour = hour;
        this.minute = minute;
        this.second = seconds;
    }
    public static void validate(int hour,int second,int minute){
        validateHour(hour);
        validateMinute(minute);
        validateSeconds(second);
    }
    private static void validateHour(int hour){
        boolean isInValid = hour > 23 || hour < 0;
        if(isInValid) throw new IllegalArgumentException("Hour invalid");
    }
    private static void validateMinute(int minute){boolean minuteInValid = minute > 59 ||minute < 0;
        if(minuteInValid) throw new IllegalArgumentException("Minute invalid");
    }


    private static void validateSeconds(int seconds){
        boolean secondInValid = seconds > 59 ||seconds < 0;
        if(secondInValid) throw new IllegalArgumentException("Minute seconds");
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }
}

