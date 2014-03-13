package edu.upc.eetac.dsa.mdelgado.ejerciciosesenciales8al11;

public class ejercicio8 {

	public static void main( String[] args )
    {
		
			CuentaAtras contador1 = new CuentaAtras("ID1", 4);
			CuentaAtras contador2 = new CuentaAtras("ID2", 7);
			CuentaAtras contador3 = new CuentaAtras("ID3", 8);
			
		contador1.start();
		contador2.start();
		contador3.start();
    }
}
