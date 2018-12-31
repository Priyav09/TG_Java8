package program3;

public class MyClassWithLambda  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordCount count = (String str) -> {
			String[] strArray = str.split("\\s");
			return strArray.length;
		} ;
		System.out.println(count.count("Hello I am here with my friend"));
	}
}
