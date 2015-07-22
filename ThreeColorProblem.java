import java.util.*;
public class ThreeColorProblem{
	public static void main(String args[]){
		Scanner in = new Scanner(new File(args[0]));
		
		String setupInfo = in.nextLine();
		Hashmap<Integer, Vertex> graph = new Hashmap<Integer,Vertex>(setupInfo.split()[1]);
		while(in.hasNextLine()){
			String newEdge = in.nextLine();
			String[] newEdgeSplit = newEdge.split();
			if(!graph.contains(newEdgeSplit[0])){
				Vertex newVertex = new Vertex();
				graph.put(newEdgeSplit[0],newVertex);
			}
			if(!graph.contains(newEdgeSplit[1])){
				graph.put(newEdgeSplit[0],newVertex);
			}
			Vertex vertex1 = graph.get(newEdgeSplit[0]);
			vertex1.giveEdge(newEdgeSplit[1]);
			Vertex vertex2 = graph.get(newEdgeSplit[1]);
			vertex2.giveEdge(newEdgeSplit[0]);
		}
	}
}