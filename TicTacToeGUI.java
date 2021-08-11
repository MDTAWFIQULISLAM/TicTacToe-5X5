import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class TicTacToeGUI extends JFrame {
	
	private Container pane;
	private String currentPlayer;
	private JButton [][] board;
	private boolean hasWinner;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem quit;
    private JMenuItem newGame;
    
    
    
    public TicTacToeGUI() {
    	super();
    	pane = getContentPane();
    	pane.setLayout(new GridLayout(5,5));
    	setTitle("Tic Tac Toe");
    	setSize(500,500);
    	setResizable(false);
    	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    	setVisible(true);
    	currentPlayer="X";
    	board = new JButton[5][5];
    	hasWinner=false;
    	intializeMenuBar();
    	intializeBoard();
    }
    
    private void intializeMenuBar() {
    	menuBar= new JMenuBar();
    	menu = new JMenu("File");
    	
    	newGame = new JMenuItem("New Game");
    	newGame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				 resetBoard();
			}
    		
    	});
    	quit = new JMenuItem("Quit");
    	quit.addActionListener(new ActionListener()
    			{

					@Override
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
						
					}
    		
    			});
    	menu.add(newGame);
    	menu.add(quit);
    	menuBar.add(menu);
    	setJMenuBar(menuBar);
    	
    }
    
    private void resetBoard() {
    	currentPlayer="X";
    	hasWinner=false;
    	for(int i=0; i<5;i++) {
    		for(int j= 0 ; j<5;j++) {
    		board[i][j].setText("");
    		}
    		}
    	}
    
    
    private void intializeBoard() {
    	for(int i=0; i<5;i++) {
    		for(int j= 0 ; j<5;j++) {
    			JButton btn = new JButton();
    			btn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,50));
    			board[i][j]=btn;
    			btn.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if(((JButton)e.getSource()).getText().equals("") && 
						hasWinner == false) {
							btn.setText(currentPlayer);
							hasWinner();
							togglePlayer();
						}
						
					}});
    			
    			pane.add(btn);
    		}
    		
    	}
    }
    
    private void togglePlayer() {
    	
    	if(currentPlayer.equals("X"))
    		currentPlayer ="O";
    	else
    		currentPlayer="X";
    }
    
    	private void hasWinner(){
            if(board[0][0].getText().equals(currentPlayer) && board[0][1].getText().equals(currentPlayer) && board[0][2].getText().equals(currentPlayer) &&board[0][3].getText().equals(currentPlayer)&&board[0][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            else if(board[0][0].getText().equals(currentPlayer) && board[1][0].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer) &&board[3][0].getText().equals(currentPlayer)&&board[4][0].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //0,0 0,1, 0,2 0,3 0,4
            else if(board[0][0].getText().equals(currentPlayer) && board[0][1].getText().equals(currentPlayer) && board[0][2].getText().equals(currentPlayer) &&board[0][3].getText().equals(currentPlayer)&&board[0][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //0,1 1,1 2,1 3,1 4,1
            else if(board[0][1].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer) &&board[3][1].getText().equals(currentPlayer)&&board[4][1].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //0,0 0,1, 0,2 0,3 0,4
            else if(board[0][0].getText().equals(currentPlayer) && board[0][1].getText().equals(currentPlayer) && board[0][2].getText().equals(currentPlayer) &&board[0][3].getText().equals(currentPlayer)&&board[0][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            
            //0,2 1,2 2,2 3,2 4,2
            else if(board[0][2].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer) &&board[3][2].getText().equals(currentPlayer)&&board[4][2].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //0,0 0,1, 0,2 0,3 0,4
            else if(board[0][0].getText().equals(currentPlayer) && board[0][1].getText().equals(currentPlayer) && board[0][2].getText().equals(currentPlayer) &&board[0][3].getText().equals(currentPlayer)&&board[0][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //0,3 1,3 2,3 3,3 4,3
            else if(board[0][3].getText().equals(currentPlayer) && board[1][3].getText().equals(currentPlayer) && board[2][3].getText().equals(currentPlayer) &&board[3][3].getText().equals(currentPlayer)&&board[4][3].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            
            //0,0 0,1, 0,2 0,3 0,4
            else if(board[0][0].getText().equals(currentPlayer) && board[0][1].getText().equals(currentPlayer) && board[0][2].getText().equals(currentPlayer) &&board[0][3].getText().equals(currentPlayer)&&board[0][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //0,4 1,4 2,4 3,4 4,4
            else if(board[0][4].getText().equals(currentPlayer) && board[1][4].getText().equals(currentPlayer) && board[2][4].getText().equals(currentPlayer) &&board[3][4].getText().equals(currentPlayer)&&board[4][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //0,0 1,0 2,0 3,0 4,0
            else if(board[0][0].getText().equals(currentPlayer) && board[1][0].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer) &&board[3][0].getText().equals(currentPlayer)&&board[4][0].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //1,0 1,1 1,2 1,3 1,4
            else if(board[1][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer) &&board[1][3].getText().equals(currentPlayer)&&board[1][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //1,0 1,1 1,2 1,3 1,4
            else if(board[1][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer) &&board[1][3].getText().equals(currentPlayer)&&board[1][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //0,1 1,1 2,1 3,1 4,1
            else if(board[0][1].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer) &&board[3][1].getText().equals(currentPlayer)&&board[4][1].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //1,0 1,1 1,2 1,3 1,4
            else if(board[1][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer) &&board[1][3].getText().equals(currentPlayer)&&board[1][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //0,2 1,2 2,2 3,2 4,2
            else if(board[0][2].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer) &&board[3][2].getText().equals(currentPlayer)&&board[4][2].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //1,0 1,1 1,2 1,3 1,4
            else if(board[1][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer) &&board[1][3].getText().equals(currentPlayer)&&board[1][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //0,3 1,3 2,3 3,3 4,3
            else if(board[0][3].getText().equals(currentPlayer) && board[1][3].getText().equals(currentPlayer) && board[2][3].getText().equals(currentPlayer) &&board[3][3].getText().equals(currentPlayer)&&board[4][3].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //1,0 1,1 1,2 1,3 1,4
            else if(board[1][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer) &&board[1][3].getText().equals(currentPlayer)&&board[1][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //0,4 1,4 2,4 3,4 4,4
            else if(board[0][4].getText().equals(currentPlayer) && board[1][4].getText().equals(currentPlayer) && board[2][4].getText().equals(currentPlayer) &&board[3][4].getText().equals(currentPlayer)&&board[4][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //position (2,0)
            //0,0 1,0 2,0 3,0 4,0
            else if(board[0][0].getText().equals(currentPlayer) && board[1][0].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer) &&board[3][0].getText().equals(currentPlayer)&&board[4][0].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //2,0 2,1 2,2 2,3 2,4
            else if(board[2][0].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer) &&board[2][3].getText().equals(currentPlayer)&&board[2][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //2,0 2,1 2,2 2,3 2,4
            else if(board[2][0].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer) &&board[2][3].getText().equals(currentPlayer)&&board[2][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //1,0 1,1 2,1 3,1 4,1
            else if(board[1][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer) &&board[3][1].getText().equals(currentPlayer)&&board[4][1].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //2,0 2,1 2,2 2,3 2,4
            else if(board[2][0].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer) &&board[2][3].getText().equals(currentPlayer)&&board[2][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //0,2 1,2 2,2 3,2 4,2
            else if(board[0][2].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer) &&board[3][2].getText().equals(currentPlayer)&&board[4][2].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //2,0 2,1 2,2 2,3 2,4
            else if(board[2][0].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer) &&board[2][3].getText().equals(currentPlayer)&&board[2][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //0,3 1,3 2,3 3,3 4,3
            else if(board[0][3].getText().equals(currentPlayer) && board[1][3].getText().equals(currentPlayer) && board[2][3].getText().equals(currentPlayer) &&board[3][3].getText().equals(currentPlayer)&&board[4][3].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //2,0 2,1 2,2 2,3 2,4
            else if(board[2][0].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer) &&board[2][3].getText().equals(currentPlayer)&&board[2][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //0,4 1,4 2,4 3,4 4,4
            else if(board[0][4].getText().equals(currentPlayer) && board[1][4].getText().equals(currentPlayer) && board[2][4].getText().equals(currentPlayer) &&board[3][4].getText().equals(currentPlayer)&&board[4][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //3,0 3,1 3,2 3,3 3,4
            else if(board[3][0].getText().equals(currentPlayer) && board[3][1].getText().equals(currentPlayer) && board[3][2].getText().equals(currentPlayer) &&board[3][3].getText().equals(currentPlayer)&&board[3][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //0,0 1,0 2,0 3,0 4,0
            else if(board[0][0].getText().equals(currentPlayer) && board[1][0].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer) &&board[3][0].getText().equals(currentPlayer)&&board[4][0].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //3,0 3,1 3,2 3,3 3,4
            else if(board[3][0].getText().equals(currentPlayer) && board[3][1].getText().equals(currentPlayer) && board[3][2].getText().equals(currentPlayer) &&board[3][3].getText().equals(currentPlayer)&&board[3][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //0,1 1,1 2,1 3,1 4,1
            else if(board[0][1].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer) &&board[3][1].getText().equals(currentPlayer)&&board[4][1].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //3,0 3,1 3,2 3,3 3,4
            else if(board[3][0].getText().equals(currentPlayer) && board[3][1].getText().equals(currentPlayer) && board[3][2].getText().equals(currentPlayer) &&board[3][3].getText().equals(currentPlayer)&&board[3][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //0,2 1,2 2,2 3,2 4,2
            else if(board[0][2].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer) &&board[3][2].getText().equals(currentPlayer)&&board[4][2].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //3,0 3,1 3,2 3,3 3,4
            else if(board[3][0].getText().equals(currentPlayer) && board[3][1].getText().equals(currentPlayer) && board[3][2].getText().equals(currentPlayer) &&board[3][3].getText().equals(currentPlayer)&&board[3][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //0,3 1,3 2,3 3,3 4,3
            else if(board[0][3].getText().equals(currentPlayer) && board[1][3].getText().equals(currentPlayer) && board[2][3].getText().equals(currentPlayer) &&board[3][3].getText().equals(currentPlayer)&&board[4][3].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //3,0 3,1 3,2 3,3 3,4
            else if(board[3][0].getText().equals(currentPlayer) && board[3][1].getText().equals(currentPlayer) && board[3][2].getText().equals(currentPlayer) &&board[3][3].getText().equals(currentPlayer)&&board[3][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //0,4 1,4 2,4 3,4 4,4
            else if(board[0][4].getText().equals(currentPlayer) && board[1][4].getText().equals(currentPlayer) && board[2][4].getText().equals(currentPlayer) &&board[3][4].getText().equals(currentPlayer)&&board[4][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //4,0 4,1 4,2 4,3 4,4
            else if(board[4][0].getText().equals(currentPlayer) && board[4][1].getText().equals(currentPlayer) && board[4][2].getText().equals(currentPlayer) &&board[4][3].getText().equals(currentPlayer)&&board[4][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //0,0 1,0 2,0 3,0 4,0
            else if(board[0][0].getText().equals(currentPlayer) && board[1][0].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer) &&board[3][0].getText().equals(currentPlayer)&&board[4][0].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //4,0 4,1 4,2 4,3 4,4
            else if(board[4][0].getText().equals(currentPlayer) && board[4][1].getText().equals(currentPlayer) && board[4][2].getText().equals(currentPlayer) &&board[4][3].getText().equals(currentPlayer)&&board[4][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //0,1 1,1 2,1 3,1 4,1
            else if(board[0][1].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer) &&board[3][1].getText().equals(currentPlayer)&&board[4][1].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //4,0 4,1 4,2 4,3 4,4
            else if(board[4][0].getText().equals(currentPlayer) && board[4][1].getText().equals(currentPlayer) && board[4][2].getText().equals(currentPlayer) &&board[4][3].getText().equals(currentPlayer)&&board[4][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
          //  0,2 1,2 2,2 3,2 4,2
            else if(board[0][2].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer) &&board[3][2].getText().equals(currentPlayer)&&board[4][2].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //4,0 4,1 4,2 4,3 4,4
            else if(board[4][0].getText().equals(currentPlayer) && board[4][1].getText().equals(currentPlayer) && board[4][2].getText().equals(currentPlayer) &&board[4][3].getText().equals(currentPlayer)&&board[4][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //(0,3 1,3 2,3 3,3 4,3)
            else if(board[0][3].getText().equals(currentPlayer) && board[1][3].getText().equals(currentPlayer) && board[2][3].getText().equals(currentPlayer) &&board[3][3].getText().equals(currentPlayer)&&board[4][3].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //4,0 4,1 4,2 4,3 4,4
            else if(board[4][0].getText().equals(currentPlayer) && board[4][1].getText().equals(currentPlayer) && board[4][2].getText().equals(currentPlayer) &&board[4][3].getText().equals(currentPlayer)&&board[4][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //0,4 1,4 2,4 3,4 4,4
            else if(board[0][4].getText().equals(currentPlayer) && board[1][4].getText().equals(currentPlayer) && board[2][4].getText().equals(currentPlayer) &&board[3][4].getText().equals(currentPlayer)&&board[4][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //
    		//
    		//for corner winning position
    		//0,0 1,1 2,2 3,3 4,4
            else if(board[0][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer) &&board[3][3].getText().equals(currentPlayer)&&board[4][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            //4,0 3,1 2,2 1,3 0,4
            else if(board[4][0].getText().equals(currentPlayer) && board[3][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer) &&board[1][3].getText().equals(currentPlayer)&&board[0][4].getText().equals(currentPlayer)) {
                JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
                hasWinner = true;
            }
            
    }
    
    
    
    
	

}
