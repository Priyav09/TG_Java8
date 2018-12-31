package program5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class CalculateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate now = LocalDate.now(); 
		LocalDate SecondSunday = now.with(TemporalAdjusters.firstDayOfNextMonth()).with(TemporalAdjusters.next(DayOfWeek.SUNDAY)).with(TemporalAdjusters.next(DayOfWeek.SUNDAY));;
		System.out.println(SecondSunday);
	}
}
