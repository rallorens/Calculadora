
import javax.swing.JFrame;

public class Calculadoras extends JFrame {
	public Calculadoras(){
		super("Calculadora");
	    Ca c = getContentPane();
	    
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
	}
	public static void main(String[] args){
		new Calculadoras();
	}
	
}