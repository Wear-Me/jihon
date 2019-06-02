import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
@SuppressWarnings("serial")
public class MainPage extends JFrame {
	public CardLayout cards = new CardLayout();
	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					
					MainPage frame = new MainPage();			
					frame.setVisible(true);
					} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
		});
		Render();
	}

	/**
	 * Create the frame.
	 * @throws InterruptedException 
	 */
	@SuppressWarnings("deprecation")
	public MainPage() throws InterruptedException 
	{
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 500, 500, 800);
		
	}
	public static void Render()
	{
		
	}
}
