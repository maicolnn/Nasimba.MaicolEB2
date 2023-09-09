package UserInterface.App;

import java.awt.event.*;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import UserInterface.CustomerControl.PatButton;

public class Tabla extends JPanel implements ActionListener{
    
    public  PatButton 
            btnLogo    = new PatButton("Logo"       ,"src\\UserInterface\\img\\animal\\png32\\bear.png"),
            btnLogin   = new PatButton("Login"      ,"src\\UserInterface\\img\\animal\\png32\\bird.png"),
            btnHome    = new PatButton("Home"       ,"src\\UserInterface\\img\\animal\\png32\\cat.png"),            
            btnSexo    = new PatButton("Sexo"       ,"src\\UserInterface\\img\\animal\\png32\\cat.png"),
            btnRegistro= new PatButton("Registro"   ,"src\\UserInterface\\img\\animal\\png32\\pig.png"),
            btnContacto= new PatButton("Contacto"   ,"src\\UserInterface\\img\\animal\\png32\\fox.png");
    
    Tabla(){
        super(new GridLayout(6, 1, 10, 10));//filas, columnas, espacioFilas, espacioColumnas
        //setBackground(new Color(82, 90, 101));
        add(btnLogo);    
        add(btnLogin);   
        add(btnHome);    
        add(btnSexo);    
        add(btnRegistro);
        add(btnContacto);  
        
        //btn1.addActionListener(this); btn2.addActionListener(this); btn3.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == this){
            if(this.isVisible()){
                this.setVisible(false);
            }else
                this.setVisible(true);
        }
        else{
            //JOptionPane.showMessageDialog(null, e.getActionCommand());
            System.out.println(e.getActionCommand());
        }
        
    }
}
