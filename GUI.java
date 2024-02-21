import java.awt.*;
class GUI{
   
   public static void main(String[] args){
     
      Frame f = new Frame();
      f.setVisible(true);
      f.setSize(500,500);
      f.setTitle("xyz");
      
      Label l1 = new Label("1 Number");
      Label l2 = new Label("2 Number");
      Label l3 = new Label();
      
      TextField t1 = new TextField();
      TextField t2 = new TextField();
      
      
     Button b = new Button("Multiply");
     
     f.setLayout(null);
     
     f.add(l1);
     f.add(l2);
     f.add(l3);
     f.add(t1);
     f.add(t2);
     f.add(b);
     
     l1.setBounds(50,50,150,50);
     l2.setBounds(50,150,120,50);
     l3.setBounds(100,350,120,50);
     t1.setBounds(200,50,120,50);
     t2.setBounds(200,150,120,50);
     b.setBounds(100,250,120,50);
   
   }
  
}