import java.awt.*;

class p2 {
    public static void main(String[] args){
        //Frame f = new Frame("New Form");
        Frame f = new Frame();
        f.setTitle("New Form Title");
        Label lbl = new Label("Welcome To Java!");
        lbl.setBounds(30,80, 300, 30);
        f.add(lbl);
        f.setSize(350, 350);
        f.setLayout(null);
        f.setVisible(true);
    }
}