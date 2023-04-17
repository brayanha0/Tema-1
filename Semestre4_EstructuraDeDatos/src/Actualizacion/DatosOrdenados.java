package Actualizacion;

import EntradaySalida.Tools;

public class DatosOrdenados {
private int ordenados[];
private byte p;

public DatosOrdenados(int tam) {
	ordenados=new int[tam];
	p=-1;
}

public boolean validaVacio() {
	return(p==-1);
}

public String imprimeDatos(){
    String cad = " ";
    for (int i = 0; i <= p; i++) {
        cad +=+ i + "["+ordenados [i]+"]" + "\n";       
    }
    
    return "\n"+cad;
 }

public  byte busSecuenciaOrdenada (int dato)
{
    byte i=0;
    
    while (i<ordenados.length && ordenados[i]<dato)
        i++;
    if (i<ordenados.length || ordenados[i]>dato)
                         return (byte) -i;
    
    else 
        return i;
            
}

public void eliminarDato(byte pos) {
	for(int j=pos;j<=p;j++)
	{
		ordenados[j]=ordenados[j+1];
	}
	p--;
}

public void recorrePosiciones(byte pos) {
	for(int j=p+1; j>pos; j--) {
		ordenados[j]=ordenados[j-1];
	}
}

public void agregarOrdenados() {
	int dato=Tools.leerInt("Escribe un entero");
	if(validaVacio()) {
		ordenados[p+1]=dato;
		p++;
	}else {
		byte pos=busSecuenciaOrdenada(dato);
		if (pos>0)Tools.imprimirMSJE("Ya existe el dato");
    else{
    	pos*=-1;
    	recorrePosiciones((byte)pos);ordenados[pos]=dato; p++;
    }
		
	}
		
}

}

