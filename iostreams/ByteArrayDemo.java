package iostreams;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayDemo {

	public static void main(String[] args) {
		//declare local variables
		File file = new File("E:\\samplefiles\\springinfo.txt");
		File anotherFile = new File("E:\\samplefiles\\springinfoPart.txt");
		byte[] byteArray = new byte[1000];
		FileInputStream fis =null;
		FileOutputStream fos =null;
		
		ByteArrayOutputStream byteArrayOutputStream = null;
		
		try {
			//create file streams
			fis = new FileInputStream(file);
			fos= new FileOutputStream(anotherFile);
			byteArrayOutputStream.write(byteArray);		//write bytes array to stream
			byteArrayOutputStream.writeTo(fos);			//write bytes from 
			byteArrayOutputStream.writeTo(fos);										//byte array stream to another file
				
				int readCount = fis.read(byteArray, 0, 1000);	//next 1000 bytes 
				
				while(readCount>0) {
					
					byteArrayOutputStream.write(byteArray);		//write bytes array to stream
					byteArrayOutputStream.writeTo(fos);			//write bytes from 
					byteArrayOutputStream.writeTo(fos);	
					
					readCount=fis.read(byteArray,0,1000);
				}
		
		
			
			//close all streams
			byteArrayOutputStream.close();
			fos.close();
			fis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}