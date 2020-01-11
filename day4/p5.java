import java.awt.*;
import java.awt.event.*;

class p5 extends Frame implements ActionListener {
    Label lbl, lbl1, lbl2;
    Button btn,btn1,btn2,btn3,btn4,btn5;
    TextField txt,txt1;

    public p5(){
        lbl = new Label("Enter value 1:");
        //lbl.setBounds(30,80, 300, 30);
        add(lbl);
        txt = new TextField("0");
        //txt.setBounds(30, 120, 200, 30);
        add(txt);

        lbl1 = new Label("Enter value 2:");
        //lbl1.setBounds(30, 160, 300, 30);
        add(lbl1);
        txt1 = new TextField("0");
        //txt1.setBounds(30, 200, 200, 30);
        add(txt1);

        btn = new Button("+");
        //btn.setBounds(30, 240, 100, 30);
        btn.addActionListener(this);
        add(btn);

        btn1 = new Button("-");
        //btn1.setBounds(30, 280, 100, 30);
        btn1.addActionListener(this);
        add(btn1);
       
        btn2 = new Button("*");
        //btn2.setBounds(30, 320, 100, 30);
        btn2.addActionListener(this);
        add(btn2);

        btn3 = new Button("/");
        //btn3.setBounds(30, 360, 100, 30);
        btn3.addActionListener(this);
        add(btn3);

        btn4 = new Button("RESET");
        //btn4.setBounds(30, 400, 100, 30);
        btn4.addActionListener(this);
        add(btn4);

        btn5 = new Button("CLOSE");
        //btn5.setBounds(30, 440, 100, 30);
        btn5.addActionListener(this);
        add(btn5);

        lbl2 = new Label();
        //lbl1.setBounds(30, 160, 300, 30);
        add(lbl2);
        
        setSize(200,150);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("Calculator");
    }

    public void actionPerformed(ActionEvent e){
        try
        {

        //here type conversion is to be done
        int v1 = Integer.parseInt(txt.getText());
        int v2 = Integer.parseInt(txt1.getText());
        
        int result = 0;
        
        if(e.getSource()==btn)
        {
            result = v1 + v2;
        }

        if(e.getSource()==btn1)
        {
            result = v1 - v2;
        }

        if(e.getSource()==btn2)
        {
            result = v1 * v2;
        }

        if(e.getSource()==btn3)
        {
            result = v1 / v2;
        }

        if(e.getSource()==btn4){
            txt.setText("0");
            txt1.setText("0");
            lbl2.setText("");
        }

        if(e.getSource()==btn5){
            System.exit(0);
        }

        lbl2.setText(Integer.toString(result));
        }
        catch(Exception ex)
        {
            //ex.printStackTrace();
            txt.setText("0");
            txt1.setText("0");
        }
    }

    public static void main(String [] args){
        p5 obj = new p5();
    }
}