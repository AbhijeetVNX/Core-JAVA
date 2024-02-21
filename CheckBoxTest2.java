import java.awt.*;
import java.awt.event.*;

public class CheckBoxTest2 implements ItemListener{
	
	static Checkbox cb1,cb2;
	static Label l1;
	static String msg;
	
	public static void main(String[] args){
		
		Frame f = new Frame("chekbox test");
		f.setVisible(true);
		f.setSize(500,300);
		
		cb1 = new Checkbox("java",false);
		cb2 = new Checkbox("python",false);
		l1 = new Label();
		
		f.add(cb1);
		f.add(cb2);
		f.add(l1);
		
		f.setLayout(null);
		
		cb1.setBounds(100,50,90,50);
		cb2.setBounds(100,100,90,50);
		l1.setBounds(100,160,250,40);
		
		cb1.addItemListener(new CheckBoxTest2());
		cb2.addItemListener(new CheckBoxTest2());
		
}
public void itemStateChanged(ItemEvent ae){
	
	    if(cb1.getState()&& cb2.getState()){
			
			msg = cb1.getLabel()+"--"+cb2.getState();
			l1.setText("you have selected"+msg);
			
		}
		else if(cb1.getState() == false && cb2.getState()==false){
			
			l1.setText("you have not selected anything");
		}
		else if(cb2.getState()){
			
			msg = cb2.getLabel();
			l1.setText("you have selected:"+msg);
		}
		else if(cb1.getState()){
			
			msg = cb1.getLabel();
			l1.setText("you have selected:"+msg);
			
		}
    }    

}