package com.mycompany.calculadora;

import javax.swing.JOptionPane;

public class CALCULADORA {

    public static void main(String[] args) {
        
        double num1 = 0; // Declarando e inicializando variables
        double num2;
        
        int operation = Integer.parseInt(JOptionPane.showInputDialog("(1) Sumar\n(2) Restar\n(3) Multiplicar\n(4) Dividir\nElija una opción:")); // Mostrando las operaciones disponibles
        
        if (operation <=4 && operation != 0){
            
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el primer número")); // Pidiendo los números
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el segundo número"));            
            
            if (operation == 1){ // Suma
                JOptionPane.showMessageDialog(null, num1 + num2);
            } else if (operation == 2){ // Resta
                JOptionPane.showMessageDialog(null, num1 - num2);            
            } else if (operation == 3){ // Multiplicación
                JOptionPane.showMessageDialog(null, num1 * num2);            
            } else if (operation == 4){ // División
                JOptionPane.showMessageDialog(null, num1 / num2);            
            }            
        } else {
            JOptionPane.showMessageDialog(null,"Opción no valida."); // Si operation es mayor que 4 o igual a 0
        }
    }
}
