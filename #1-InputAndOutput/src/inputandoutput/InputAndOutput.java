
package inputandoutput;

import java.util.Scanner;


public class InputAndOutput {

    
    public static void main(String[] args) {
        //Scanner Class
        //Scanner objectName = new Scanner(System.in);
        //Import alt + shift + i
        Scanner obj = new Scanner(System.in);
        
        int grado;
        System.out.println("Ilagay mo ang grado mo: ");
        grado = obj.nextInt();
        //variableName = objectNameOfScanner.nextInt();
        System.out.printf("Ang grado mo ay: %d\n",grado);
        System.out.println("Ang grado mo ay: "+grado);
        
        double numero;
        System.out.println("Ilagay mo ang value nang numero: ");
        numero = obj.nextDouble();
        
        System.out.printf("Ang value nang numero ay: %f\n", numero);
        
        System.out.print("Ano pangalan mo : ");
        String pangalan = obj.next();
        System.out.println("Ang pangalan mo ay : "+pangalan);
        
    }
    
}
