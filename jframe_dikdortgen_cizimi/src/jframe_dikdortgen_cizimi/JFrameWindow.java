package jframe_dikdortgen_cizimi;

import java.awt.Graphics;

import javax.swing.JFrame;

public class JFrameWindow extends JFrame {
	
	public void paint(Graphics g) {
		//eski halini de �a��rm�� bozmam�� oluruz, �zerine eklemeler yapar�z.
		super.paint(g);
		// (0, 0) sol �st k��edir. De�erler artt�k�a sa�a do�ru koordinat kayar.
		
		//dikd�rtgen �izme
		g.drawRect(160, 120, 320, 340); //(x, y, width, height)
		g.drawRect(320, 300, 400, 420);
		
		//drawline-�izgi �ekme
		g.drawLine(0, 0, 300, 200); //(x1, y1, x2, y2) //1-ba�lang�� noktalar�, 2-biti� noktalar�

	}
}
