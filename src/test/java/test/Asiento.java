package test;

public class Asiento {
	String color;
	int precio;
	int registro;

	public void cambiarColor(String color) {
		String[] coloresValidos = {"rojo", "verde", "amarillo", "negro", "blanco"};
		
		for (int i = 0; i < coloresValidos.length; i++) {
			if  (color ==coloresValidos[i]) {
				this.color = color;
			}
		}
	}
}