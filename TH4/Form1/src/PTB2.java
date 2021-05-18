import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PTB2 implements ActionListener {
    
    JFrame frame;
    JTextField textFieldA, textFieldB, textFieldC, textFieldResult;
    JLabel labelA, labelB, labelC, labelResult;
    JButton button;

    public PTB2(){

        frame = new JFrame("Giải phương trình bậc 2");
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        labelA = new JLabel("Hệ số a: ");
        labelA.setBounds(20, 20, 100, 40);
        labelA.setFont(new Font("Arial", Font.PLAIN, 18));
        frame.add(labelA);

        textFieldA = new JTextField();
        textFieldA.setBounds(120, 20, 150, 40);
        textFieldA.setFont(new Font("Arial", Font.PLAIN, 18));
        frame.add(textFieldA);

        labelB = new JLabel("Hệ số b: ");
        labelB.setBounds(20, 80, 100, 40);
        labelB.setFont(new Font("Arial", Font.PLAIN, 18));
        frame.add(labelB);

        textFieldB = new JTextField();
        textFieldB.setBounds(120, 80, 150, 40);
        textFieldB.setFont(new Font("Arial", Font.PLAIN, 18));
        frame.add(textFieldB);

        labelC = new JLabel("Hệ số c: ");
        labelC.setBounds(20, 140, 100, 40);
        labelC.setFont(new Font("Arial", Font.PLAIN, 18));
        frame.add(labelC);

        textFieldC = new JTextField();
        textFieldC.setBounds(120, 140, 150, 40);
        textFieldC.setFont(new Font("Arial", Font.PLAIN, 18));
        frame.add(textFieldC);

        button = new JButton("Giải");
        button.setBounds(120, 200, 80, 40);
        button.setFont(new Font("Arial", Font.PLAIN, 18));
        button.setFocusable(false);
        button.addActionListener(this);
        frame.add(button);

        labelResult = new JLabel("Kết quả: ");
        labelResult.setBounds(20, 270, 100, 40);
        labelResult.setFont(new Font("Arial", Font.PLAIN, 18));
        frame.add(labelResult);

        textFieldResult = new JTextField();
        textFieldResult.setBounds(120, 270, 150, 40);
        textFieldResult.setFont(new Font("Arial", Font.PLAIN, 18));
        frame.add(textFieldResult);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
 
        double a = Float.parseFloat(textFieldA.getText());
        double b = Float.parseFloat(textFieldB.getText());
        double c = Float.parseFloat(textFieldC.getText());
        double result = 0;

        if (a == 0){
            if(b == 0){
                if (c == 0){
                    textFieldResult.setText("PT vo nghiem");
                }
                else textFieldResult.setText("PT vo so nghiem");
            }
            else {
                result = (-1)*c/b;
                textFieldResult.setText(String.valueOf(result));
            }
        }
        else {
            double D = b*b - 4*a*c;
            
            if(D > 0){
                double x1 = ((-1)*b + Math.sqrt(D))/2*a;
                double x2 = ((-1)*b - Math.sqrt(D))/2*a;

                textFieldResult.setText("x1= " + x1 + ", x2= " + x2);
            }
            else if (D == 0){
                double x = (-1)*b/2*a;

                textFieldResult.setText("x1=x2= " + x);
            }
            else textFieldResult.setText("PT vo nghiem");

        }

    }
}