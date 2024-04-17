
package Model;

import javax.swing.JOptionPane;

public class lista_DAO {
    
    public static void Exe1(){
        
        double a = 0.0, b = 0.0, c = 0.0;
        String x = "";
        
        x = JOptionPane.showInputDialog(null, "Digite a primeira nota: ");
        a = Double.parseDouble(x);
        x = JOptionPane.showInputDialog(null, "Digite a segunda nota: ");
        b = Double.parseDouble(x);        
        x = JOptionPane.showInputDialog(null, "Digite a terceira nota: ");
        c = Double.parseDouble(x);

        double media = (a+b+c)/3;
        
        if(media < 5){
            JOptionPane.showMessageDialog(null, "Média I");
        }else if(media < 6.9){
            JOptionPane.showMessageDialog(null, "Média R");
        }else if(media < 8.9){
            JOptionPane.showMessageDialog(null, "Média B");
        }else{
            JOptionPane.showMessageDialog(null, "Média MB");
        }
    }
    
    public static void Exe2(){
        
        int a = 0, b = 0, c = 0, d = 0;
        String x = "";
        
        x = JOptionPane.showInputDialog(null, "Qual a sua idade: ");
        a = Integer.parseInt(x);
        
        x = JOptionPane.showInputDialog(null, "Você fuma?\n1- Sim\n2- Não ");
        b = Integer.parseInt(x);
        
        x = JOptionPane.showInputDialog(null, "Você bebe?\n1- Sim\n2- Não ");
        c = Integer.parseInt(x);
        
        x = JOptionPane.showInputDialog(null, "Você perde noites de Sono?\n1- Sim\n2- Não ");
        d = Integer.parseInt(x);
        
        int tempoR = 65 - a;
        
        if(b == 1){
            tempoR = tempoR - 5;
        }

        if(c == 1){
            tempoR = tempoR - 7;
        }        

        if(d == 1){
            tempoR = tempoR - 6;
        }
        
        if(tempoR <= 3){
            JOptionPane.showMessageDialog(null, "Você tem " + tempoR + " anos de vida e esta com o Pé na Cova");
        }else if(tempoR <= 10){
            JOptionPane.showMessageDialog(null, "Você tem " + tempoR + " anos de vida. Cuidado, vc esta com um pé na cova");
        }else if(tempoR <= 20){
            JOptionPane.showMessageDialog(null, "Você tem " + tempoR + " anos  de vida. Durma mais, pare de fumar e manere no alcool");
        }else{
            JOptionPane.showMessageDialog(null, "Você tem " + tempoR + " anos de vida. É isso aí continue assim");
        }
        
    } 
}
