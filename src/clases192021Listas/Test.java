package clases192021Listas;

public class Test {

	public static void main(String[] args) {
		 ListaInt lis=new ListaInt();
		 lis.agregarAdelante(0);
		 lis.agregarAdelante(2);
		 lis.agregarAdelante(-18);
		 lis.agregarAdelante(122);
		 lis.agregarAdelante(15);
		 lis.agregarAtras(122);
		 lis.agregarAtras(32);
		 lis.imprimir();
		 lis.quitar(32);
		 lis.imprimir();
		 System.out.println(lis.largo());
		//System.out.println(lis.toString());
		 

	}

}
