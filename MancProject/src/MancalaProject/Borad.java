package MancalaProject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public interface Borad
{
	Color stonecolor();
	void drawbigpits(Graphics2D g2, int x, int y, int stones, int size);
	void drawpits(Graphics2D g2, int x, int y, int stones, int size);
	int stonespot();
}
