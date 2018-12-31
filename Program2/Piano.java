package program2;


public interface Piano {

	default void play() {
		System.out.println("Playing piano....");
	}
}


interface Guitar {

	default void play() {
		System.out.println("Playing Guitar....");
	}
}
