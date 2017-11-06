package builder;

public class Client {
    private Algorithm algorithm1;
    private Algorithm algorithm2;
    
    public Client() {
	algorithm1= new Algorithm("QuickSort", 10, 10, 20, "Sum");
	
	algorithm2= new AlgorithmBuilder()//se puede ver la diferencia entre el builder que es mas legible que el Algorithm, pero hay que escribir m�s.
		//aunque permite que las pruebas unitarias sean m�s f�ciles de realizar
		.setName("MergeSort")
		.setMaximumNumberOfEvaluations(10)
		.setMemoryRequirement(10)
		.setOperator("Sum")
		.build();
    }

}
