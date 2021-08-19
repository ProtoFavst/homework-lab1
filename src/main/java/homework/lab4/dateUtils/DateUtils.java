package homework.lab4.dateUtils;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtils {
    public void dateToString(Date date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy+MM+dd 'по времени' HH+mm+ss");
        System.out.println(dateFormat.format(date));

    }
    public void stringTodate(String str){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy+MM+dd 'по времени' HH+mm+ss");
        LocalDateTime ldt = LocalDateTime.parse(str, formatter);
        ZonedDateTime zdt = ldt.atZone(ZoneId.systemDefault());
        Date date = new Date(zdt.toInstant().toEpochMilli());
        System.out.println(date);

    }

    public static void main(String[] args) {
        DateUtils dateUtils = new DateUtils();
        dateUtils.dateToString(new Date());
        dateUtils.stringTodate("2021+08+19 по времени 15+33+24");
    }
}
