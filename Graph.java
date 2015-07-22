public class Graph{
	HashMap<String, Vertex> graph;
	int fitnessScore;

	public Graph(){
		fitnessScore = -1;
		graph = new HashMap<String,Vertex>();	
	}
	
	public void setFit(int fitnessScore) {
		this.fitnessScore = fitnessScore;
	}
	
	public int getFit() {
		return fitnessScore;
	}
	
	public int calcFit() {
		
	}
	
}