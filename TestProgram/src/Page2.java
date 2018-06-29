import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
@SuppressWarnings("serial") 
public class Page2 extends JFrame {
	private JPanel contentPane;
	public Page2() {
		Render();
	}
	public  void Render()
	{
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 500, 500, 800);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("");
		button.setSize(95,34);
		button.setLocation(43,100);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(43, 41, 95, 34);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBounds(43, 158, 95, 34);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setBounds(274, 290, 95, 34);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setBounds(43, 225, 95, 34);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setBounds(43, 290, 95, 34);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setBounds(274, 225, 95, 34);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setBounds(274, 158, 95, 34);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("");
		button_8.setBounds(274, 100, 95, 34);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("");
		button_9.setBounds(274, 41, 95, 34);
		contentPane.add(button_9);
	
	}
}