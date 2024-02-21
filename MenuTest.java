import java.awt.*;
class MenuTest{

    public static void main(String[] args){
	   
	    Frame f = new Frame();
		f.setTitle("Menu demonstration");
		f.setSize(300,300);
		f.setVisible(true);
		
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("Countries");
		Menu m2 = new Menu("INDIA");
		
		Menultem it1 = new Menultem("US");
		Menultem it2 = new Menultem("UK");
		Menultem it3 = new Menultem("INDIA");
	     
		Menultem it4 = new Menultem("Maharashtra");
		Menultem it1 = new Menultem("Bihar");
		Menultem it1 = new Menultem("Gujrat");
		
		m1.add(it1);
		m1.add(it2);
		m1.add(it3);
		
		m2.add(it4);
		m2.add(it5);
		m2.add(it6);
		
		m1.add(m2);
		
		mb.add(m1);
		
		Menu m3 = new Menu("Colors");
		
		Menultem it7 = new Menultem("Green");
		Menultem it8 = new Menultem("Blue");
		Menultem it9 = new Menultem("Red");
		
		m3.add(it7);
		m3.add(it8);
		m3.add(it9);
		
		mb.add(m3);
		
		f.setMenuBar(mb);
		
	}
}