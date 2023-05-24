package Graph;

import java.util.ArrayList;

import Queue.QueueArray;

public class GraphArray
{
    private String[] vertex;
    private boolean[][] edges;
    private int numberOfVertices;
    private int numberOfEdges;

    public GraphArray(int size)
    {
        vertex = new String[size];
        edges = new boolean[size][size];
        numberOfVertices = 0;
        numberOfEdges = 0;
    }

    public void addVertex(String label)
    {
        vertex[numberOfVertices++] = label;
    }

    public void addEdge(int start, int end)
    {
        edges[start][end] = true;
        edges[end][start] = true;
        numberOfEdges++;
    }

    public void addEdge(String start, String end)
    {
        int startIndex = indexOf(start);
        int endIndex = indexOf(end);
        if (startIndex != -1 && endIndex != -1)
        {
            addEdge(startIndex, endIndex);
        }
    }

    public void removeEdge(int start, int end)
    {
        edges[start][end] = false;
        edges[end][start] = false;
        numberOfEdges--;
    }

    public void removeEdge(String start, String end)
    {
        int startIndex = indexOf(start);
        int endIndex = indexOf(end);
        if (startIndex != -1 && endIndex != -1)
        {
            removeEdge(startIndex, endIndex);
        }
    }

    public void removeVertex(String label)
    {
        int index = indexOf(label);
        if (index != -1)
        {
            for (int i = 0; i < numberOfVertices; i++)
            {
                if (edges[index][i])
                {
                    removeEdge(index, i);
                }
            }
            for (int i = index; i < numberOfVertices - 1; i++)
            {
                vertex[i] = vertex[i + 1];
            }
            numberOfVertices--;
        }
    }

    public int findVertex(String label)
    {
        for (int i = 0; i < numberOfVertices; i++)
        {
            if (vertex[i].equals(label))
            {
                return i;
            }
        }
        return -1;
    }

    void displayGraph()
    {
        System.out.println("Vertices: ");
        for (int i = 0; i < numberOfVertices; i++)
        {
            System.out.print(vertex[i] + " ");
        }
        System.out.println("\nEdges: ");
        for (int i = 0; i < numberOfVertices; i++)
        {
            System.out.print(vertex[i] + " -> ");
            for (int j = 0; j < numberOfVertices; j++)
            {
                if (edges[i][j])
                {
                    System.out.print(vertex[j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void displayVertices()
    {
        System.out.println("Vertices: ");
        for (int i = 0; i < numberOfVertices; i++)
        {
            System.out.print(vertex[i] + " ");
        }
        System.out.println();
    }

    public int indexOf(String label)
    {
        for (int i = 0; i < numberOfVertices; i++)
        {
            if (vertex[i].equals(label))
            {
                return i;
            }
        }
        return -1;
    }

    public  int degreeIn(String label)
    {
        int index = indexOf(label);
        if (index != -1)
        {
            int count = 0;
            for (int i = 0; i < numberOfVertices; i++)
            {
                if (edges[i][index])
                {
                    count++;
                }
            }
            return count;
        }
        return -1;
    }

    public int degreeOut(String label)
    {
        int index = indexOf(label);
        if (index != -1)
        {
            int count = 0;
            for (int i = 0; i < numberOfVertices; i++)
            {
                if (edges[index][i])
                {
                    count++;
                }
            }
            return count;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        GraphArray graph = new GraphArray(5);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "D");
        graph.addEdge("A", "D");



        graph.displayGraph();
        System.out.println(graph.degreeIn("A"));
        System.out.println(graph.degreeOut("C"));

    }

}
