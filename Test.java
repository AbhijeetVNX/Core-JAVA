class Test01
{
int mark1,mark2;
void getData(int x,int y)
{
mark1=x;
mark2=y;
}
void display()
{System.out.println("mark1 is="+mark1);
System.out.println("mark2 is="+mark2);
}
class Sports extends Test{
	    static int smark;
 
 void readData(int p){
	    smark=p;
}
void display(){
	System.out.println("smark is="+smark);
	}
}
class Demo{
	public static void main(String[] args){
		Sports S = new Sports();
          S.getData(97,76);
          S.readData(98);
          S.display();
        }
    }

