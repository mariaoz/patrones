package patrones;
import patrones.Rar;
public class Client {
    public static void main (String[] args) {
	Context compressorContext;
	compressorContext= new Context(new Zip());
	
	Data data= compressorContext.apply(new Data("Hello"));
	System.out.println(data.getData());
	
	compressorContext.setStrategy(new Rar());
	data= compressorContext.apply(new Data ("GoodBye"));
	System.out.println(data.getData());
    }

}
