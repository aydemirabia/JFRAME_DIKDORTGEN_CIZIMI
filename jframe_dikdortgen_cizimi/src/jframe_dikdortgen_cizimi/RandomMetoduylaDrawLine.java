package jframe_dikdortgen_cizimi;

import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

public class RandomMetoduylaDrawLine extends JFrame {
	private Random rnd;
	
	//constructor olusturma
	public RandomMetoduylaDrawLine() {
		super();
		rnd = new Random();
	}
	
	public void paint(Graphics g) {
		//rastgele sayý vererek koordinatlarý yazdýrdýk.
		for(int i = 0; i < 100; i++) {
			g.drawLine(rnd.nextInt(640), rnd.nextInt(480), rnd.nextInt(640), rnd.nextInt(480));
		}
	}
}
