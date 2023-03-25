package main;

import calculator.GameCalculator;
import calculator.ManGameCalculator;
import calculator.WomenGameCalculator;

public class Main {

	public static void main(String[] args) {
		GameCalculator gameCalculator = new WomenGameCalculator();
		gameCalculator.hesapla();

	}

}
