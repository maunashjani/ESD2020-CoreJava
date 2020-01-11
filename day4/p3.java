import java.awt.*;
import java.awt.event.*;

class p3 extends Frame implements ActionListener {
    Label lbl;
    Button btn;

    public p3(){
        lbl = new Label("Welcome To Java!");
        lbl.setBounds(30, 80, 300, 30);
        add(lbl);
        btn = new Button("Change Content");
        btn.setBounds(30, 120, 100, 30);
        btn.addActionListener(this);
        add(btn);
        setSize(350, 350);
        setLayout(null);
        setVisible(true);
        setTitle("New Form");
    }

    public void actionPerformed(ActionEvent e){
        lbl.setText("Welcome to GUI Events");
    }

    public static void main(String [] args){
        p3 obj = new p3();
    }
}