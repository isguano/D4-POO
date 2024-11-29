package com.mycompany.deber4calculadora;
import java.util.Scanner;

public class Operaciones {
    Scanner entrada= new Scanner(System.in);
    
    private float numero1;
    private float numero2;
    
    //Creamos las funciones para rwalizar las operaciones basicas
    public void sumar(float numero1, float numero2){
        float resultado;
        resultado = numero1 + numero2;
        
        System.out.println("Ingrese el primer numero: "); 
        numero1 = entrada.nextFloat();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = entrada.nextFloat();
        System.out.println("El resultado es: " + resultado);
    }
    public void restar(float numero1, float numero2){
        float resultado;
        resultado= numero1 - numero2;
        
        System.out.println("Ingrese el primer numero: "); 
        numero1 = entrada.nextFloat();
        System.out.println("ingrese el segundo numero: ");
        numero2 = entrada.nextFloat();
        System.out.println("El resultado es: " + resultado);
    }
    public void multiplicar(float numero1, float numero2){
        float resultado;
        resultado= numero1 * numero2;
        
        System.out.println("Ingrese el primer numero: "); 
        numero1 = entrada.nextFloat();
        System.out.println("ingrese el segundo numero: ");
        numero2 = entrada.nextFloat();
        System.out.println("El resultado es: " + resultado);
    }
    public void dividir(float numero1, float numero2){
        float resultado;
        resultado= numero1 / numero2;
        
        System.out.println("Ingrese el primer numero: "); 
        numero1 = entrada.nextFloat();
        System.out.println("ingrese el segundo numero: ");
        numero2 = entrada.nextFloat();
        
        //Ponemos una condicion que no se puede dividir para cero        
        if(numero2 == 0){
            System.out.println("No se puede dividir para cero");
        }else{
            resultado= numero1/numero2;
            System.out.println("El resultado es: " +resultado);
        }
    }
    
}
