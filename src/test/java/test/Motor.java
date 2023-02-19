package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	public void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	public void asignarTipo(String tipo){
		String[] tipos = {"electrico", "gasolina"};
		for (int i = 0; i<tipos.length; i++) {
			if (tipo == tipos[i]) {
				this.tipo = tipo;
			}
		}
	}
}
