import java.awt.*;
import java.awt.event.*;

class p4 extends Frame implements ActionListener {
    Label lbl, lbl1;
    Button btn;
    TextField txt;

    public p4(){
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
        setSize(350, 350);
        setLayout(null);
        setVisible(true);
        setTitle("New Form");
    }

    public void actionPerformed(ActionEvent e){
        String result = txt.getText();
        lbl1.setText("Name is "+ result);
    }

    public static void main(String [] args){
        p4 obj = new p4();
    }
}