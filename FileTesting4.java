import java.io.*;
class FileTesting4{

    public static void main(String[] args)throws IOException{
	
	    File f = new File("C:/Users/acer/Desktop/JAVA/FileTesting4");
		
		FileWriter fw = new FileWriter(f,true);
		
		BufferedWriter br = new BufferedWriter(fw);
		
		String data = "*********";
		
		br.write(data);
		
		br.close();
		fw.close();
		
	}
}