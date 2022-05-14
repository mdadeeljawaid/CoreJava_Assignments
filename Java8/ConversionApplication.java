package Java8;

public class ConversionApplication {
	
	public static void main(String[] args) {
				// F to C (f-32)/9 = C/5
				// C = 5/9*(f-32)
				Converter converter = (f)-> 5*(f-32)/9;	//implementation of Converter interface
				System.out.println(converter.convert(100));
				System.out.println("Normal body temperature in Celcius: " +converter.convert(98.6));
				
				// C to F (f-32)/9 = C/5
				//f = c*9/5+32
				Converter ftocConverter = (c)-> c*9/5+32;	//implementation of Converter interface
				System.out.println(ftocConverter.convert(37));
			}
		}

		//functional interface
		interface Converter{
			double convert(double value);
		
	}

