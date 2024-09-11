package clase03Recursion;

public class Recursion {
	
	public static int sumatoria(int n) {
		int suma = 0;
		for (int i = 0; i <= n; i++) {
			suma += i;
		}
		return suma;
	}

	public static int sumatoriaRecursiva(int n) {
//    	if(n < 2) {   // caso base
//    		return n;
//    	}
//    	return sumatoriaRecursiva(n-1) + n;  // caso recursivo
		return n < 2 ? n : sumatoriaRecursiva(n - 1) + n;
	}

	public static int sumatoriaParRec(int n) {
		if (n == 0) {
			return n;
		}
		if (n % 2 == 0) {
			return sumatoriaParRec(n - 1) + n;
		}
		return sumatoriaParRec(n - 1);
	}

	public static double potenciaRec(double x, int n) {
		// caso base
		if (n == 0) {
			return 1;
		}
		// caso recursivo
		return potenciaRec(x, n - 1) * x;
	}

	public static void main(String[] args) {
		System.out.println(potenciaRec(5.0, 3));
	}
}
