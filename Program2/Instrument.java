package program2;

import program2.Piano;

public class Instrument implements Piano,Guitar{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Instrument().play();
		new Piano() {}.play();
	}

	public void play() {
		// TODO Auto-generated method stub
		Guitar.super.play();
	}
}
