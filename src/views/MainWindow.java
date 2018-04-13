package views;

import javax.swing.JFrame;

public class MainWindow extends JFrame{

	private static final long serialVersionUID = 1L;

	public MainWindow() {
		
		setSize(300, 400);
		setTitle("Autocompletado de palabras");
		setLocationRelativeTo(null);
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
