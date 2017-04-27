package KhaiTranQuang;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Bird {
	public float x,y,vx, vy;
	public static final int RAD= 25;
	private Image img;
	public Bird(){
		x=FlappyBird.WIDTH/2;
		y=FlappyBird.HEIGHT/2;
		try {
			img=ImageIO.read(new File("bird.png"));   //Read image from File
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void physics(){        //Set method to fly
		x+=vx;
		y+=vy;
		vy+=0.5f;
	}
	
	public void update(Graphics g){   //Update new possition
		g.setColor(Color.BLACK);
		g.drawImage(img, Math.round(x-RAD), Math.round(y-RAD), 2*RAD,2*RAD,null);
	}
	
	public void jump(){
		vy=-12;
	}
	public void reset(){
		x=640/2;
		y=640/2;
		vx=vy=0;
	}
}
