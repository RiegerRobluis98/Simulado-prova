package simulado;

import javax.swing.JOptionPane;

public class Simulado {

    public static void main(String[] args) {
        double portePeq = 30.00, porteMed = 40.00, porteGra = 50.00,
                corteUnha = 5.00, tosa = 10.00, xampu = 15.00, total = 0;
        String portePet, corteTexto, tosaTexto, xampuTexto;
        portePet = JOptionPane.showInputDialog("Qual o Tamanho do Pet? "); //Pequeno, Medio ou Grande
        corteTexto = JOptionPane.showInputDialog("Deseja Corte de Unha"); // Sim ou Nao
        tosaTexto = JOptionPane.showInputDialog("Deseja fazer a Tosa ?"); // Sim ou Nao
        xampuTexto = JOptionPane.showInputDialog("Deseja Shampoo Especial ?"); // Sim ou Nao
        
        if (portePet.equals("Pequeno")) {
        total = portePeq;
        }
        if (portePet.equals("Medio")) {
        total = porteMed;
        }
        if (portePet.equals("Grande")) {
        total = porteGra;
        }
        if (corteTexto.equals("Sim")){
        total = total + corteUnha;
        }
          if (tosaTexto.equals("Sim")){
        total = total + tosa;
        }   
         if (xampuTexto.equals("Sim")){
        total = total + xampu;
        }
         
       JOptionPane.showMessageDialog(null, "Valor do Banho: " + total);
            }

}
