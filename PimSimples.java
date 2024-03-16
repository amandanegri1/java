import javax.swing.JOptionPane;

public class PimSimples {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
        if ( numero % 4 == 0 || numero % 10 == 0) {
            JOptionPane.showMessageDialog(null, "PIM");
        } else {
            JOptionPane.showMessageDialog(null, " O numero indicado não é divisível "+ numero);
        }
    }
}

