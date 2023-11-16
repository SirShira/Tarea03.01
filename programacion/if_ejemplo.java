
package IF;

import java.util.Scanner;

public class IfAnidado {
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in); 
        
       int dia;
              
      System.out.println("Introducir dia entre 1 y 7");
      dia=teclado.nextInt();  
      
      if(dia==1)
        System.out.println("HOY ES LUNES");
      else if(dia==2)
             System.out.println("HOY ES MARTES");
      else if(dia==3)
              System.out.println("HOY ES MIERCOLES");
      else if(dia==4)
             System.out.println("HOY ES JUEVES");
      else if(dia==5)
             System.out.println("HOY ES VIERNES");
      else if(dia==6)
             System.out.println("HOY ES SABADO");
      else if(dia==7)
             System.out.println("HOY ES DOMINGO");
      else System.out.println("DIA INCORRECTO");
      
      if(dia>=1 && dia<=5)
        System.out.println("DIA LABORABLE");
      else if(dia>=6 && dia<=7)
            System.out.println("DIA FESTIVO");
      else System.out.println("DIA INCORRECTO");
    }
}
