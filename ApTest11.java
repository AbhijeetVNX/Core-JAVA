import java.applet.Applet;
import java.awt.Graphics;
/*<applet code="ApTest11" width="300" height="200"></applet>*/
public class ApTest11 extends Applet{

    public void init(){
	
	    System.out.println("init is working");
	}
	
	public void start(){
	
	    System.out.println("start is working");
	}
	public void paint(Graphics g){
	
	    System.out.println("paint is working");
	}
	public void stop(){
	
	    System.out.println("stop is working");
	}
	
	public void destroy(){
		
		System.out.println("destroy is working");
		
	}
}