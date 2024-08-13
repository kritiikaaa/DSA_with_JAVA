package Graphs;
import java.util.*;

public class CycleDetection1 {

    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph){
        for(int i =0; i<graph.length; i++){
           graph[i] = new ArrayList<>();
        }

        //vertex-0
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        //vertex-1
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        //vertex-2
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        //vertex-3
        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));

        //vertex-4
        graph[4].add(new Edge(4,3));

    }

    public static boolean DetectCycle(ArrayList<Edge>[] graph){
        boolean visited [] = new boolean[graph.length];
        for(int i=0; i<graph.length;i++){
            if(!visited[i]){
                if(DetectCycleUtil(graph,visited,i,-1)){
                    return true;  // If cycle exists in any one of the parts
                }
            }
        }
        return false;
    }

    public static boolean DetectCycleUtil(ArrayList<Edge> graph[], boolean[] visited, int curr, int par){
        visited[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            //Case-1
            if(visited[e.dest] && e.dest!=par){
                return true;
            }
            //Case-2
            else if(visited[e.dest] && e.dest==par) {
                // do nothing
                continue;
            }
            //Case-3
            else if(!visited[e.dest] && DetectCycleUtil(graph, visited, e.dest, curr)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.print(DetectCycle(graph));
    }
}
