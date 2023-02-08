/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        int num1 = leer.nextInt();
        numero1 = num1;
        
        System.out.println("Ingrese un número: ");
        int num2 = leer.nextInt();
        numero2=num2;
       
    }
    
        public void tipoOperacion(){
  
            System.out.println("------------------------");           
            System.out.println("Ingrese una operacion: ");
            System.out.println("- sumar");
            System.out.println("- restar");
            System.out.println("- multiplicar");
            System.out.println("- dividir");
            System.out.println("------------------------");
            Scanner leer = new Scanner(System.in);
            String rta = leer.next().toLowerCase();
            
            switch (rta){
                
                case "sumar":
                    System.out.println("Resultado: "+(numero1)+" + "+(numero2)+" = "+ (numero1+numero2));
                    break;
                case "restar":
                    System.out.println("Resultado: "+(numero1)+" - "+(numero2)+" = "+ (numero1-numero2));
                    break;
                case "multiplicar":
                    System.out.println("Resultado: "+(numero1)+" x "+(numero2)+" = "+ (numero1*numero2));
                    break;
                case "dividir":
                    System.out.println("Resultado: "+(numero1)+" / "+(numero2)+" = "+ (numero1/numero2));
                    break;                  
                default:
                    System.out.println("Operacion no admitida.");
            }
                    
       
    }

    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
    
    
}
