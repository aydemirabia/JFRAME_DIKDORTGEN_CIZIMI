package jframe_dikdortgen_cizimi;

import java.awt.Graphics;

import javax.swing.JFrame;

public class JFrameWindow extends JFrame {
	
	public void paint(Graphics g) {
		//eski halini de çaðýrmýþ bozmamýþ oluruz, üzerine eklemeler yaparýz.
		super.paint(g);
		// (0, 0) sol üst köþedir. Deðerler arttýkça saða doðru koordinat kayar.
		
		//dikdörtgen çizme
		g.drawRect(160, 120, 320, 340); //(x, y, width, height)
		g.drawRect(320, 300, 400, 420);
		
		//drawline-çizgi çekme
		g.drawLine(0, 0, 300, 200); //(x1, y1, x2, y2) //1-baþlangýç noktalarý, 2-bitiþ noktalarý

	}
}
