
package avaliacaopoo;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Avaliacao {

   
    public static void main(String[] args) {
       
        
       
        
        ArrayList<Login> listaMenu = new ArrayList<Login>();
       
       
       String textoMenu = "-------------| MENU by Romario |------------- \n\n"
               + "1 - Cadastro\n"
               + "2 - Login \n"
               + "0 - Sair \n\n"; 
       
       
       String opcao = "0";
        
           
       do{
          opcao = JOptionPane.showInputDialog(null, textoMenu);  
        switch(opcao){
            case "1":
                
                
              // Cadastro
              Login c1 = new Login();
              c1.setUsuario(JOptionPane.showInputDialog(null, "Nome de Usuário: "));
         
              String senha = (JOptionPane.showInputDialog(null, "Senha de Usuário: "));
              c1.setSenha((senha));
              
              listaMenu.add(c1); //grava na lista os dados de String e senhas
              
               
              JOptionPane.showMessageDialog(null, listaMenu.size() + " Usuário cadastrado!");
              
              
               break;
               
            
             case "2":
                
                // Login   
             
                    
              // Usuário      
              Login v1 = new Login();
              v1.setUsuario(JOptionPane.showInputDialog(null, "Nome de Usuário: "));
              
              // Senha
              String password = (JOptionPane.showInputDialog(null, "Senha de Usuário: "));
              
              
              JOptionPane.showMessageDialog(null,"Bem Vindo! "  +v1.usuario);
             
              
              
              
              // Janela de Cadastros    
              String textoExibir = "-----| Logins Cadastrados |-----\n\n";
                      
              for (int i = 0; i < listaMenu.size(); i++) {
                     Login s = listaMenu.get(i);
                     textoExibir += "Login: " + s.getUsuario() + "\n";
                     textoExibir += "Senha: " + s.getSenha() + "\n\n";
                     
                     
                     JOptionPane.showMessageDialog(null, textoExibir);
                                    
                     
                             
                     
                 }
              
                
              
                 
             break; 
             
        }
              
              
             
              
              
        
        // Sair
        
       }while(!opcao.equals("0"));
        
        
        
    
       }
  }



       
