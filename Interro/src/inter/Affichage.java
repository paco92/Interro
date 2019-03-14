package inter;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

import static java.awt.BorderLayout.NORTH;
import static java.awt.BorderLayout.CENTER;
public class Affichage extends JFrame{
	private JFrame frame = new JFrame();
	private JPanel up = new JPanel(new FlowLayout());
	private JPanel down = new JPanel(new FlowLayout());
	private String resultlabel;
	JTextField textfield = new JTextField();  
    JButton b = new JButton("Convert");
    JLabel c = new JLabel("Celcius");
    JLabel f = new JLabel("Fahrenheit");
   
	public Affichage() {
		fenetre();
		b.addActionListener (new ActionListener()
        {
            

            public void actionPerformed(ActionEvent e)
            {
            			String text = textfield.getText();//récupération du nombre
            			int number = Integer.parseInt(text);//convertion string en int
            			Integer result = 0;
            			result=number*9/5+32;
            			resultlabel = result.toString();//convertion int en String
            			f.setText(resultlabel+" Fahrenheit");// implementation du nouveau nomde label
            }
        });
		display();
	}
	
	void fenetre() {
		frame.setTitle("Convert Celcius to Fahrenheit");
		frame.setMinimumSize(new Dimension(250,150));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textfield.setColumns(10);
	}
	//Display fait à partir de deux panel permettant de faire la structure facilement
	void display() {
		up.add(textfield);
		up.add(c);
		down.add(b);
		down.add(f);
		frame.add(up,NORTH);
		frame.add(down, CENTER);
		frame.setVisible(true);
	}
}
