import java.util.*;
public class 3ColorProblem(){
	Scanner in = new Scanner(new File(args[0]))
	
	String setupInfo = in.nextLine();
	Hashmap<Integer, Node> graph = new Hashmap<Integer,Node>(setupInfo.split()[1]);
	while(in.hasNextLine()){
		String newEdge = in.nextLine();
		String[] newEdgeSplit = newEdge.split();
		if(!graph.contains(newEdgeSplit[0])){
			Node newNode = new Node()
			graph.put(newEdgeSplit[0],newNode);
		}
		if(!graph.contains(newEdgeSplit[1])){
			graph.put(newEdgeSplit[0],newNode);
		}
		Node node1 = graph.get(newEdgeSplit[0]);
		node1.giveEdge(newEdgeSplit[1]);
		Node node2 = graph.get(newEdgeSplit[1]);
		node2.giveEdge(newEdgeSplit[0]);
	}
}