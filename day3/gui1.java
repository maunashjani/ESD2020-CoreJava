import java.awt.*;

class gui1 extends Frame{
    
    public gui1(){
        Label lbl = new Label("Welcome to Java!");
        //x,y,w,h
        lbl.setBounds(30, 100, 300, 30);
        add(lbl);
        Button btn = new Button("Submit");
        btn.setBounds(30, 150, 50, 30);
        add(btn);
        TextField txt = new TextField();
        txt.setBounds(30, 200, 50, 20);
        add(txt);
        Checkbox cb = new Checkbox("Hobbie1");
        cb.setBounds(30, 250, 50, 30);
        add(cb);
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox rb1 = new Checkbox("Male", cbg, false);
        rb1.setBounds(30, 300, 60, 30);
        add(rb1);
        Checkbox rb2 = new Checkbox("Female", cbg, false);
        rb2.setBounds(30, 350, 60, 30);
        add(rb2);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args){
        gui1 g = new gui1();
    }
}