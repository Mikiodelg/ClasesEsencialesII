package edu.upc.eetac.dsa.mdelgado.ejerciciosesenciales8al11;

public class CuentaAtrasRun implements Runnable{
	
	String ID = "";
	int contador = 0;
	int i=0;
	Thread t;
	
	public CuentaAtrasRun (String iden, int num){
		this.ID = iden;
		this.contador = num;
		t = new Thread(this, ID);
		t.start();
	}
	
	public void run() {
		
			for(i=contador; i>=0 ;i--){
			try {
				this.contador=i;
				System.out.println("Num: " + this.ID + " : " + this.contador);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
    }
}
