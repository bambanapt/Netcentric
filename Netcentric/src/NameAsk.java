import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import javax.swing.*;

public class NameAsk {
	// Creating the main window of our application
	final JFrame frame = new JFrame();
	
	public void main(String[]args){
	// Release the window and quit the application when it has been closed
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	// Creating a button and setting its action
	final JButton clickMeButton = new JButton("Click Me!");
	clickMeButton.addActionListener(new ActionListener() {

	    public void actionPerformed(ActionEvent e) {
	        // Ask for the user name and say hello
	        String name = JOptionPane.showInputDialog("What is your name?");
	        JOptionPane.showMessageDialog(frame, "Hello " + name + '!');
	    }
	});

	// Add the button to the window and resize it to fit the button
	frame.getContentPane().add(clickMeButton);
	frame.pack();

	// Displaying the window
	frame.setVisible(true);
	}

}
