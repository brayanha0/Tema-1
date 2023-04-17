package Prueba;

import EntradaySalida.Tools;
import Examen.Examen;

public class uno {
public static void main(String[]args) {
		
		String menu= "Insertar dato,Imprimir,Buscar Dato, SALIR ";
		
		Examen oper=new Examen(5);
		
		String sel;
		{
			
			do{
				sel=Tools.seleccionBoton8(menu);
				switch(sel) {
				case"Insertar dato": oper.agregarDatos();break;
				case "Busqueda Secuencial": oper.busquedaSecuencial(); break;
				case "Imprimir datos":oper.imprimirArray();
				if (oper.arrayVacio())Tools.imprimirErrorMSJE("Array vacio");
				else
					oper.imprimirArray();
				break;
				case "eliminar":if(oper.arrayVacio())Tools.imprimirErrorMSJE("Array vacio");
				else {
					byte pos=oper.busquedaSecuencial();
					if(pos!=-1)
					oper.eliminarDato(pos);
					else Tools.imprimirErrorMSJE("El dato no se encuentra en el arreglo");
				}
				case "salir": Tools.imprimirErrorMSJE("fin del programa");
				}
			}while(!"salir".equals(sel));
		}
	}
	
}


