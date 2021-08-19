package homework.lab4.dateUtils;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtils {
   public void dateToString(LocalDateTime date){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy+MM+dd 'по времени' HH+mm+ss");
        System.out.println(dateFormat.format(date));

    }
    public void stringTodate(String str){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy+MM+dd 'по времени' HH+mm+ss");
        System.out.println(LocalDateTime.parse(str, formatter));

    }

}
