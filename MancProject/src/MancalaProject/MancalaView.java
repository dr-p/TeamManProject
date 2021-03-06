package MancalaProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * MancalaView instantiates and creates the components of the main view
 * for the manacala board.
 * @author John Anderson
 * @author Christopher Dal Porto
 * @author Andy Nguyen
 * @version 1.0
 */
public class MancalaView
{
	public JPanel centerPits;
	private MancalaModel model;
	public MancalaView(Borad style, MancalaModel dataModel)
	{
		model = dataModel;//new MancalaModel(); old code
		model.setStyle(style);
	}
	/**
	 * create the center pits
	 * @return centerPits the 12 middle pits
	 */
	public JPanel StartMiddlePits()
	{
		centerPits = new JPanel();
        GridLayout gridLayout = new GridLayout(2,6);
        centerPits.setLayout(gridLayout);
        centerPits.setBackground(Color.LIGHT_GRAY);
        for(int i = 0; i < 12; i++)
        {	
        	Pit temp = new Pit(80,model.getStyle(), 0, i, model);
        	
        	JLabel pit = new JLabel(temp);
        	
        	pit.addMouseListener(temp); // add Mouse listener to each pit object passing pit to it
        	
        	centerPits.add(pit);
        	model.addPit(temp);
        }
		return centerPits;
	}
	/**
	 * updates the JPanel by not reading the pits to the model
	 * @return centerPits  the 12 center pits
	 */
	public JPanel MiddlePitsUpdate()
	{
		centerPits = new JPanel();
		//model.saveUndo();
		 GridLayout gridLayout = new GridLayout(2,6);
	        centerPits.setLayout(gridLayout);
	        centerPits.setBackground(Color.LIGHT_GRAY);
	        for(int i = 0; i < model.pitsSize(); i++) // this needed to be restricted to the current size of pit ArrayList
	        {	
	        	Pit temp = new Pit(80,model.getStyle(), model.getStonesPit(i), i, model);    // model.getStonesPit(i)    this is what should be were 3 is
	        	
	        	JLabel pit = new JLabel(temp);
	        	pit.addMouseListener(temp); // add Mouse listener to each pit object passing pit to it
	        	centerPits.add(pit);
	        }
		return centerPits;
	}
	/**
	 * gives the top label
	 * @return botPanel the top label( name off lol)
	 */
	public JPanel toplabel()
	{
        JPanel botPanel = new JPanel();
        botPanel.setBackground(Color.LIGHT_GRAY);
		 for(int i =1; i < 7; i++)
         { 
                 JLabel tempA = new JLabel("           " + "B" + (7-i) + "            ");
                 botPanel.add(tempA);
         }
		 return botPanel;
	}
	/**
	 * gives the bot label
	 * @return toplabel the top label( name off)
	 */
	public JPanel botlabel()
	{
        JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.LIGHT_GRAY);
		 for(int i =1; i < 7; i++)
         {
                 JLabel tempB = new JLabel( "           " + "A" + (i) + "            ");
                 topPanel.add(tempB);  
         }
		 return topPanel;
	}
	/**
	 * makes the bigpit
	 * @param player the number for player
	 * @return big the jPanel for the big pits
	 */
	public JPanel StartBigPit(int player)
	{
		int temp;
		if(player == 1)
		{
			temp = 0; // to make 1'st spot in arraylist 
		}
		else
		{
			temp = 1; // to make 2'd spot in arraylist
		}
		JPanel big = new JPanel();
		big.setBackground(Color.LIGHT_GRAY);
		BigPit bigpit = new BigPit(190, model.getStyle(), 0, player); 
		model.addBigPit(bigpit);
		JLabel label = new JLabel(bigpit);
		
		big.add(label);
		return big;
	}
	/**
	 * makes the bigpit
	 * @param player the number for player
	 * @return big the jPanel for the big pits
	 */
	public JPanel BigPit(int player)
	{
		int temp;
		if(player == 1)
		{
			temp = 0; // to make 1'st spot in arraylist 
		}
		else
		{
			temp = 1; // to make 2'd spot in arraylist
		}
		JPanel big = new JPanel();
		big.setBackground(Color.LIGHT_GRAY);
		BigPit bigpit = new BigPit(190, model.getStyle(), model.getPlayerPitStones(temp), player); 
		JLabel label = new JLabel(bigpit);
		big.add(label);
		return big;
	}
	/**
	 * creates the manA label
	 * @return leftLabel the label for the left side
	 */
	public JPanel ManA()
	{
		JPanel leftLabel = new JPanel();
		JLabel M = new JLabel("M");
		JLabel A = new JLabel("A");
		JLabel N = new JLabel("N");
		JLabel C = new JLabel("C");
		JLabel A1 = new JLabel("A");
		JLabel L = new JLabel("L");
		JLabel A2 = new JLabel("A");
		JLabel space = new JLabel(" ");
		JLabel label = new JLabel("A");
		JLabel topspace = new JLabel(" ");
		JLabel topspace2 = new JLabel(" ");
		JLabel topspace3 = new JLabel(" "); 
		leftLabel.setLayout(new BoxLayout(leftLabel, BoxLayout.Y_AXIS));
		leftLabel.add(topspace);
		leftLabel.add(topspace2);
		leftLabel.add(topspace3);
		leftLabel.add(M);
		leftLabel.add(A);
		leftLabel.add(N);
		leftLabel.add(C);
		leftLabel.add(A1);
		leftLabel.add(L);
		leftLabel.add(A2);
		leftLabel.add(space);
		leftLabel.add(label);
		leftLabel.setBackground(Color.LIGHT_GRAY);
		return leftLabel;
	}
	/**
	 * creates the manB label
	 * @return leftLabel the label for the left side
	 */
	public JPanel ManB()
	{
		JPanel leftLabel = new JPanel();
		JLabel M = new JLabel("M");
		JLabel A = new JLabel("A");
		JLabel N = new JLabel("N");
		JLabel C = new JLabel("C");
		JLabel A1 = new JLabel("A");
		JLabel L = new JLabel("L");
		JLabel A2 = new JLabel("A");
		JLabel space = new JLabel(" ");
		JLabel label = new JLabel("B");
		JLabel topspace = new JLabel(" ");
		JLabel topspace2 = new JLabel(" ");
		JLabel topspace3 = new JLabel(" "); 
		leftLabel.setLayout(new BoxLayout(leftLabel, BoxLayout.Y_AXIS));
		leftLabel.add(topspace);
		leftLabel.add(topspace2);
		leftLabel.add(topspace3);
		leftLabel.add(M);
		leftLabel.add(A);
		leftLabel.add(N);
		leftLabel.add(C);
		leftLabel.add(A1);
		leftLabel.add(L);
		leftLabel.add(A2);
		leftLabel.add(space);
		leftLabel.add(label);
		leftLabel.setBackground(Color.LIGHT_GRAY);
		return leftLabel;
	}
	/**
	 * gives the bot label with all of the player info with undo button
	 * @return turn the JPanel with the info for the view
	 */
	public JPanel playersTurn()
	{
		JPanel turn = new JPanel();
		JLabel whoeseTurn = new JLabel();
		JLabel undoTurn = new JLabel();
		JLabel retake = new JLabel();
		JLabel Won = new JLabel();
		if(model.player2Turn() == true)
		{
			whoeseTurn = new JLabel("Player 2 turn ");
		}
		else
		{
			whoeseTurn = new JLabel("Player 1 turn ");
		}
		if(model.gameEnded() == false){
			if(model.player2Turn() == true){
				if(model.checkUndo() == true)
				{
					undoTurn = new JLabel("  Player has "+ model.getUndo() + "/3 undo's left");
				}
				else if(model.checkUndo() == false)
				{
					undoTurn = new JLabel("  Player You have no more undos");
				}
			}
			else
			{
				if(model.checkUndo() == true)
				{
					undoTurn = new JLabel("  Player has "+  model.getUndo() + "/3 undo's left");
				}
				else if(model.checkUndo() == false)
				{
					undoTurn = new JLabel("  Past player: You have no more undos");
				}
			}
		}
		else
		{
			undoTurn = new JLabel(model.whoWon());
		}
		
		
		if(model.retaketurn() == true)
		{
			retake = new JLabel("*You have won another turn*");
		}
		else
		{
			retake = new JLabel("");
		}

		JButton undo = new JButton("UNDO");
		undo.addActionListener(new ActionListener()
	     {
	        public void actionPerformed(ActionEvent e)
	        {
	        	if (model.checkUndo()){
	        	model.undoCalled();
	        	} else {
	        		
	        	}
	        }
	     });
		turn.setLayout(new BorderLayout());
		JPanel temp = new JPanel();
		temp.add(whoeseTurn,  BorderLayout.WEST);
		temp.add(undoTurn);
		temp.add(retake);
		turn.add(temp, BorderLayout.WEST);
		turn.add(Won, BorderLayout.CENTER);
		turn.add(undo,  BorderLayout.EAST);
		return turn;
	}
	
}