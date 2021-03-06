package program4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import static java.time.temporal.TemporalAdjusters.*;

import java.awt.SecondaryLoop;

public class ForEachExample {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1 , "Priya" , "CHN" , 10000));
		list.add(new Employee(2 , "Sanju" , "BLR" , 15000));
		list.add(new Employee(3 , "Divya" , "HYD" , 12000));
		
		System.out.println("---------------------- Employee details before sorting ------------------------------");
		System.out.println("Employee Id\t\tEmployee Name\t\tAddress\t\t\tSalary");
		list.forEach(x -> System.out.println(x.getEmpId()+ "\t\t\t" + x.getEmpName() + "\t\t\t"+ x.getAddress() + "\t\t\t"+x.getSalary()));
		
		Collections.sort(list , Employee::compareBySal);
	
		System.out.println("---------------------- Employee details after sorting by salary ----------------------");
		System.out.println("Employee Id\t\tEmployee Name\t\tAddress\t\t\tSalary");
		list.forEach(x -> System.out.println(x.getEmpId()+ "\t\t\t" + x.getEmpName() + "\t\t\t"+ x.getAddress() + "\t\t\t"+x.getSalary()));
	}
}
