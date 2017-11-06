package patrones;
import patrones.Compressor;

public class Zip implements Compressor{
    public Data compress(Data data) {
	return new Data("Zip - "+ data.getData());
    }

}
