
package View;

import Model.lista_DAO;
import javax.swing.JOptionPane;

public class menu_GUI {
    
    public static void Tela(){
    
        int op = 0;
        String x = "";
        
        while (op != 3){
        
            x = JOptionPane.showInputDialog(null, "ESCOLHA\n1- Exercício 1\n2- Exercício 2\n3- Sair");
            op = Integer.parseInt(x);
            
            switch(op){
                case 1:
                    Model.lista_DAO.Exe1();
                    break;
                case 2:
                    Model.lista_DAO.Exe2();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;                
            }
            
        }
    
    }
    
}
