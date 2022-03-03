package Graph_Tree;

public class Graph {
    int matrix[] [];
    int size;

    Graph(int v){
        matrix=new int[v][v];
        size=v;
    }
    public void addEdge(int source,int destination){
        matrix[source] [destination]=1;
        matrix[destination][source]=1;
    }

    public void printMatrix(){
        //visiting rows
        for(int i=0;i<size;i++){
            for(int j=0; j<size; j++){

            }
        }
    }
}
