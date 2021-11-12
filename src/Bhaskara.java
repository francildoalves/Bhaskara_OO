package src;

import javax.swing.JOptionPane;

public class Bhaskara {
    public static void main(String[] args) {

        Delta delta = new Delta();

        double valorDeA = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A:"));
        double valorDeB = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B:"));
        double ValorDeC = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C:"));


        JOptionPane.showMessageDialog(null, "O valor de X é: " +   delta.calculaDelta(valorDeA, valorDeB, ValorDeC)/2*valorDeA);
    }
}