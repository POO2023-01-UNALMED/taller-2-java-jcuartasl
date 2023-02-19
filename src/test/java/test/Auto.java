package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		int c = 0;
		for (int i = 0; i<asientos.length; i++) {
			if (asientos[i] != null){
				c++;
			}
		}
		return c;
	}
	public String verificarIntegridad(){
		if (this.registro != motor.registro) {
			return "Las piezas no son originales";
				}
		for (int i = 0; i<asientos.length;i++) {
			if (asientos[i] != null) { 
				if (asientos[i].registro != this.registro) {
					return "Las piezas no son originales";
				}
			}	
		}
		return "Auto original";
	}
}