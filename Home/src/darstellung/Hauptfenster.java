package darstellung;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Hauptfenster extends JFrame implements ActionListener{

	private static final long serialVersionUID = -3541541868178379848L;

	public Hauptfenster(){
		super("Sammlung");
		try{
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		}catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){
			e.printStackTrace();
		}

		
		setSize(905,600);
		getContentPane().setLayout(null);
		setResizable(false);
		setJMenuBar(mainMenu());
		setVisible(true);
		
	}
	
	private JMenuBar mainMenu(){
		JMenuBar menu = new JMenuBar();
		JMenu mnDatei = new JMenu("Datei");
		
		JMenuItem mntmHinzufgen = new JMenuItem("Hinzufügen");
		mnDatei.add(mntmHinzufgen);
		JMenuItem mntmBeenden = new JMenuItem("Beenden");
		mnDatei.add(mntmBeenden);
		mntmBeenden.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);			
			}
		});
		menu.add(mnDatei);
		
		JMenu mnBearbeiten = new JMenu("Bearbeiten");
		menu.add(mnBearbeiten);
		
		JMenu mnInfo = new JMenu("Info");
		menu.add(mnInfo);
		
		
		return menu;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
