import javax.swing.JOptionPane;

public class Cinema {
    public static void main(String[] args) {
    Double ingresso = Double.parseDouble(JOptionPane.showInputDialog("Qual valor do ingresso?"));
    int anos = Integer.parseInt(JOptionPane.showInputDialog("Escreva sua idade"));
    double resultado = ingresso/2;
    if( anos<=2)
    {JOptionPane.showMessageDialog(null, "Seu ingresso é gratuito");
}
else if (anos<18 || anos>=65 ) {
    JOptionPane.showMessageDialog(null, "você pagará meia entrada: "+ resultado);
}
else{
    JOptionPane.showMessageDialog(null, "Seu ingresso custa: "+ ingresso);
}
}
}