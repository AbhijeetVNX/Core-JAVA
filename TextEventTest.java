import java.awt.*;
import java.awt.event.*;
public class TextEventTest{
      
	private static Label l1,l2;
	private static TextField tf;
	private static Frame f;
	
	public static void main(String[] args){
	
	    TextEventTest ob = new TextEventTest();
		ob.setComponents();
	}
    
	public void setComponents(){
	
	    f = new Frame ("Text Event Example");
		
		f.setSize(350,200);
		f.setVisible(true);
		
		l1 = new Label("Text Event Example");
		l2 = new Label();
		
		f.setLayout(new FlowLayout());
		
		f.add(l1);
		f.add(tf);
		f.add(l2);
		
		tf.addTextListener(new Handler());
		
	}
  
  class Handler implements TextListener{
  
    public void textValueChanged(TextEvent te){
	   
	   l2.SetText(te.paramString());
	   f.setVisible(true);
	
	}
  }
}