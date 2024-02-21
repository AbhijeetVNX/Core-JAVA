import java.awt.*;

public class CheckBoxTest1{
	
	static Checkbox cb1,cb2;
	static Label l1;
	
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
	}


}