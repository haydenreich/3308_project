/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipsterhighway;

import java.awt.image.BufferedImage;
import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class MainMenu extends JPanel{
	
	BufferedImage image;
	public MainMenu(){
	try {
	String path = "mustache.png";
	File file = new File(path);
	
	image = ImageIO.read(file);
	} catch (IOException e){
		
	}
	
	if(image == null)
	{
		System.out.println("Image not found");
	}
	}
	String menu[] = {"Welcome to Hipster Highway","1. Create Character","2. New Game","3. Load Game","4. Help","To quit at any time, type quit into the input box", "or click cancel and the the x on the main window"};
	int a = 100;
	int b = 200;
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		g.setColor(Color.BLACK);
		g.drawLine(50, 50, 500, 50);
		g.drawLine(50, 50, 50, 500);
		g.drawLine(50,500,500,500);
		g.drawLine(500, 500, 500, 50);
		for(int i = 0;i < 7;i++){
			g.drawString(menu[i],a , b);
			b = b + 20;
		}
		g.drawImage(image, 225, 0, 50, 50, null);
                b=200;
	}
	public void UserInput(JFrame f){
		//String input = JOptionPane.showInputDialog("");
		//if(input == "1"){
			//JFrame f = new JFrame("HipsterHighway");
			//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			HelpMenu h = new HelpMenu();
			f.add(h);
			//f.setSize(550,550);
			f.repaint();
			f.setVisible(true);
			
		//}
        	
        	//f.setVisible(true);
        	
        }
	
}