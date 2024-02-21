import java.awt.*;
import java.awt.event.*;
class AwtTest implements ActionListener{
	
	public static TextField t1,t2;
	public static Label l1,l2,l3;
	public static Button b;
	
	public static void main(String[] args){
		
		Frame ab = new Frame("Calculator App");
		ab.setVisible(true);
		ab.setSize(500,450);
		ab.setBackground(Color.CYAN);
		ab.setForeground(Color.BLACK);
		
		l1 = new Label("First Number");
		l2 = new Label("Second Number");
		l3 = new Label();
		
		t1 = new TextField();
	    t2 = new TextField();
  
        b = new Button("Submit");

        ab.setLayout(null);

        l1.setBounds(50,50,120,50);
		l2.setBounds(50,150,120,50);
		l3.setBounds(100,350,120,50);
		t1.setBounds(200,50,120,50);
		t2.setBounds(200,150,120,50);
		b.setBounds(100,250,120,50);
		
	    b.addActionListener(new AwtTest());

        ab.add(l1);
        ab.add(t1);
        ab.add(l2);
        ab.add(t2);
        ab.add(b);   		
		ab.add(l3);
	}
	public void actionPerformed(ActionEvent ae){
		
		int x,y,result;
		
		x = Integer.parseInt(t1.getText());
		y = Integer.parseInt(t2.getText());

        result = x*y;
		l3.setText("Multiplications is:"+result);
	}
}
		
 