import java.util.Scanner;

//Assuming directed graph

public class Main {

    static boolean bellman_ford(int [][] edges, int [] distance, int V, int E)
    {
        for(int i=0;i<V-1;i++)
        {
            for(int j=0;j<E;j++)
            {
                if(distance[edges[j][0]]!=Integer.MAX_VALUE && distance[edges[j][0]] + edges[j][2] < distance[edges[j][1]] )
                {
                    distance[edges[j][1]]=distance[edges[j][0]]+edges[j][2];
                }
            }
        }

        for(int i=0;i<E;i++)
        {
            if(distance[edges[i][0]]!=Integer.MAX_VALUE && distance[edges[i][0]] + edges[i][2] < distance[edges[i][1]])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of vertices : ");
        int V=scanner.nextInt();
        System.out.println("Enter number of edges : ");
        int E=scanner.nextInt();
        int[][] edges=new int[E][3];
        for(int i=0;i<E;i++)
        {
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int weight=scanner.nextInt();
            edges[i][0]=a;
            edges[i][1]=b;
            edges[i][2]=weight;
        }
        int[] distance=new int[V];
        for(int i=0;i<V;i++) distance[i]=Integer.MAX_VALUE;
        System.out.println("Enter source vertex : ");
        int source=scanner.nextInt();
        System.out.println("Enter destination vertex : ");
        int destination=scanner.nextInt();
        distance[source]=0;
        if( bellman_ford(edges, distance, V, E) )
        {
            System.out.println("Cost : " + distance[destination]);
        }
        else System.out.println("Negative cycles exist");
    }
}
