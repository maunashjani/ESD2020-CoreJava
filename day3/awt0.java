import java.awt.*; 
import java.awt.event.*; 
class awt0 extends Frame {  
    awt0()
    {  
        Label lbl=new Label("Welcome to Java AWT");  
        lbl.setBounds(30,100,300,30);// set label position  x coordinate, y coordinate, w, h.
        add(lbl);//adds label into frame  
        setSize(300,300);
        setLayout(null);  
        setVisible(true);
    }  
    public static void main(String args[]){  
        awt0 f=new awt0(); 
    }
}