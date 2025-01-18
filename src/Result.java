import jdk.swing.interop.LightweightContentWrapper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Result extends JFrame implements ActionListener {
    public JLabel title, result, h5, value, status, status1, weight, test1,test2;
public ImageIcon img1;
    public Font f, f2, f1, f3;
    ImageIcon bmi;
    public JButton exit;
    Container c;

    Result() {

        this.setBounds(590, 100, 525, 640);
        this.setTitle("Result");
        this.setResizable(false);
        img1=new ImageIcon(getClass().getResource("bmi.jpg"));
        this.setIconImage(img1.getImage());
        c = this.getContentPane();
        c.setLayout(null);

        f2 = new Font("Arial", Font.BOLD, 15);
        title = new JLabel("BMI CALCULATOR");
        title.setBounds(10, 5, 490, 40);
        title.setOpaque(true);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBackground(Color.orange);
        title.setFont(f2);
        //c.setBackground(Color.DARK_GRAY);
        c.add(title);
        h5 = new JLabel();
        bmi = new ImageIcon(getClass().getResource("BMI.png"));
        h5 = new JLabel(bmi);
        h5.setBounds(5, 50, bmi.getIconWidth(), bmi.getIconHeight());
        c.add(h5);
        f3 = new Font("Arial", Font.BOLD, 18);
        f = new Font("Arial", Font.PLAIN, 18);


        result = new JLabel("Your BMI");
        result.setBounds(200, 280, 300, 40);
        result.setFont(f3);
        result.setForeground(Color.red);
        c.add(result);
        f1 = new Font("Arial", Font.BOLD, 30);


        value = new JLabel();
        value.setBounds(200, 315, 300, 40);
        value.setFont(f1);
        c.add(value);



        status = new JLabel("Status:");
        status.setBounds(100, 380, 100, 40);
        status.setFont(f3);
        status.setForeground(Color.red);
        c.add(status);
        status1 = new JLabel();
        status1.setBounds(190, 380, 300, 40);
        status1.setFont(f1);
        c.add(status1);

        test2 = new JLabel("Standard Weight :");
        test2.setFont(f3);
        test2.setForeground(Color.red);
        //test1.setForeground(Color.red);
        test2.setBounds(100, 430, 500, 40);
        c.add(test2);
        test1= new JLabel();
        test1.setFont(f3);
        //test1.setForeground(Color.red);
        test1.setBounds(260, 430, 500, 40);
        test1.setFont(f3);
        c.add(test1);




        exit = new JButton("Exit");
        exit.setBounds(200, 530, 80, 40);
        exit.setBackground(Color.orange);
        c.add(exit);
        exit.setFont(f3);
        exit.addActionListener(this);
    }

    public static void main(String[] args) {
        Result New = new Result();
        New.setVisible(true);

        New.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit) {
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                System.exit(0);
            }

        }
    }
}


