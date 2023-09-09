package UserInterface.App;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.event.*;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Framework.AppException;
import javax.swing.ImageIcon;


public class FMaster extends JFrame  implements ActionListener{//implementando el listener de eventos
    ImageIcon icon;
    Tabla   pnlMenu;
    TablaCoordenada   pnlSexo ;    
    JPanel  pnlContent;

    public FMaster(String tilte, String pathIcon) throws AppException, SQLException{
        setCustomizerForm( tilte,  pathIcon);
        
        pnlMenu = new Tabla();
        pnlMenu.setBounds(5, 5, 150, 350);   
        pnlMenu.btnSexo.addActionListener(this);   
        add(pnlMenu); 

        pnlContent  = new JPanel();
        pnlContent.setBounds(200, 10, getWidth()-200, getHeight()-50);
        pnlContent.setLocation(200,10);
        pnlContent.setBackground(Color.lightGray);
        add(pnlContent); 

        // png1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.black),BorderFactory.createEmptyBorder(10, 15, 5, 15)));
    }

    public void setCustomizerForm(String tilte, String pathIcon) throws AppException, SQLException{
        //"Resourse\\img\\animal\\png32\\bear.png"
        icon = new ImageIcon(pathIcon);                  // create an Imagelcon  -- ico
        setTitle(tilte);                               // Titulo
        setVisible(true);
        setLayout(null);
        setLocation(100, 50);
        setResizable(true);
        setSize(800, 600);
        setIconImage(icon.getImage()); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //getContentPane().setBackground(new  Color(12,111,54)); 
    }

    public void showPanelSexo() throws AppException, SQLException{

        pnlSexo = new TablaCoordenada();
        //pnlSexo.setBounds(200, 0, getWidth()-200, getHeight()-55);
        //pnlSexo.setLocation(0,0);

        pnlContent.removeAll();
        pnlContent.setLayout(new GridBagLayout());
        pnlContent.add(pnlSexo);
        pnlContent.revalidate();
        pnlContent.repaint();
    }

 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pnlMenu.btnSexo)
            try {
                showPanelSexo();
            } catch (AppException | SQLException e1) {
                e1.printStackTrace();
            }
        else{
            //JOptionPane.showMessageDialog(null, e.getActionCommand());
            System.out.println("FMaster.Click -> " + e.getActionCommand());
        }
    }
}