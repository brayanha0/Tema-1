package Metodos;

public class menu {

	public static void main(String[] args) {
		 int num []= {18,25,37,47,50};
	        byte pos=busSecuenciaOrdenada (num,25);
	        if (pos>=0) System.out.println("si se encomntro:"+pos);
	        else  System.out.println("no se encomntro, pero se puede insertar en la posicion:"+pos*-1);
	    }
	    
	        public static byte busSecuenciaOrdenada (int datos[],int dat)
	        {
	            byte i=0;
	            while (i<datos.length && datos[i]<dat)
	                i++;
	            if (i<datos.length || datos[i]>dat)
	                                 return (byte) -i;
	            
	            else 
	                return i;
	                    
	}
}


