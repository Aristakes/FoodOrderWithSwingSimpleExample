import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    JLabel label;

    JCheckBox checkBoxPizza;
    JCheckBox checkBoxBurger;
    JCheckBox checkBoxTea;

    JButton order;

    Main(){

        label = new JLabel("Food Ordering System");

        label.setBounds(50 , 50 ,300 , 20);

        checkBoxPizza = new JCheckBox("Pizza @ 100");

        checkBoxPizza.setBounds(100 ,100 , 150 , 20);

        checkBoxBurger = new JCheckBox("Burger @ 30");

        checkBoxBurger.setBounds(100 , 150 , 150 , 20);

        checkBoxTea = new JCheckBox("Tea @ 10");

        checkBoxTea.setBounds(100 , 200 , 150 , 20);

        order = new JButton("Order");

        order.setBounds(100 , 250 ,80 ,30);

        order.addActionListener(this);

        add(label);
        add(checkBoxPizza);
        add(checkBoxBurger);
        add(checkBoxTea);
        add(order);

        setLayout(null);

        setSize(400 , 400);

        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        float amount = 0;
        String msg = "";

        if(checkBoxPizza.isSelected()){
            amount += 100;
            msg = "Pizza : 100 \n";
        }

        if(checkBoxBurger.isSelected()){
            amount += 30;
            msg += "Burger : 30 \n";
        }

        if(checkBoxTea.isSelected()){
            amount += 10;
            msg += "Tea : 10 \n";
        }

        msg+="___________________\n";

        JOptionPane.showMessageDialog(this , msg + " Total : " + amount);

    }

    public static void main(String[] args){

        new Main();

    }
}
