import java.awt.*;
import java.awt.event.*;
import java.net.*;

class p7 extends Frame implements ActionListener, WindowListener {
    Label lbl, lbl1;
    Button btn;
    TextField txt;

    public p7(){
        lbl = new Label("Enter name:");
        lbl.setBounds(30, 80, 300, 30);
        add(lbl);
        txt = new TextField();
        txt.setBounds(30, 120, 200, 30);
        add(txt);
        btn = new Button("Submit");
        btn.setBounds(30, 180, 100, 30);
        btn.addActionListener(this);
        add(btn);
        lbl1 = new Label();
        lbl1.setBounds(30, 250, 300, 30);
        add(lbl1);
        addWindowListener(this);
        setSize(350, 350);
        setLayout(null);
        setVisible(true);
        setTitle("New Form");
    }

    public void actionPerformed(ActionEvent e){
        try
        {
            String result = txt.getText();
            result = InetAddress.getByName(result).toString();
            lbl1.setText("The IP is " + result);
            System.out.println(result);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
    }

public void windowActivated(WindowEvent arg0) {  
        System.out.println("activated");  
    }  
    public void windowClosed(WindowEvent arg0) {  
        System.out.println("closed");  
    }  
    public void windowClosing(WindowEvent arg0) {  
        System.out.println("closing");  
        dispose();  
    }  
    public void windowDeactivated(WindowEvent arg0) {  
        System.out.println("deactivated");  
    }  
    public void windowDeiconified(WindowEvent arg0) {  
        System.out.println("deiconified");  
    }  
    public void windowIconified(WindowEvent arg0) {  
        System.out.println("iconified");  
    }  
    public void windowOpened(WindowEvent arg0) {  
        System.out.println("opened");  
    }

    public static void main(String [] args){
        p7 obj = new p7();
    }
}