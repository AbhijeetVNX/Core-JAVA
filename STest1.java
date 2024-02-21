import javax .swing.*;
class STest1{

    public static void main(String[] args){
	
	    JFrame f = new JFrame("swing application ");
		f.setVisible(true);
		f.setSize(300,300);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
		JLabel l1 = new JLabel("Hello My Name IS Abhijeet");
		
		f.setLayout(null);
		
		l1.setBounds(80,80,150,50);
		
		f.add(l1);
	}
}