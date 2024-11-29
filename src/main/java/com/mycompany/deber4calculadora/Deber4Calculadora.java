package com.mycompany.deber4calculadora;
import java.util.Scanner;
public class Deber4Calculadora {

    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        
        
            //Declaramos las variables 
            int opcion;
            float NumeroUno = 0;
            float NumeroDos = 0 ;
            //Creamos un objeto llamado Procedimiento
            Operaciones Procedimiento =new Operaciones();

            System.out.println("********************************************");
            System.out.println("*            Menu de calculadora           *");
            System.out.println("********************************************");
            
            System.out.println("Escoga una opcion");
            System.out.println("1. Sumar ");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicar ");
            System.out.println("4.Dividir ");
            
            
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch(opcion){
                case 1:
                    //procedimiento.sumar llamara a la funcion suma
                    Procedimiento.sumar(NumeroUno,NumeroDos);
                    break;
                case 2:
                    Procedimiento.restar(NumeroUno,NumeroDos);
                    break;
                case 3: 
                    Procedimiento.multiplicar(NumeroUno,NumeroDos);
                    break;
                case 4:
                    Procedimiento.dividir(NumeroUno,NumeroDos);
                    break;
                default:
                    System.out.println("Opcion invalida");  
            }
           
    }
    
}
