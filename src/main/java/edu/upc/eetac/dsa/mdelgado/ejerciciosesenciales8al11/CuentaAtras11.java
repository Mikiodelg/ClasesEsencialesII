package edu.upc.eetac.dsa.mdelgado.ejerciciosesenciales8al11;

public class CuentaAtras11 extends Thread {

	String ID = "";
	int contador = 0;
	int i=0;
	
	public CuentaAtras11 (String iden, int num){
		this.ID = iden;
		this.contador = num;
	}
	
	public synchronized void run(){
		
		for(i=contador; i>=0 ;i--){
			try {
				this.contador=i;
				System.out.println("Num: " + this.ID + " : " + this.contador + " Ultimo: " + ejercicio11.UltimaEscritura);	
				ejercicio11.UltimaEscritura = this.ID;
				Thread.sleep(1000);
				if (this.contador==0){
					ejercicio11.Activos--;
					System.out.println("Ultima Escritura: " + this.ID + " Quedan: " + ejercicio11.Activos + " threads activos");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
    }
}
