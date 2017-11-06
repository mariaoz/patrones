package dependencyinversionprinciple;

public class Client {
    public static void main (String[] args) {//implementando en cada clase la interfaz permite que la clase manager sirva para varias
	Worker worker1= new Worker();
	SuperWorker superWorker= new SuperWorker();
	
	Manager manager= new Manager();
	manager.setWorker(worker1);
	manager.manage();
	
	manager.setWorker(superWorker);
	manager.manage();
	
	
	Worker worker2= new Worker();
	manager.setWorker(worker2);
	manager.manage();
	
	MiniWorker miniWorker= new MiniWorker();
	manager.setWorker(miniWorker);
	manager.manage();
	
	
	
    }

}
