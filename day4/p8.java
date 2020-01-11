import java.awt.*;  
import java.awt.event.*;  
public class p8 extends Frame implements KeyListener { 
    Label l;  
    TextField t;  
    public p8(){  
        l=new Label();  
        l.setBounds(20,50,100,20);  
        add(l);
        
        t=new TextField();  
        t.setBounds(20,80,100, 30);  
        t.addKeyListener(this);  
        add(t);  
        
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void keyPressed(KeyEvent e) {  
        l.setText("Key Pressed");
    }  
    public void keyReleased(KeyEvent e) {  
        l.setText("Key Released");
        
        int ascii = e.getKeyCode();

        System.out.println(ascii);

        if((ascii>=48 && ascii <=57) == false)
        {
            t.removeKeyListener(this);
        }   
    }  
    public void keyTyped(KeyEvent e) {  
        l.setText("Key Typed");
    }  
  
    public static void main(String[] args) {  
        p8 obj = new p8();  
    }  
}  