package program7;

import java.util.*;
import java.util.stream.*;

public class countEmptyStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList<String>();
		strList.add("OneFour");
		strList.add("Two");
		strList.add("Three");
		strList.add("");
		strList.add("FiveSix");
		strList.add("Random");
		strList.add("");
		strList.add("Iterate");
		
		
		System.out.println("No. of string whose length greater dhan 5 : " + strList.stream().filter(s -> s.length() > 5).count());
		List<String> strList1 = strList.parallelStream().filter(s -> s.isEmpty()).collect(Collectors.toList());
		System.out.println("No. of empty elements transferred to new List : " + strList1.size());
		System.out.println("Contents of new list : "+ strList1);
	}
}
