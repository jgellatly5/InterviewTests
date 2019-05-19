package com.gallopdevs.interviewtests.datastructures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Graph2 {

    private int vertices;
    private LinkedList<Integer>[] adjacencyList;

    public Graph2(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int vertex, int edge) {
        adjacencyList[vertex].add(edge);
    }

    public void performBFS(int source) {
        boolean[] visited = new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;

        while (queue.size() != 0) {
            source = queue.poll();
            Iterator<Integer> iterator = adjacencyList[source].listIterator();
            while (iterator.hasNext()) {
                int next = iterator.next();
                if (!visited[next]) {
                    queue.add(next);
                    visited[next] = true;
                }
            }
        }
    }

    public void performDFS(int source) {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();
        stack.add(source);
        visited[source] = true;

        while (!stack.isEmpty()) {
            int current = stack.pop();
            Iterator<Integer> iterator = adjacencyList[current].listIterator();
            while (iterator.hasNext()) {
                int next = iterator.next();
                if (!visited[next]) {
                    stack.add(next);
                    visited[next] = true;
                }
            }
        }
    }
}
