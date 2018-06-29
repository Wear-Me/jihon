import java.io.File;
import java.awt.*;
import javax.swing.*;
import java.util.*;
public class wear_class extends JFrame {
	File []list;
	File path;
	public ImageIcon img;
	private JLabel lblNewLabel;
	public static void main(String[] args) {
		wear_class f = new wear_class();
			
	}


	public wear_class() {
		Render();
	}
	public void Render()
	{
		ImageSave();
		
		setSize(360,652);
		this.img = new ImageIcon("./image//Style//"+list[0].getName());
		getContentPane().setLayout(null);

		lblNewLabel = new JLabel(img);
		lblNewLabel.setBounds(148,15, 173, 157);
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel((Icon) null);
		label.setBounds(148, 199, 173, 157);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel((Icon) null);
		label_1.setBounds(148, 395, 173, 157);
		getContentPane().add(label_1);
		setVisible(true);	
	}
	void ImageSave()
	{
		 path = new File("./image//Style//");
		 list = path.listFiles();	
	}


}