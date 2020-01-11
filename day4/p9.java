import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

class p9 extends Frame implements ActionListener {
    TextArea ta;
    TextField tf;
    Button b1, b2;
    Label l;
    
    public p9() {
        ta = new TextArea();
        ta.setBounds(20, 50, 300, 200);
        add(ta);

        tf = new TextField();
        tf.setBounds(20, 250, 100, 20);
        add(tf);

        b1 = new Button("Read");
        b1.setBounds(20, 300, 80, 20);
        b1.addActionListener(this);
        add(b1);

        b2 = new Button("Write");
        b2.setBounds(120, 300, 80, 20);
        b2.addActionListener(this);
        add(b2);

        l = new Label();
        l.setBounds(160, 350, 100, 20);
        add(l);

        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1){
            try{
                File file = new File(tf.getText());
                Scanner fr = new Scanner(file);

                while (fr.hasNextLine()) {
                    ta.setText(fr.nextLine());
                }

                fr.close();
            }
            catch(Exception ex)
            {
                l.setText(ex.toString());
            }
        }

        if(e.getSource()==b2){
            try{
                FileWriter fw = new FileWriter(tf.getText());
                fw.write(ta.getText());
                fw.close();
            }
            catch(Exception ex)
            {
                l.setText(ex.toString());
            }

        }
    }

    public static void main(String []args){
        p9 obj = new p9();
    }
}