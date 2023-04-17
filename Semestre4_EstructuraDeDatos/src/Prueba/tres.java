package Prueba;

import EntradaySalida.Tools;
import Examen.Examen3;

public class tres {


	public static void main(String[]args) {
		
		String menu ="";
		  
		  Examen3 oper=new Examen3(25);
		  
		  String sel; 
		  {
		  do {
		  sel=Tools.seleccionBoton1(menu);
		  
		switch (sel) {
		  case "Insertar dato": oper.agregarOrdenado();break; 
		  case"Imprimir":if(oper.validaVacio())Tools.imprimirMSJE("Array vacio");
		  else oper.imprimirArray();; break;
		  case"Buscar": Examen3.busquedaSecuencialOrdenada(Tools.leerInt("Escribe un nombre"));break;
		  case "Eliminar":if(oper.validaVacio())Tools.imprimirErrorMSJE("Array vacio");
			else {
				byte pos=Examen3.busquedaSecuencialOrdenada(Tools.leerInt("Escribe"));
				if (pos!=-1)
					oper.eliminarDato(pos);
				else Tools.imprimirErrorMSJE("El dato no se encuentra en el arreglo");
			}break;
		  case "Modificar":if(oper.validaVacio())Tools.imprimirMSJE("El arreglo esta vacio");
			  else {
				  byte pos = Examen3.busquedaSecuencialOrdenada(Tools.leerInt("Escribe el dato"));
				  if(pos>=0) {
					oper.modificarDato(pos);  
				  }}
			  break;
		  case "SALIR": Tools.imprimirMSJE("Fin del programa");;
		    
		  } }while (!"SALIR".equals(sel));

		  }
	}
	
}