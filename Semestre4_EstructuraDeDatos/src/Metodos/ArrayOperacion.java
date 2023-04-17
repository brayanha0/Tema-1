package Metodos;

import javax.swing.JOptionPane;

import EntradaySalida.Tools;

public class ArrayOperacion {

	   private int datos[];
	    private byte J;
	    
	    public ArrayOperacion(int tam){
	        datos = new int[tam];
	        J = -1;
	    }
	    
	    public boolean arrayVacio(){
	        return (J==-1);
	    }
	    
	    public void agregarDatos(){
	        if(J<datos.length-1){
	            datos[J+1] = Tools.leerInt("Escribe un valor: ");
	            J++;
	        } else{
	            JOptionPane.showMessageDialog(null, "Array lleno.");
	        }
	    }
	    
	    public void imprimirArray(){
	        String cad = " ";
	        for (int i = 0; i <= J; i++) {
	            cad += "[" + i + "]" + datos[i] + "\n";       
	        }
	        
	        JOptionPane.showMessageDialog(null, "Datos del Array\n" + cad);
	    
      }
	    public byte busquedaSecuencial() {
	    	 
	    	int dato = Tools.leerInt("Escribe un valor: ");
	    	
	    	byte J=0;
	    	
	    	while(J<=J && dato!=datos[J])	
	    		{J++;}
	    	
	    if (J>J) {
	    	
	    	JOptionPane.showMessageDialog(null, "Dato no encontrado");
	    	return -1;
	    } else { 
	    	JOptionPane.showMessageDialog(null, "Posicion" + "["+ (J)+"]");
	    	return J;
	        }
	    }
	    
	    public void eliminarDato(byte pos) {
	    	for(int k=pos;k<=J;k++)
	    	{
	    		datos[k]=datos[k+1];
	    	}
	    	J--;
	    }
}
