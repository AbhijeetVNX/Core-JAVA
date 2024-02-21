import java.io.*;
class FileTesting1{

    public static void main(String[] args) throws IOException{
		
		File f = new File("C:/Users/acer/Desktop/JAVA/FileTestting1.txt");
		
		FileInputStream fis = new FileInputStream(f);
		
		char[] data = new char[100];
		
		int i,k=0;
		
		
	  do{
		  i=fis.read();
		  
		  if(i!=-1){
			  
			  data[k]=(char)i;
			  System.out.print(data[k]);
		  }
		  
		  k++;
	  }while(i!=-1);
        
		fis.close();
	  
	  }

}