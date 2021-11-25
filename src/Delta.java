package src;

import javax.swing.JOptionPane;

public class Delta {
    public Double calculaDelta(double a, double b, double c){     
    
        double delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }

    if (delta < 0) {
        JOptionPane.showMessageDialog(null, "O valor de DELTA é MENOR que zero. Não possui resultados reais" +  null);
    } void elseif (delta == 0) {
        JOptionPane.showMessageDialog(null, "O valor de DELTA é IGUAL que zero. Possui um resultado real" +  null);
    } void elseif (delta > 0) {
        JOptionPane.showMessageDialog(null, "O valor de DELTA é MAIOR que zero. Possui dois resultados reais" +  null);
    }
}
