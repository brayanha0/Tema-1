package Metodos;

public class Practicas {

public static void generarValores(int n){
        
        double suma = 0;
        for (int i = 0; i < n; i++) {
            
            suma += calcularFactorial(2*i)/calcularFactorial(i);
            
        }      
        System.out.println("Resultado de la serie: " + suma);   
    }
    
    public static float calcularFactorial(int valor){
        float aux = 1;
        int f = 1;
        
        while(f <= valor){
            aux *= f;
            f++;
        }
        return aux;
    }
    
    
    public static String capicua(int valor){
        
        int num;
        int priNum, total = 0;
        num = valor;
        
        while(num != 0){
            
            priNum = num % 10;
            total = total * 10 + priNum;
            num = num / 10;
            
            
        }
        
        if(valor == total){
            return ("Es Capicua.");
        } else{
            return ("No es Capicua.");
            
        }   
    }
     
    
    public static int totalDigi(int valor){
        int c = 0;
        while(valor !=0 ){
            valor /= 10;
            c++;
        }
        return c;
    }
    
    
    public static String numPrimo(int valor){
        
        int num, aux = 0;
        num = valor;
        
        for (int i = 1; i <= num; i++) {
            if(num%i == 0){
                aux++;  
            }
            
        }
        if(aux == 2){
            return ("Es Primo");
        } else{
            return ("No es Primo");
        }
        
        
    }
      
}
