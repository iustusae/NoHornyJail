package GUI.ColorChooser;


import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorChooser implements ChangeListener{
	
	JFrame window;
	JColorChooser cc;
	JPanel colorChooserPanel, colorPanel;
	public ColorChooser(){
		
		window = new JFrame();
		window.setSize(800, 600);
		
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		
		colorChooserPanel = new JPanel();
		colorChooserPanel.setBounds(100, 50, 600, 350);
		colorChooserPanel.setBackground(Color.black);
		window.add(colorChooserPanel);
		
		cc = new JColorChooser();
		cc.getSelectionModel().addChangeListener(this);
		
		// to remove preview panel
		cc.setPreviewPanel(new JPanel());
		
		// to remove the panes
//		cc.removeChooserPanel(cc.getChooserPanels()[4]); // CMYK
//		cc.removeChooserPanel(cc.getChooserPanels()[3]); // RGB
//		cc.removeChooserPanel(cc.getChooserPanels()[2]); // HSL
//		cc.removeChooserPanel(cc.getChooserPanels()[1]); // HSV
//		cc.removeChooserPanel(cc.getChooserPanels()[0]); // Swatch
		
		colorChooserPanel.add(cc);
		
		colorPanel = new JPanel();
		colorPanel.setBounds(200, 420, 400, 100);
		colorPanel.setBackground(Color.white);
		window.add(colorPanel);
				
		window.setVisible(true);
	}
	
	public void stateChanged(ChangeEvent e){
		
		Color newColor = cc.getColor();
		colorPanel.setBackground(newColor);
                System.out.println(newColor.getBlue());
	}	
}

