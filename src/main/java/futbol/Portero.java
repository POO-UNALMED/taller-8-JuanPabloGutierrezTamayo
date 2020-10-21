package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	@Override
	public boolean jugarConLasManos() {
		
		return true;
	}

	public Portero(String nombre, int edad, short golesRecibidos,byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos=golesRecibidos;
		this.dorsal=dorsal;
	}
	
	public String toString() {
		return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+", y juega de "+this.getPosicion()+
				" con el dorsal "+this.dorsal+". Le han marcado "+this.golesRecibidos;
	}
	
	public int compareTo(Portero f) {
		
		return Math.abs(this.golesRecibidos-f.golesRecibidos);
	}
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
