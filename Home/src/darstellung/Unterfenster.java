package darstellung;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

import javax.sound.midi.MidiUnavailableException;
import javax.swing.JDialog;

public abstract class Unterfenster extends JDialog {

	
		public Unterfenster(){
			super();
			setSize(640,480);
			setModal(true);
			setLayout(null);
			setResizable(false);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//			try{
//				
//			}catch(MidiUnavailableException ex){
//				System.err.println("Die Sprachdatei konnte nicht geladen werden.");
//			}
		}
		
		public Unterfenster(Component c){
			this();
			setLocationRelativeTo(c);
		}
		
		public ActionListener close(){
			ActionListener al = new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			};
			return al;
		}
}
