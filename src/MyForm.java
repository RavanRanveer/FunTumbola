import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyForm extends JFrame {
  private int count;

    public MyForm() {
        this.setTitle("TamBolaFun");
        this.setSize(400,400);
        this.setVisible(true);
        JLabel jl1 = new JLabel();
         JButton button1 = new JButton();
         JButton button2 = new JButton("Max");
        JTextField inputMax = new JTextField();
        this.add(button1);
        this.add(jl1);
        this.add(button2);
        this.add(inputMax);
        button2.setBounds(200,100,60,30);
        button1.setBounds(100,100,40,20);
        inputMax.setBounds(0,100,40,40);

        JPanel jp1 = new JPanel();

        inputMax.setBackground(Color.RED);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String result = (inputMax.getText());

                if(result != null && result.length() > 0){
                    int max = Integer.parseInt(result);
                }else {
                    jl1.setText("None selected");
                }
            }
        });

        inputMax.setSize(100,100);
        RandomNumberGenerator generator = new HousieNumberGenerator();

            button1.addActionListener(e -> {
                if(count<2){
            jl1.setText("Number is " + generator.generateRandomNumber(1, 99) );

               // System.out.println(generator.generateRandomNumber(1, 99));
                count++;
//                Thread t =  Thread.currentThread();
//                try {
//                    t.sleep(3000);
//                } catch (InterruptedException ex) {
//                    ex.printStackTrace();
//                }

            }
        });

    }
}
