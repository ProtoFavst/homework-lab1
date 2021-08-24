package homework.friday;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.time.temporal.ChronoUnit.DAYS;

public class BlackFridayService {
    public void printBlackFridayPerYearSorted(int startYear, int endYear) {

      LocalDate startDate = LocalDate.parse(startYear + "-01-01");
      LocalDate endDate = LocalDate.parse( endYear + "-12-31");
       Stream.iterate(startDate, date ->date.plusDays(1)).limit(DAYS.between(startDate, endDate))
              .filter(date -> date.getDayOfMonth()==13)
              .filter(date -> date.getDayOfWeek()== DayOfWeek.FRIDAY)
              .collect(Collectors.groupingBy(date->date.getYear(),Collectors.counting()))
              .entrySet().stream()
              .sorted(Map.Entry.comparingByValue((v1,v2)->v2.compareTo(v1)))
              .forEach(date-> System.out.println(date));

    }

    public static void main(String[] args) {
        BlackFridayService blackFridayService = new BlackFridayService();
        blackFridayService.printBlackFridayPerYearSorted(1900, 2021);
    }
}
