import java.awt.*;

class p1 extends Frame {
    public p1(){
        Label lbl = new Label("Welcome To Java!");
        lbl.setBounds(30,80, 300, 30);
        add(lbl);
        setSize(350, 350);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String [] args){
        p1 obj = new p1();
    }
}