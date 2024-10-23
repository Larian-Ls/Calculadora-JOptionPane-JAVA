package com.mycompany.calculadora;

import javax.swing.JOptionPane;

public class CALCULADORA {

    public static void main(String[] args) {
        
        // Declarando e inicializando variables
        double num1 = 0;
        double num2;
        
        // Mostrando las operaciones disponibles
        
        double operation = Integer.parseInt(JOptionPane.showInputDialog("(1) Sumar\n(2) Restar\n(3) Multiplicar\n(4) Dividir\nElija una opción:"));
        
        // Pidiendo los números
        
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el primer número"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el segundo número"));
        
        // Realizando operaciones según la elección
        
        // Suma
        
        if (operation == 1){
            JOptionPane.showMessageDialog(null, num1 + num2);
        }
        
        // Resta
        
        else if (operation == 2){
            JOptionPane.showMessageDialog(null, num1 - num2);            
        }
        
        // Multiplicación
        
        else if (operation == 3){
            JOptionPane.showMessageDialog(null, num1 * num2);            
        }
        
        // División
        
        else if (operation == 4){
            JOptionPane.showMessageDialog(null, num1 / num2);            
        }
    }
}
