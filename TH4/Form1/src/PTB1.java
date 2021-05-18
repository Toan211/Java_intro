import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PTB1 implements ActionListener {
    
    JFrame frame;
    JTextField textFieldB, textFieldC, textFieldResult;
    JLabel labelB, labelC, labelResult;
    JButton button;

    public PTB1(){

        frame = new JFrame("Giải phương trình bậc 1");
        frame.setSize(300, 320);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        labelB = new JLabel("Hệ số b: ");
        labelB.setBounds(20, 20, 100, 40);
        labelB.setFont(new Font("Arial", Font.PLAIN, 18));
        frame.add(labelB);

        textFieldB = new JTextField();
        textFieldB.setBounds(120, 20, 150, 40);
        textFieldB.setFont(new Font("Arial", Font.PLAIN, 18));
        frame.add(textFieldB);

        labelC = new JLabel("Hệ số c: ");
        labelC.setBounds(20, 80, 100, 40);
        labelC.setFont(new Font("Arial", Font.PLAIN, 18));
        frame.add(labelC);

        textFieldC = new JTextField();
        textFieldC.setBounds(120, 80, 150, 40);
        textFieldC.setFont(new Font("Arial", Font.PLAIN, 18));
        frame.add(textFieldC);

        button = new JButton("Giải");
        button.setBounds(120, 140, 80, 40);
        button.setFont(new Font("Arial", Font.PLAIN, 18));
        button.setFocusable(false);
        button.addActionListener(this);
        frame.add(button);

        labelResult = new JLabel("Kết quả: ");
        labelResult.setBounds(20, 210, 100, 40);
        labelResult.setFont(new Font("Arial", Font.PLAIN, 18));
        frame.add(labelResult);

        textFieldResult = new JTextField();
        textFieldResult.setBounds(120, 210, 150, 40);
        textFieldResult.setFont(new Font("Arial", Font.PLAIN, 18));
        frame.add(textFieldResult);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        float b = Float.parseFloat(textFieldB.getText());
        float c = Float.parseFloat(textFieldC.getText());
        float result = 0;

        if(e.getSource() == button){

            result = (-1)*c/b;
            textFieldResult.setText(String.valueOf(result));

        }

        if(e.getSource() == button){
            if(b==0)
            if(c==0){
                textFieldResult.setText("Phuong trinh vo so nghiệm");
            }
            
            else{
                textFieldResult.setText("Phuong trinh vo nghiệm");
            }
            else{
                result = (-1)*c/b;
                textFieldResult.setText(String.valueOf(result));
            }
  
        }
    } 
}

