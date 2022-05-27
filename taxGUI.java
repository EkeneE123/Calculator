import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class taxGUI {

    public static void main(String[] args)
    {
        int textBoxWidth = 100;
        int textBoxHeight = 20;
        ImageIcon calc = new ImageIcon("calc2.png");
        ImageIcon check = new ImageIcon("check.png");

        JFrame frame = new JFrame("Yearly Income Calculator");
        JPanel panel = new JPanel();
        panel.setBackground(new Color(201, 201, 201));
        panel.setLayout(null);
        
        
    
        JLabel labelOne = new JLabel("Hourly Wage", SwingConstants.CENTER);
        labelOne.setBounds(-15, 67, 200, 125);
        labelOne.setFont(new Font("Helvetica",Font.BOLD,15));
        labelOne.setForeground(new Color(120, 120, 120));
        panel.add(labelOne);

        JTextField userInputOne = new JTextField();
        userInputOne.setBounds(210, 120, textBoxWidth, textBoxHeight);
        panel.add(userInputOne);

        
        JLabel labelTwo = new JLabel("Hours Worked(per day)");
        labelTwo.setBounds(40, 120, 300, 125);
        labelTwo.setFont(new Font("Helvetica",Font.BOLD,15));
        labelTwo.setForeground(new Color(120, 120, 120));
        panel.add(labelTwo);

        JTextField userInputTwo = new JTextField();
        userInputTwo.setBounds(210, 173, textBoxWidth, textBoxHeight);
        panel.add(userInputTwo);

        JLabel labelThree = new JLabel("Days Worked(per week)");
        labelThree.setBounds(40, 175, 250, 125);
        labelThree.setFont(new Font("Helvetica",Font.BOLD,15));
        labelThree.setForeground(new Color(120, 120, 120));
        panel.add(labelThree);

        JTextField userInputThree = new JTextField();
        userInputThree.setBounds(210, 228, textBoxWidth, textBoxHeight);
        panel.add(userInputThree);

        JLabel labelDotDot = new JLabel("");
        labelDotDot.setBounds(90, 290, 300, 125);
        labelDotDot.setFont(new Font("Helvetica",Font.PLAIN,13));
        panel.add(labelDotDot);

        JLabel mainLabel = new JLabel("Yearly Income Calculator");
        mainLabel.setBounds(85, -10, 300, 125);
        mainLabel.setFont(new Font("Helvetica",Font.BOLD,16));
        mainLabel.setForeground(new Color(79, 78, 78));
        panel.add(mainLabel);

        JLabel calc1 = new JLabel("");
        calc1.setIcon(calc);
        calc1.setBounds(280, -10, 300, 125);
        panel.add(calc1);

        JLabel check1 = new JLabel("");
        check1.setIcon(check);
        check1.setBounds(260, 247, 300, 125);
        panel.add(check1);


        JButton buttonOne = new JButton("CALCULATE");
        buttonOne.setBounds(160,295,100,30);
        buttonOne.setFont(new Font("Helvetica",Font.BOLD,12));
        panel.add(buttonOne);


        
        buttonOne.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent x)
            {
                Double gross = calculateGross(userInputOne, userInputTwo, userInputThree);

                labelDotDot.setText("Your yearly gross income is " + "$" + gross);

            }

        });
        
        
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,430);
        frame.setResizable(false);


        
 }

 
 
private static Double calculateGross(JTextField wageHr, JTextField hoursPerDay, JTextField daysPerWeek)
{
     Double wage = Double.parseDouble(wageHr.getText());
     Double hours = Double.parseDouble(hoursPerDay.getText());
     Double days = Double.parseDouble(daysPerWeek.getText());

     Double total = ((wage * hours) * days) * 52;

     return total;
    


}





}
