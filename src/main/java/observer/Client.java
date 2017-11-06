package observer;

public class Client {
    public static void main(String[] args) {
	DataStore observable= new DataStore();
	DataStoreObserver observer1= new DataStoreObserver("Observer 1");
	DataStoreObserver observer2= new DataStoreObserver("Observer 2");
	
	observable.addObserver(observer1);
	observable.addObserver(observer2);
	
	System.out.println("Number of Observers: "+ observable.countObservers());
	
	observable.setData("Hello");
	

	DataStoreObserver observer3= new DataStoreObserver("Observer 3");
	observable.addObserver(observer3);
	observable.setData("Good bye");
	
	observable.deleteObserver(observer2);
	observable.setData("Bye bye");//imprime el 3 y 1
    }

}
