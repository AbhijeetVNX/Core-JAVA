import java.awt.*;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUITest1 implements ActionListener {
	
	
	static TextField t1,t2;
	static Label l3;
	
	
	public static void main(String[]args) {
		Frame f=new Frame();
		f.setVisible(true);
		f.setSize(410,410);
		f.setTitle("Test");
		
		Label l1=new Label("Enter First number");
		Label l2=new Label("Enter Second Number");
		l3=new Label();
		
		 t1=new TextField();
		 t2=new TextField();
		
		Button b=new Button("Multiply");
		
		f.setLayout(null);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(t1);
		f.add(t2);
		f.add(b);
		
		l1.setBounds(50,50,120,50);
		l2.setBounds(50,150,120,50);
		l3.setBounds(100,350,120,50);
		t1.setBounds(200,50,120,50);
		t2.setBounds(200,150,120,50);
		b.setBounds(100,250,120,50);
		
		b.addActionListener(new GUITest1());
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		int num1=Integer.parseInt(t1.getText());
		int num2=Integer.parseInt(t2.getText());
		
		
		int res=num1*num2;
		l3.setText("Multiplication is:"+res);
		
		
		
		
	}

}