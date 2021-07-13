package com.cursos.luis.utils;

import java.util.Scanner;

public class Input {

	private static Input referenceToSingleInputObject = null;
	private Scanner scannerKeyboard;

	private Input() {
		scannerKeyboard = new Scanner(System.in);
	}

	public static Input getInstance() {
		if (referenceToSingleInputObject == null)
			referenceToSingleInputObject = new Input();
		return referenceToSingleInputObject;
	}

	public String leerFrase() {
		return scannerKeyboard.nextLine();
	}

}
