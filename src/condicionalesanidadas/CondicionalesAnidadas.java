package condicionalesanidadas;

import java.util.Scanner;

public class CondicionalesAnidadas {
    public static void main(String[] args) {
      //0 a 5 Niño pequeño
      //6 a 12 Niño grande
      //13 a 17 Adolescente
      //18 a  65 Adulto joven
      // 66 a 100 Adulto mayor
        Scanner dato=new Scanner(System.in);
        int edad;
        String genero;
        System.out.println("Digite su edad");
        edad=dato.nextInt();
        System.out.print("Digite su género,m para mujer y h para hombre");
        genero=dato.next();
        if(edad<=5){
            if(genero.equalsIgnoreCase("m")){
            System.out.println("Es un niña pequeña");
            }
            else if(genero.equalsIgnoreCase("h")){
                System.out.println("Es un niño pequeño");
            }
            else{
                System.out.println("Digite un génro valido m o h");
            }
        }
        else if(edad<=12){
            System.out.print("Es un niño grande");
            
        }
        else if(edad<=17){
            System.out.print("Es un adolescente");
        }
        else if(edad<=65){
            System.out.print("Es un adulto joven");
        }
        else if (edad<=100){
            System.out.print("Es un adulto mayor");
        }
        else{
            System.out.print("Digite una edad entre 0 y 100");
        }
        
       
    }
    
}
