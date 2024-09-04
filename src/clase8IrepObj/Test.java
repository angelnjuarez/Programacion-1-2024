package clase8IrepObj;

public class Test {
	
public static void main(String[] args) {
	Fecha f=new Fecha(30,9,2024);
	f.mostrar();
//	f.avanzarDia();
//	f.mostrar();
//	System.out.println(Fecha.diasDelMes(2,2024));
//	 System.out.println(Fecha.esBisiesto(1900));
	Fecha otra=new Fecha(10,9,2023);
	otra.mostrar();
//	System.out.println(f.antesQueI(otra));
	System.out.println(f.diasDeDiferenciaCon(otra));
	Fecha otraMas = new Fecha(29,02,2023);
	otraMas.mostrar();

}
}
