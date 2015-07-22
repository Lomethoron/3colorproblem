//name:    date:
//for use with Graphs3: EdgeList
//             Graphs4: DFS-BFS
//             Graphs5: EdgeListCities

import java.io.*;
import java.util.*;

class Vertex
{
   private String color;
   private ArrayList<String> adjacencies;
   
   public Vertex()
   {
      color = "";
      adjacencies = new ArrayList<String>();
   }
   
   public ArrayList<String> getAdjacencies()
   {
      return adjacencies;
   }
   
   public String getColor()
   {
      return color;
   }
   
   public void setColor(String s)
   {
      color = s;
   }
   
   public boolean isConnected(String s)
   {
      for(int x=0; x<adjacencies.size(); x++)
      {
         if(adjacencies.get(0).equals(s))
            return true;
      }
      return false;
   }
   
   public void giveEdge(String s)
   {
      adjacencies.add(s);
   }
   
   public String toString()
   {
      return "" + color;
   }
}
