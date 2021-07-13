package com.cursos.luis;

import com.cursos.luis.utils.StringUtils;

public class Ejercicio17 {

	private boolean isValid;
	private String frase;
	private int cantidadCorrectas = 0;
	private int cantidadIncorrectas = 0;

	public boolean isValid() {
		return isValid;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public int getCantidadCorrectas() {
		return cantidadCorrectas;
	}

	public void setCantidadCorrectas(int cantidadCorrectas) {
		this.cantidadCorrectas = cantidadCorrectas;
	}

	public int getCantidadIncorrectas() {
		return cantidadIncorrectas;
	}

	public void setCantidadIncorrectas(int cantidadIncorrectas) {
		this.cantidadIncorrectas = cantidadIncorrectas;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public boolean validateFrase() {
		if (this.getFrase().length() != 5) {
			return false;
		}
		if (!this.getFrase().substring(0, 1).equalsIgnoreCase("X")) {
			return false;
		}
		if (!this.getFrase().substring(4, 5).equalsIgnoreCase("O")) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Ejercicio17 ejercicio17 =  new Ejercicio17();
		boolean continuar = true;
		
		do {
			System.out.println("Ingrese un frase: ");
			String frase = StringUtils.leerFrase();
			ejercicio17.setFrase(frase);
				
			boolean isValid = ejercicio17.validateFrase();
			if(!frase.equals("&&&&&") ) {
				if (isValid) {
					ejercicio17.setCantidadCorrectas(ejercicio17.getCantidadCorrectas() + 1);
				} else {
					ejercicio17.setCantidadIncorrectas(ejercicio17.getCantidadIncorrectas() + 1);
				}
					
			} else {
				continuar = false;
			}
				
		} while (continuar);
		
		System.out.println("cantidad de palabras correctas: " + ejercicio17.getCantidadCorrectas());
		
		System.out.println("cantidad de palabras incorrectas: " + ejercicio17.getCantidadIncorrectas());
	}

}
