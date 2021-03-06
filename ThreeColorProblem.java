import java.util.*;
import java.io.*;
public class ThreeColorProblem{
	public static void main(String args[]){
		try{
			Scanner in = new Scanner(new File("medium1"));
			String setupInfo = in.nextLine();
			String[] setupInfoSplit = setupInfo.split(" ");
			HashMap<String, Vertex> graph = new HashMap<String,Vertex>();
			while(in.hasNextLine()){
				String newEdge = in.nextLine();
				String[] newEdgeSplit = newEdge.split(" ");
				if(!graph.containsKey(newEdgeSplit[0])){
					Vertex newVertex = new Vertex();
					graph.put(newEdgeSplit[0],newVertex);
				}
				if(!graph.containsKey(newEdgeSplit[1])){
					Vertex newVertex = new Vertex();
					graph.put(newEdgeSplit[1],newVertex);
				}
				Vertex vertex1 = graph.get(newEdgeSplit[0]);
				vertex1.giveEdge(newEdgeSplit[1]);
				Vertex vertex2 = graph.get(newEdgeSplit[1]);
				vertex2.giveEdge(newEdgeSplit[0]);
			}
			in.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//generate init pop
		//determine fitness
		//create children based on goodish parents
		//find child fitness and replace if good enough
		//repeat
	}
   
   public void fillColors(HashMap<Integer,Vertex> graph)
   {
      for(Map.Entry<Integer, Vertex> entry : graph.entrySet()) 
      {
         int random = (int)(Math.random()*3);
         if(random == 0)
            entry.getValue().setColor("Blue");
         else if(random == 1)
            entry.getValue().setColor("Green");
         else
            entry.getValue().setColor("Red");
      }
   }
   
}