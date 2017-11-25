import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;

public class MyPanelClass extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		//Compute interior coordinates
		Insets myInsets = this.getInsets();
		int x1 = myInsets.left;
		int y1 = myInsets.top;
		int x2 = getWidth() - myInsets.right - 1;
		int y2 = getHeight() - myInsets.bottom - 1;
		int width = x2 - x1;
		int height = y2 - y1;

		//Paint the background
		g.setColor(Color.RED);
		g.fillRect(x1, y1, width + 1, height + 1);

		// White stripes
		g.setColor(Color.WHITE);
		g.fillRect(0, height/5, width + 1, height/5);
		g.fillRect(0, 3*height/5, width + 1, height/5);

		//Triangle
		Polygon p1 = new Polygon();
		p1.addPoint(0, 0);
		p1.addPoint(0, height);
		p1.addPoint(width-115, height/2);
		g.setColor(Color.BLUE);
		g.fillPolygon(p1);

		//		//Star
		//	    Polygon p2 = new Polygon();
		//        p2.addPoint(x1 + 25, y1 + 73);
		//        p2.addPoint(x1 + 41, y1 + 73);
		//        p2.addPoint(x1 + 47, y1 + 58);
		//        p2.addPoint(x1 + 53, y1 + 73);
		//        p2.addPoint(x1 + 69, y1 + 73);
		//        p2.addPoint(x1 + 56, y1 + 83);
		//        p2.addPoint(x1 + 61, y1 + 98);
		//        p2.addPoint(x1 + 47, y1 + 88);
		//        p2.addPoint(x1 + 34, y1 + 98);
		//        p2.addPoint(x1 + 38, y1 + 83);
		//        g.setColor(Color.WHITE);
		//        g.fillPolygon(p2);

		//Star
		Polygon p3 = new Polygon();
		p3.addPoint(width-225, height-127+85/2);
		p3.addPoint(width-209, height-127+85/2);
		p3.addPoint(width-203, height-142+85/2);
		p3.addPoint(width-197, height-127+85/2);
		p3.addPoint(width-181, height-127+85/2);
		p3.addPoint(width-194, height-117+85/2);
		p3.addPoint(width-189, height-102+85/2);
		p3.addPoint(width-203, height-112+85/2);
		p3.addPoint(width-216, height-102+85/2);
		p3.addPoint(width-212, height-117+85/2);
		g.setColor(Color.WHITE);
		g.fillPolygon(p3);



	}


}