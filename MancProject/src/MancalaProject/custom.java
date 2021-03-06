package MancalaProject;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;
/**
 *  interface that draws the pis in a custom color and in a retangle shape.
 * @author John Anderson
 * @author Christopher Dal Porto
 * @author Andy Nguyen
 * @version 1.0
 */
public class custom implements Borad
{
	/**
	 * draws the bigpits or mancala pits
	 */
	@Override
	public void drawbigpits(Graphics2D g2, int x, int y, int stones, int size)  {
		Rectangle2D.Double pit = new Rectangle2D.Double(0, 0, size/2 -5, size - 5);
		g2.setColor(Color.BLACK);
		 g2.fill(pit);
			for(int i = 0; i < stones; i ++)
			 {
				Ellipse2D.Double temp = new Ellipse2D.Double(bigstonesspot()+15, bigstonesspot()+60, 15, 15);
				 g2.setColor(Color.RED);
				 g2.fill(temp);
			 }
		String temp = String.valueOf(stones);
		g2.setColor(Color.WHITE);
		g2.drawString(temp, x+10, y+12);
	}
	/**
	 * draws the little pits
	 */
	@Override
	public void drawpits(Graphics2D g2, int x, int y, int stones, int size) {
		Rectangle2D.Double pit = new Rectangle2D.Double(0, 0, size, size);
		g2.setColor(Color.BLACK);
		 g2.fill(pit);
			for(int i = 0; i < stones; i ++)
			 {
				Ellipse2D.Double temp = new Ellipse2D.Double(stonespot()+25, stonespot()+30, 15, 15);
				 g2.setColor(Color.RED);
				 g2.fill(temp);
			 }
		String temp = String.valueOf(stones);
		g2.setColor(Color.WHITE);
		g2.drawString(temp, x+5, y);
	}
	/**
	 * helps pick a random spot in the small pits
	 * @return temp  the number of a spot
	 */
	@Override
	public int stonespot() 
	{
		Random random = new Random();
		int temp = random.nextInt(((50-25) +1) +0);
		return temp;
	}
	/**
	 * returns a number of a spot for the bigpit
	 * @return temp the number of a spot for big pit
	 */
	@Override
	public int bigstonesspot() {
		Random random = new Random();
		int temp = random.nextInt(((50-0) +1) +0);
		return temp;
	}
}
