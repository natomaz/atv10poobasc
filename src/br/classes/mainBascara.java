package br.classes;

import javax.swing.JOptionPane;

public class mainBascara {
    public static void main(String[] args) {
        bascara calculo = new bascara();
        
        calculo.setA(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de A: ")));
        calculo.setB(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de B: ")));
        calculo.setC(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de C: ")));

        calculo.calcularDelta();
        
        if (calculo.d>0){calculo.calcularX();
        }else {
            {JOptionPane.showMessageDialog(null, "Delta não possui raiz.");
        }
    } 
}    
}
