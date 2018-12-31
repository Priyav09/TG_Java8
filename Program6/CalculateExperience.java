package program6;

import java.time.*;
import java.time.temporal.*;

public class CalculateExperience {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate now = LocalDate.now();
		LocalDate DOJ = LocalDate.of(2015 , 6 , 8);
		
		Period p = Period.between(DOJ,now);
		System.out.println("Experience in Wipro : "+ p.getYears()+ " years and " + p.getMonths() + " months and " + p.getDays() + " days");
	}
}
