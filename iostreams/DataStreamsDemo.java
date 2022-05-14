package iostreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamsDemo {

	public static void main(String[] args) {
		
		File file=new File("E:\\samplefiles\\myprimitives.dat");
		
		//writePrimitives(file);
		readPrimitives(file);
	}

	private static void readPrimitives(File file) {
		FileInputStream fileInputStream = null;
		
		 try {
			fileInputStream = new FileInputStream(file);
			
			DataInputStream dIn 
			= new DataInputStream(fileInputStream); //layering
			
			boolean b = dIn.readBoolean();
			byte byt = dIn.readByte();
			
			short s = dIn.readShort();
			int i = dIn.readInt();
			long l = dIn.readLong();
			
			float f = dIn.readFloat();
			double d = dIn.readDouble();
			char ch = dIn.readChar();
			
			System.out.println(b + " " +byt + " " + s  + " " +i  + " " +l  + " " +f  + " " +d  + " " +ch);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writePrimitives(File file) {
	
		FileOutputStream fileOutputStream = null;
		
		try {
			//instantiate FileOutputStream
			fileOutputStream = new FileOutputStream(file);
			
			DataOutputStream dOut 
				= new DataOutputStream(fileOutputStream); //layering
			
			//write primitive data of all types
			dOut.writeBoolean(true);
			dOut.writeByte(100);
			dOut.writeShort(10000);
			dOut.writeInt(100000);
			dOut.writeLong(1000000);
			dOut.writeFloat(3.14f);
			dOut.writeDouble(2.56e-12);
			dOut.writeChar('A');
			
			dOut.close();
			fileOutputStream.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}