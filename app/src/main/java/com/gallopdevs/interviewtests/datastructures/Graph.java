package com.gallopdevs.interviewtests.datastructures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {

    private int vertices;
    private LinkedList<Integer>[] adjacencyLists;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyLists = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyLists[i] = new LinkedList<>();
        }
    }

    public void addEdge(int vertex, int edge) {
        adjacencyLists[vertex].add(edge);
    }

    public void performBreadthFirstSearch(int source) {
        boolean[] visited = new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(source);
        visited[source] = true;

        while (queue.size() != 0) {
            source = queue.poll();
            Iterator<Integer> iterator = adjacencyLists[source].listIterator();
            while (iterator.hasNext()) {
                int next = iterator.next();
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }

    public void performDepthFirstSearch(int source) {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(source);
        visited[source] = true;

        while (!stack.isEmpty()) {
            int current = stack.pop();
            Iterator<Integer> iterator = adjacencyLists[current].listIterator();
            while (iterator.hasNext()) {
                int next = iterator.next();
                if (!visited[next]) {
                    visited[next] = true;
                    stack.add(next);
                }
            }
        }
    }
}
