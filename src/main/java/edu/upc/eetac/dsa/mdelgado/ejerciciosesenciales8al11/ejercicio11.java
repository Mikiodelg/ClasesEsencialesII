package edu.upc.eetac.dsa.mdelgado.ejerciciosesenciales8al11;

public class ejercicio11 {
	
	public static String UltimaEscritura="Ninguno";
	public static int Activos = 0;
	
	public static void main( String[] args )
    {
			CuentaAtras11 contador1 = new CuentaAtras11("ID1", 4);
			CuentaAtras11 contador2 = new CuentaAtras11("ID2", 7);
			CuentaAtras11 contador3 = new CuentaAtras11("ID3", 8);
			
		contador1.start();
		Activos++;
		contador2.start();
		Activos++;
		contador3.start();
		Activos++;
    }

}