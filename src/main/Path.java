package main;

import java.util.Iterator;
import java.util.LinkedList;

public class Path {
    private LinkedList<Integer> path;

    // For testing purposes
    public Path(int ... vertices) {
        path = new LinkedList<>();
        for (int v : vertices) {
            path.add(v);
        }
    }

    public Path() {
        path = new LinkedList<>();
    }

    public void addVertex(int v) {
        path.add(v);
    }

    Iterator<Integer> getIterator() {
        return path.iterator();
    }

    @Override
    public String toString() {
        return "Path{" +
                "path=" + path +
                '}';
    }
}
