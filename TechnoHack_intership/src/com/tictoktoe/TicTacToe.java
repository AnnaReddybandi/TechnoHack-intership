package com.tictoktoe;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener {
	  Random random=new Random();
	  JFrame frame=new JFrame();
	  JPanel title_panel=new JPanel();
	  JPanel button_panel=new  JPanel();
	  JLabel textfield=new JLabel();
	  JButton[] buttons= new JButton[9];
	  boolean player1_turn;
	  
     TicTacToe() {
    	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 frame.setSize(800, 800);
    	 frame.getContentPane().setBackground(new Color(50,50,50));
    	 frame.setLayout(new BorderLayout());
    	 frame.setVisible(true);
    	 
    	 textfield.setBackground(new Color(25,25,25));
    	 textfield.setForeground(new Color(25,255,0));
    	 textfield.setFont(new Font("Int Free",Font.BOLD,75));
    	 textfield.setHorizontalAlignment(JLabel.CENTER);
    	 textfield.setText("tic-tac-toe");
    	 textfield.setOpaque(true);
    	 
    	 title_panel.setLayout(new BorderLayout());
    	 title_panel.setBounds(0,0,800,100);
    	 
    	 button_panel.setLayout(new GridLayout(3,3));
    	 button_panel.setBackground(new Color(150,150,150));
    	 
    	 for(int i=0;i<9;i++) {
    		 buttons[i]=new JButton();
    		 button_panel.add(buttons[i]);
    		 buttons[i].setFont(new Font("MV Boli",Font.BOLD, 120));
    		 buttons[i].setFocusable(false);
    		 buttons[i].addActionListener(this); 
    	 }
    	 
    	 title_panel.add(textfield);
    	 frame.add(title_panel,BorderLayout.NORTH);
    	 frame.add(button_panel);
    	 Firstturn();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i=0;i<9;i++) {
			if(e.getSource()==buttons[i]) {
				if(player1_turn) {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(255,0,0));
						buttons[i].setText("x");
						player1_turn=false;
						textfield.setText(" 0 turn ");
						Check();
					}
				}
				else {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(0,0,255));
						buttons[i].setText("O");
						player1_turn=true;
						textfield.setText(" X turn ");
						Check();
					}
				}
			}
		}
		
	}
	
	public void Firstturn() {
		if(random.nextInt(2)==0) {
			player1_turn=true;
			textfield.setText("X turn");
			
		}else {
			player1_turn=false;
			textfield.setText(" 0 turn");
		}
		
	}
	public void Check() {
		//check X win condition
		     if(
				(buttons[0].getText()=="x")&&
				(buttons[1].getText()=="x")&&
				(buttons[2].getText()=="x")
				) {
			xWins(0,1,2);
		}
		     if( 
				(buttons[3].getText()=="x")&&
				(buttons[4].getText()=="x")&&
				(buttons[5].getText()=="x")
				) {
			xWins(3,4,5);
		}
		     if( 
				(buttons[6].getText()=="x")&&
				(buttons[7].getText()=="x")&&
				(buttons[8].getText()=="x")
				) {
			xWins(6,7,8);
		}
			
		     if( 
				(buttons[0].getText()=="x")&&
				(buttons[3].getText()=="x")&&
				(buttons[6].getText()=="x")
				) {
			xWins(0,3,6);
		}
		      if( 
				(buttons[1].getText()=="x")&&
				(buttons[4].getText()=="x")&&
				(buttons[7].getText()=="x")
				) {
			xWins(1,4,7);
		}
		     if( 
				(buttons[2].getText()=="x")&&
				(buttons[5].getText()=="x")&&
				(buttons[8].getText()=="x")
				) {
			xWins(6,7,8);
		}
		
		      if( 
				(buttons[0].getText()=="x")&&
				(buttons[4].getText()=="x")&&
				(buttons[8].getText()=="x")
				) {
			xWins(0,4,8);
		}
		     if( 
				(buttons[2].getText()=="x")&&
				(buttons[4].getText()=="x")&&
				(buttons[6].getText()=="x")
				) {
			xWins(2,4,6);
		}
		//check 0 win condition 
		
		     if( 
				(buttons[0].getText()=="O")&&
				(buttons[1].getText()=="O")&&
				(buttons[2].getText()=="O")
				) {
			OWins(0,1,2);
		}
		      if( 
				(buttons[3].getText()=="O")&&
				(buttons[4].getText()=="O")&&
				(buttons[5].getText()=="O")
				) {
			OWins(3,4,5);
		}
		      if( 
				(buttons[6].getText()=="O")&&
				(buttons[7].getText()=="O")&&
				(buttons[8].getText()=="O")
				) {
			OWins(6,7,8);
		}
			
		      if( 
				(buttons[0].getText()=="O")&&
				(buttons[3].getText()=="O")&&
				(buttons[6].getText()=="O")
				) {
			OWins(0,3,6);
		}
		      if( 
				(buttons[1].getText()=="O")&&
				(buttons[4].getText()=="O")&&
				(buttons[7].getText()=="O")
				) {
			OWins(1,4,7);
		}
		      if( 
				(buttons[2].getText()=="O")&&
				(buttons[5].getText()=="O")&&
				(buttons[8].getText()=="O")
				) {
			OWins(6,7,8);
		}
		
		     if( 
				(buttons[0].getText()=="O")&&
				(buttons[4].getText()=="O")&&
				(buttons[8].getText()=="O")
				) {
			OWins(0,4,8);
		}
		      if( 
				(buttons[2].getText()=="O")&&
				(buttons[4].getText()=="O")&&
				(buttons[6].getText()=="O")
				) {
			OWins(2,4,6);
		}
		
	}
	
	public void xWins(int a , int b, int c) {	
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		
		for(int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
		}
		textfield.setText("X wins");
	}
    public void OWins(int a , int b, int c) {
    	buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		
		for(int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
		}
		textfield.setText("O wins");
	}
}
