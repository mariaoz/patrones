package builder;

public class Client {
    private Algorithm algorithm1;
    private Algorithm algorithm2;
    
    public Client() {
	algorithm1= new Algorithm("QuickSort", 10, 10, 20, "Sum");
	
	algorithm2= new AlgorithmBuilder()//se puede ver la diferencia entre el builder que es mas legible que el Algorithm, pero hay que escribir más.
		//aunque permite que las pruebas unitarias sean más fáciles de realizar
		.setName("MergeSort")
		.setMaximumNumberOfEvaluations(10)
		.setMemoryRequirement(10)
		.setOperator("Sum")
		.build();
    }

}
