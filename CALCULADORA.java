package com.mycompany.calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {
        
        double num1 = 0; // Declarando e inicializando variables
        double num2;
        
        int operation = Integer.parseInt(JOptionPane.showInputDialog("(1) Sumar\n(2) Restar\n(3) Multiplicar\n(4) Dividir\nElija una opción:")); // Mostrando las operaciones disponibles
        
        if (operation <=4 && operation != 0){
            
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el primer número")); // Pidiendo los números
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el segundo número"));         
            
            switch (operation) {
                case(1): // Suma
                    JOptionPane.showMessageDialog(null, num1 + num2);
                    break;
                case(2): // Resta
                    JOptionPane.showMessageDialog(null, num1 - num2);
                    break;
                case(3): // Multiplicación
                    JOptionPane.showMessageDialog(null, num1 * num2);
                    break;
                case(4): // División
                    if (num2 == 0){ // Si se intenta divir entre 0
                        JOptionPane.showMessageDialog(null,"No se puede dividir entre 0.");
                    } else {
                        JOptionPane.showMessageDialog(null, num1 / num2);
                    }
                    break;   
            }
        } else { // Si se elige un número que no corresponde a una opción
            JOptionPane.showMessageDialog(null, "Opción no válida.");
        }
    }
}
