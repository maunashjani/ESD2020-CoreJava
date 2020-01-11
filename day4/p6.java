import java.awt.*;
import java.awt.event.*;

class p6 extends Frame implements ItemListener {
    
Label l1, l2;
Checkbox cb1;
Checkbox cb2;

    public p6(){
        l1 = new Label("Choose movie(s):");
        l1.setBounds(20, 30, 100, 20);
        add(l1);

        cb1 = new Checkbox("Movie1");
        cb1.setBounds(20, 60, 60, 20);
        cb1.addItemListener(this);
        add(cb1);
        
        cb2 = new Checkbox("Movie2");
        cb2.setBounds(80, 60, 60, 20);
        cb2.addItemListener(this);
        add(cb2);

        l2 = new Label();
        l2.setBounds(160, 60, 200, 20);
        add(l2);

        setSize(350, 350);
        setLayout(null);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e){
        if(e.getSource()==cb1)
        {
            if(e.getStateChange()==1)
            {
                l2.setText(l2.getText() + "" + cb1.getLabel());
            }
            else
            {
                l2.setText("");
            }
        }
        if(e.getSource()==cb2)
        {
            if(e.getStateChange()==1)
            {
                l2.setText(l2.getText() + "" + cb2.getLabel());
            }
            else
            {
                l2.setText("");
            }
        }
    }

    public static void main(String [] args)
    {
        p6 obj = new p6();
    }
}