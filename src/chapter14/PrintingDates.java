package chapter14;

import java.time.*;
import java.util.Arrays;
import java.util.Date;

public class PrintingDates {
    public static void main(String[] args) {
        System.out.println(formatDate("04/25/1995"));
    }
    public static String formatDate(String dateInFormat01011995) {
        validateDate(dateInFormat01011995);
        String formattedDate = "";
        String[] splitedDate = dateInFormat01011995.split("/");
        if (splitedDate.length == 3) {
            Month month = Month.of(Integer.parseInt(splitedDate[0]));
            int date = Integer.parseInt(splitedDate[1]);

            Year year = Year.of(Integer.parseInt(splitedDate[2]));
            formattedDate = String.format("%5s%3s,%5s",month,date,year);
            return formattedDate;
        }
        throw new InvalidDateException("Invalid Date");
    }
    private static void validateDate(String date){
        String regex = "(0[1-9]|1[1,2])\\/(0[1-9]|[12][0-9]|3[01])\\/(19|20)\\d{2}";
        if(!date.matches(regex)) throw new InvalidDateException("Invalid date");

    }
}

