package Prueba;


import Metodos.ArrayOperacion;
import EntradaySalida.Tools;

public class Test {

	public static void main(String[]args) {
		
		String menu= "Insertar dato,Imprimir,Buscar Dato, SALIR ";
		
		ArrayOperacion oper=new ArrayOperacion(5);
		
		String sel;
		{
			do{
				sel=Tools.seleccionBoton1(menu);
				switch(sel) {
				case"Insertar dato": oper.agregarDatos();break;
				case"Imprimir": oper.imprimirArray();
				if (oper.arrayVacio())Tools.imprimirErrorMSJE("Array vacio");
				else
					oper.imprimirArray();
				break;
				case "Buscar Dato": oper.busquedaSecuencial(); break;
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
 