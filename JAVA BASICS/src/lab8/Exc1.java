package lab8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exc1 extends Thread{

	public static void main(String[] args) throws  InterruptedException, IOException {
		// TODO Auto-generated method stub
		Exc1 t1=new Exc1();
		t1.start();
		FileInputStream fr=new FileInputStream("C:\\Users\\Bhargav Reddy\\Desktop\\lab8.txt");
		FileOutputStream fw=new FileOutputStream("C:\\Users\\Bhargav Reddy\\Desktop\\destin.txt");
		int ch=0,j=0;
		while((ch=fr.read())!=-1) {
			fw.write(ch);
			j++;
			if(j%10==0)
			{
				System.out.println("copied");
			}
			t1.sleep(500);
		}
		fr.close();
	}
}

