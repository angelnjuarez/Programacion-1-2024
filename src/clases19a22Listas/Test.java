package clases19a22Listas;

public class Test {

	public static void main(String[] args) {
		ListaInt caso1 = new ListaInt();
		ListaInt caso2 = new ListaInt();
		ListaInt caso3 = new ListaInt();
		ListaInt caso4 = new ListaInt();
		ListaInt caso5 = new ListaInt();

		caso1.agregarAtras(4);
		caso1.agregarAtras(1);
		caso1.agregarAtras(2);
		caso1.agregarAtras(3);
		caso1.agregarAtras(3);
		caso1.agregarAtras(4);
		caso1.agregarAtras(6);
		System.out.println("Orignal");
		caso1.imprimir();
		System.out.println("Nueva Lista");
		caso1.extraerConsecutivos().imprimir();
		System.out.println("Original modificada");
		caso1.imprimir();
		System.out.println("---------------");
		caso2.agregarAtras(3);
		caso2.agregarAtras(8);
		caso2.agregarAtras(3);
		caso2.agregarAtras(4);
		caso2.agregarAtras(5);
		System.out.println("Orignal");
		caso2.imprimir();
		System.out.println("Nueva Lista");
		caso2.extraerConsecutivos().imprimir();
		System.out.println("Original modificada");
		caso2.imprimir();
		System.out.println("---------------");
		caso3.agregarAtras(9);
		caso3.agregarAtras(10);
		caso3.agregarAtras(11);
		System.out.println("Orignal");
		caso3.imprimir();
		System.out.println("Nueva Lista");
		caso3.extraerConsecutivos().imprimir();
		System.out.println("Original modificada");
		caso3.imprimir();
		System.out.println("---------------");
		caso4.agregarAtras(4);
		caso4.agregarAtras(3);
		caso4.agregarAtras(1);
		caso4.agregarAtras(3);
		caso4.agregarAtras(5);
		System.out.println("Orignal");
		caso4.imprimir();
		System.out.println("Nueva Lista");
		caso4.extraerConsecutivos().imprimir();
		System.out.println("Original modificada");
		caso4.imprimir();
		System.out.println("---------------");
		caso5.agregarAtras(10);
		caso5.agregarAtras(5);
		System.out.println("Orignal");
		caso5.imprimir();
		System.out.println("Nueva Lista");
		caso5.extraerConsecutivos().imprimir();
		System.out.println("Original modificada");
		caso5.imprimir();
		 
	}

}
