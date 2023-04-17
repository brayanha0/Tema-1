package Prueba;

import EntradaySalida.Tools;
import Examen.Examen2;

public class dos {

public static void main(String[]args) {
		
		String menu= "Insertar dato,imprimir, SALIR ";
		
		Examen2 oper=new Examen2(15);
		
		String sel;
		{
			do{
				sel=Tools.seleccionBoton4(menu);
				switch(sel) {
				case"Insertar dato": oper.agregarDatos();break;
				case"Imprimir":oper.imprimirArray(); ;
				if (oper.arrayVacio())Tools.imprimirErrorMSJE("Array vacio");
				else
					oper.imprimirArray();
				break;
				case "salir": Tools.imprimirErrorMSJE("fin del programa");
				}
			}while(!"salir".equals(sel));
		}
	}
}
