import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.Iterator;

import javax.swing.*;

public class Welcome extends JFrame{
	
	private static JFrame frame;
	private static JPanel startPanel;
	private static JPanel namePanel;
	private static JPanel rainPanel;
	private static JPanel wordTypePanel;
	private static JPanel timePanel;
	private static JLabel category;

	private static JButton c1Bt;	
	private static JButton c2Bt;
	private static JButton c3Bt;
	private static JButton c4Bt;
	private static JButton c5Bt;
	private static JButton randomBt;
	
	public static Rainy_Words game;

	// width and height of main window
	private final static int MAINWINDOW_WIDTH = 600;
	private final static int MAINWINDOW_HEIGHT = 600;

	// default width of any created text field
	private final static int TEXTFIELD_WIDTH = 25;

	// width and height of any dialog window to be created
	private final static int DIALOG_WIDTH = 400;
	private final static int DIALOG_HEIGHT = 180;

	private JFrame nameWindow;
	private JPanel topnameWindow, bottomnameWindow;
	private JTextField nameFill;
	private JButton okAdd, cancelAdd, rd;
	private static JLabel please;
	private static JLabel name1;
	private static JLabel name2;
	private static JLabel word;
	private static JLabel time;
	private static JTextField wordTextBox;
	private static JButton submitBt;

	// bam
	private static JLabel score1;
	private static JLabel score2;
	private static JPanel user1;
	private static int updatedScore = game.score; 
	int delay=10;
	

	public Welcome() {

		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame = new JFrame("Rainy Words");
		frame.setPreferredSize(new Dimension(800, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setMinimumSize(new Dimension(800, 600));
		frame.setVisible(true);

		startPanel = new JPanel();
		startPanel.setLayout(new GridLayout(7, 1));
		frame.add(startPanel, BorderLayout.CENTER);
		
		category = new JLabel("Choose Category");
		startPanel.add(category, BorderLayout.CENTER);
		
		c1Bt = new JButton("Netcentric");
		c1Bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int topLeftX = getX();
				int topLeftY = getY();
				int xDialogPosition = topLeftX
						+ (MAINWINDOW_WIDTH - DIALOG_WIDTH) / 2;
				int yDialogPosition = topLeftY
						+ (MAINWINDOW_HEIGHT - DIALOG_HEIGHT) / 2;

				nameWindow.setLocation(xDialogPosition, yDialogPosition);
				nameWindow.setVisible(true);
				game.cat=1;
			}
		 });
		startPanel.add(c1Bt, BorderLayout.CENTER);
		
		c2Bt = new JButton("Animals");
		c2Bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int topLeftX = getX();
				int topLeftY = getY();
				int xDialogPosition = topLeftX
						+ (MAINWINDOW_WIDTH - DIALOG_WIDTH) / 2;
				int yDialogPosition = topLeftY
						+ (MAINWINDOW_HEIGHT - DIALOG_HEIGHT) / 2;

				nameWindow.setLocation(xDialogPosition, yDialogPosition);
				nameWindow.setVisible(true);
				game.cat=2;
			}
		 });
		startPanel.add(c2Bt, BorderLayout.CENTER);
		
		c3Bt = new JButton("Brandname");
		c3Bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int topLeftX = getX();
				int topLeftY = getY();
				int xDialogPosition = topLeftX
						+ (MAINWINDOW_WIDTH - DIALOG_WIDTH) / 2;
				int yDialogPosition = topLeftY
						+ (MAINWINDOW_HEIGHT - DIALOG_HEIGHT) / 2;

				nameWindow.setLocation(xDialogPosition, yDialogPosition);
				nameWindow.setVisible(true);
				game.cat=3;
			}
		 });
		startPanel.add(c3Bt, BorderLayout.CENTER);
		
		c4Bt = new JButton("Desserts");
		c4Bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int topLeftX = getX();
				int topLeftY = getY();
				int xDialogPosition = topLeftX
						+ (MAINWINDOW_WIDTH - DIALOG_WIDTH) / 2;
				int yDialogPosition = topLeftY
						+ (MAINWINDOW_HEIGHT - DIALOG_HEIGHT) / 2;

				nameWindow.setLocation(xDialogPosition, yDialogPosition);
				nameWindow.setVisible(true);
				game.cat=4;
			}
		 });
		startPanel.add(c4Bt, BorderLayout.CENTER);
		
		c5Bt = new JButton("Nations");
		c5Bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int topLeftX = getX();
				int topLeftY = getY();
				int xDialogPosition = topLeftX
						+ (MAINWINDOW_WIDTH - DIALOG_WIDTH) / 2;
				int yDialogPosition = topLeftY
						+ (MAINWINDOW_HEIGHT - DIALOG_HEIGHT) / 2;

				nameWindow.setLocation(xDialogPosition, yDialogPosition);
				nameWindow.setVisible(true);
				game.cat=5;
			}
		 });
		startPanel.add(c5Bt, BorderLayout.CENTER);
		
		randomBt = new JButton("Random");
		randomBt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int topLeftX = getX();
				int topLeftY = getY();
				int xDialogPosition = topLeftX
						+ (MAINWINDOW_WIDTH - DIALOG_WIDTH) / 2;
				int yDialogPosition = topLeftY
						+ (MAINWINDOW_HEIGHT - DIALOG_HEIGHT) / 2;

				nameWindow.setLocation(xDialogPosition, yDialogPosition);
				nameWindow.setVisible(true);
				game.cat=6;
			}
		 });
		startPanel.add(randomBt, BorderLayout.CENTER);
		
	
		//Dialogue Box
		nameWindow = new JFrame("Name");
		nameWindow.setSize(DIALOG_WIDTH, DIALOG_HEIGHT);
		nameWindow.setResizable(false);
		topnameWindow = new JPanel();
		// topnameWindow.setLayout(new GridLayout(1, 2));
		please = new JLabel("Please fill your name.");
		// name = new JLabel("Name:");
		nameFill = new JTextField();
		nameFill.setColumns(TEXTFIELD_WIDTH);
		topnameWindow.add(please, BorderLayout.NORTH);
		// topnameWindow.add(name,BorderLayout.WEST);
		topnameWindow.add(nameFill, BorderLayout.CENTER);
		bottomnameWindow = new JPanel();
		bottomnameWindow.setLayout(new GridLayout(1, 6));
		okAdd = new JButton("Okay");
		cancelAdd = new JButton("Cancel");
		bottomnameWindow.add(new JLabel());
		bottomnameWindow.add(okAdd);
		bottomnameWindow.add(new JLabel());
		bottomnameWindow.add(new JLabel());
		bottomnameWindow.add(cancelAdd);
		bottomnameWindow.add(new JLabel());
		nameWindow.setLayout(new GridLayout(3, 1));
		nameWindow.add(topnameWindow);
		nameWindow.add(new JLabel());
		nameWindow.add(bottomnameWindow);
		nameWindow.setVisible(false);

		
		
		okAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (nameFill.getText().equals("")) {
				} else {

					// bam
					nameWindow.setVisible(false);
					String name = nameFill.getText();
					nameFill.setText("");
					frame.remove(startPanel);

					namePanel = new JPanel();
					namePanel.setBorder(BorderFactory.createEtchedBorder());
					namePanel.setLayout(new GridLayout(1, 5));

					rd = new JButton("Ready?!");
					rdAction();
					namePanel.add(rd, BorderLayout.CENTER);

					name1 = new JLabel(name + ": ");
					score1 = new JLabel("");

					System.out.println(game.score);
					score1.setText(game.score + "");

					user1 = new JPanel();
					user1.setLayout(new GridLayout(1, 2));
					user1.add(name1);
					user1.add(score1);
					namePanel.add(user1);

					name2 = new JLabel(name + ": ");
					namePanel.add(name2, BorderLayout.CENTER);

					timePanel = new JPanel();
					time = new JLabel("Time: ");
					timePanel.add(time, BorderLayout.CENTER);
					namePanel.add(timePanel, BorderLayout.CENTER);

					frame.add(namePanel, BorderLayout.NORTH);
					rainPanel = new JPanel();

					game = new Rainy_Words();
					rainPanel.setLayout(new GridLayout(1, 1));
					rainPanel.add(game);
					frame.add(rainPanel);

					wordTypePanel = new JPanel();
					wordTypePanel.setBorder(BorderFactory.createEtchedBorder());
					word = new JLabel("Type the word here!");
					wordTextBox = new JTextField();
					wordTextBox.setColumns(TEXTFIELD_WIDTH);
					wordTextBoxAction();
					submitBt = new JButton("Submit");
					submitAction();
					wordTypePanel.add(word, BorderLayout.WEST);
					wordTypePanel.add(wordTextBox, BorderLayout.CENTER);
					wordTypePanel.add(submitBt, BorderLayout.EAST);
					frame.add(wordTypePanel, BorderLayout.SOUTH);
					frame.validate();
				}
			}
		});

		nameFill.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (!nameFill.getText().equals("")
						&& e.getKeyCode() == KeyEvent.VK_ENTER) {
					//bam
					nameWindow.setVisible(false);
					String name = nameFill.getText();
					nameFill.setText("");
					frame.remove(startPanel);

					namePanel = new JPanel();
					namePanel.setBorder(BorderFactory.createEtchedBorder());
					namePanel.setLayout(new GridLayout(1, 4));

					rd = new JButton("Ready?!");
					rdAction();
					namePanel.add(rd);

					name1 = new JLabel(name + ": ");
					score1 = new JLabel();
					score1.setText("0");
					user1 = new JPanel();
					user1.setLayout(new GridLayout(1, 2));
					user1.add(name1);
					user1.add(score1);
					namePanel.add(user1);

					name2 = new JLabel(name + ": ");
					namePanel.add(name2);

					timePanel = new JPanel();
					time = new JLabel("Time: ");
					timePanel.add(time);
					namePanel.add(timePanel);

					frame.add(namePanel, BorderLayout.NORTH);
					rainPanel = new JPanel();

					frame.add(namePanel, BorderLayout.NORTH);
					rainPanel = new JPanel();

					game = new Rainy_Words();
					rainPanel.setLayout(new GridLayout(1, 1));
					rainPanel.add(game);
					frame.add(rainPanel);

					wordTypePanel = new JPanel();
					wordTypePanel.setBorder(BorderFactory.createEtchedBorder());
					word = new JLabel("Type the word here!");
					wordTextBox = new JTextField();
					wordTextBox.setColumns(TEXTFIELD_WIDTH);
					wordTextBoxAction();
					submitBt = new JButton("Submit");
					submitAction();
					wordTypePanel.add(word, BorderLayout.WEST);
					wordTypePanel.add(wordTextBox, BorderLayout.CENTER);
					wordTypePanel.add(submitBt, BorderLayout.EAST);
					frame.add(wordTypePanel, BorderLayout.SOUTH);
					frame.validate();
				}
			}
		});

		// behavior when the "Cancel" button in the dialog is clicked.
		cancelAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				nameFill.setText("");
				nameWindow.setVisible(false);
			}
		});
	}

	// bam
	public void submitAction() {
		submitBt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent a) {
				
				game.text = wordTextBox.getText();
				System.out.println(game.text);
				wordTextBox.setText("");
				
//				while(true){
//					System.out.println("while loop");
//					System.out.println(game.updated);
//					System.out.println(game.score);
//					if(game.updated==true){ break;}
//				}
				
				score1.setText(game.score + "");
				System.out.println(game.score);
				namePanel.repaint();
				//game.updated=false;
				System.out.println("repaint la ja");
			}
		});
	}

	public void rdAction() {
		rd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent a) {
				game.init();
				
				rd.setEnabled(false);
			    final long fiveMin = 300000;
			       final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("mm : ss");
			       final JLabel clock = new JLabel(sdf.format(new Date(fiveMin)),JLabel.CENTER);
			       Timer t;
			       //boolean tu = true;
			       t = new javax.swing.Timer(1000,new ActionListener(){
			        long x = fiveMin;
			     @Override
			     public void actionPerformed(ActionEvent e) {
			      // TODO Auto-generated method stub
			      if(x>=0){
			            clock.setText(sdf.format(new Date(x)));
			            x -= 1000;
			           }else{
			            game.tu = false;
			            
			           }
			     }
			        
			       });
			       t.start();
			       
			       timePanel.add(clock, BorderLayout.WEST);
			       pack();
			}
		});
		
//		rd.setEnabled(false);
//	    final long fiveMin = 5000;
//	       final java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("mm : ss");
//	       final JLabel clock = new JLabel(sdf.format(new Date(fiveMin)),JLabel.CENTER);
//	       Timer t;
//	       //boolean tu = true;
//	       t = new javax.swing.Timer(1000,new ActionListener(){
//	        long x = fiveMin;
//	     @Override
//	     public void actionPerformed(ActionEvent e) {
//	      // TODO Auto-generated method stub
//	      if(x>=0){
//	            clock.setText(sdf.format(new Date(x)));
//	            x -= 1000;
//	           }else{
//	            game.tu = false;
//	            
//	           }
//	     }
//	        
//	       });
//	       t.start();
//	       if(!tu){
//	        t.stop();
//	        System.out.println("timeUp");
//	       }
	}

	public void wordTextBoxAction() {
		wordTextBox.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				namePanel.repaint();
				if (!wordTextBox.getText().equals("")
						&& e.getKeyCode() == KeyEvent.VK_ENTER) {
					game.text = wordTextBox.getText();
					System.out.println(game.text);
					wordTextBox.setText("");
					
//					while(true){
//						System.out.println("while loop");
//						System.out.println(game.updated);
//						System.out.println(game.score);
//						if(game.updated==true){ break;}
//					}
//					while(updatedScore<=game.score){
//						updatedScore = game.score;
//						if(updatedScore>game.score) break;
//						
//					}
					score1.setText(game.score + "");
					namePanel.repaint();
					System.out.println("repaint la ja");
				}
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setDefaultLookAndFeelDecorated(false);
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Welcome();
			}
		});
	}

}
