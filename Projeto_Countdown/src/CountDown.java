import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDown extends JFrame implements Runnable, MouseListener {
	
	JLabel contador;
	int    tempo;
	public CountDown() {
		setSize(400, 300);
		setVisible(true);
		setTitle("Cronometro regressivo");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contador = new JLabel();
		//contador.setText("-----");
		contador.setIcon(new ImageIcon("/Users/isidro/Desktop/workspace_java/Projeto_Countdown/knight.png"));
		tempo = 20;
		setLayout(null);
		contador.setBounds(50, 100, 100, 100);
		getContentPane().add(contador);
		Thread t = new Thread(this);
		t.start();
		addMouseListener(this);
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			//contador.setText("Tempo "+tempo);
			int x = contador.getX();
			contador.setBounds(x+10, 100,100,100);
			try {
				Thread.sleep(100);
			}
			catch(Exception ex) {
				
			}
		}
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Cliquei com o mouse");
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Entrei com o mouse na tela");
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("saí da tela");
	}

}
