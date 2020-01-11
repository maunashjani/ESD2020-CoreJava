import java.awt.*;
import java.awt.event.*;  

class demo2 implements ActionListener {
    public static void main(String[] args){
        Frame f = new Frame("Action Form");
        final Label lbl = new Label("Welcome To Java!");
        lbl.setBounds(30,80, 300, 30);
        f.add(lbl);
        Button b1 = new Button("Change Text");
        b1.setBounds(30, 120, 90, 30);
        b1.addActionListener(this);  
        f.add(b1);
        f.setSize(350, 350);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){  
        lbl.setText("Welcome to GUI programming.");  
    }  
}