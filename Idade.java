import javax.swing.JOptionPane;
 
public class Idade {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        if( idade>=18) {JOptionPane.showMessageDialog(null,"você é de maior");            
        } 
        else {JOptionPane.showMessageDialog(null,"você é de menor");
        }
    }
}
