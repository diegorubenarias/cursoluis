package com.cursos.luis.utils;

import java.util.Scanner;

public class StringUtils {
	
	private StringUtils() {
		
	}
	
	/**
	 * 
	 * @return frase leida desde keiboard
	 */
	public static String leerFrase() {
		return Input.getInstance().leerFrase();
	}
	
	
}
