package ParcialTarde3Objetos;

public class Cliente {
	String nombre;
	Tarjeta[] tarjetas;

	public boolean todosAprobadas() {
		for(Tarjeta ta : this.tarjetas) {
			for(Compra co : ta.compras) {
				if(!co.aprobada) {
					return false;
				}
			}
		}
		return true;
	}

}
