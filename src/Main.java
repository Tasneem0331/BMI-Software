import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    public ImageIcon img,man,woman;
   public  JRadioButton male,female;
   public  JLabel img1,img2,age,height,weight,title,text;
   public  ButtonGroup grp;
    public  JTextField top,h1,h2,w;
      public JButton cal,clear;

public int c1=-1;
     Container c;
     Font f;
Main() {
    c=this.getContentPane();
    c.setLayout(null);
    f=new Font("Arial",Font.BOLD,15);
image();
title=new JLabel("BMI CALCULATOR");
title.setBounds(10,10,470,40);
title.setOpaque(true);
title.setHorizontalAlignment(JLabel.CENTER);
title.setBackground(Color.orange);
title.setFont(f);
c.add(title);
    man=new ImageIcon(getClass().getResource("final3.png"));
    img1=new JLabel(man);
    img1.setBounds(110,70,man.getIconWidth(),man.getIconHeight());
    c.add(img1);

male=new JRadioButton("Men");
male.setSelected(true);
male.setBounds(120,190,100,30);
male.setFont(f);

c.add(male);
    woman=new ImageIcon(getClass().getResource("final2.png"));
    img2=new JLabel(woman);
    img2.setBounds(250,70,woman.getIconWidth(),woman.getIconHeight());
    c.add(img2);

    female=new JRadioButton("Women");
    female.setBounds(250,190,100,30);
    female.setFont(f);
    c.add(female);


    grp=new ButtonGroup();
    grp.add(female);
    grp.add(male);

    age=new JLabel(" Your Age:");
    age.setForeground(Color.blue);
    age.setBounds(80,240,200,30);
    age.setFont(f);
    c.add(age);

    top=new JTextField();
    top.setBounds(170,240,100,30);
    top.setHorizontalAlignment(JTextField.CENTER);
    top.setFont(f);
    c.add(top);
    height=new JLabel(" Your Height");
    height.setForeground(Color.blue);
    height.setBounds(80,280,100,30);
    height.setFont(f);
    c.add(height);
    text=new JLabel("Ft              Inch                                                    Kg");
    text.setBounds(80,340,400,30);
    c.add(text);

    weight=new JLabel(" Your Weight");
    weight.setForeground(Color.blue);
    weight.setBounds(280,280,100,30);
    weight.setFont(f);
    c.add(weight);

    h1=new JTextField();
    h1.setBounds(60,320,50,30);
    h1.setHorizontalAlignment(JTextField.CENTER);
    h1.setFont(f);
    c.add(h1);
    h2=new JTextField();
    h2.setBounds(120,320,50,30);
    h2.setHorizontalAlignment(JTextField.CENTER);
    h2.setFont(f);
    c.add(h2);
    w=new JTextField();
    w.setBounds(310,320,50,30);
    w.setHorizontalAlignment(JTextField.CENTER);
    w.setFont(f);
    c.add(w);

h1.addActionListener(this);
h2.addActionListener(this);
w.addActionListener(this);
cal=new JButton("Calculate");
cal.setBounds(250,395,100,40);
cal.setBackground(Color.orange);
c.add(cal);
cal.addActionListener(this);
    clear=new JButton("Clear");
    clear.setBounds(100,395,100,40);
    clear.setBackground(Color.orange);
    c.add(clear);
    clear.addActionListener(this);

}
public void image() {
    img=new ImageIcon(getClass().getResource("bmi.jpg"));
    this.setIconImage(img.getImage());

}

            public static void main(String[] args) {
               Main frame=new Main();
                frame.setVisible(true);
                frame.setTitle("BMI Calculator");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setBounds(100,100,500,500);
                frame.setResizable(false);
            }

    @Override
    public void actionPerformed(ActionEvent e) {

        double m=Double.parseDouble(h1.getText());
           double i=Double.parseDouble(h2.getText());
        double we=Double.parseDouble(w.getText());
int age=Integer.parseInt(top.getText());
        double h=(m*0.3048)+(0.0254*i);
        double bmi=we/(h*h);
double BMI=Math.round(bmi*100)/100.0;

        double maxW=Math.round(24.999*h*h*100)/100.0;

        double minW=Math.round(18.6*h*h*100)/100.0;

        if(e.getSource()==clear){
            h1.setText(null);
            h2.setText(null);
            w.setText(null);
            top.setText(null);
        }

        if(e.getSource()==cal){
           
Result Frame=new Result();
Frame.setVisible(true);
Frame.value.setText(""+BMI);

Frame.test1.setText(""+minW+" Kg - "+maxW+" Kg");
            if(BMI<18.5){
                Frame.status1.setText("UnderWeight");

            }
            else if(BMI>18.5 &&BMI<25){
                Frame.status1.setText("Normal");

            }
            else if(BMI>=25.0 &&BMI<30){
                Frame.status1.setText("Overweight");

            }
            else if(BMI>=30){
               Frame.status1.setText("Obese");

            }
        }
    }
}


