package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Path {
    private final List<Integer> path;

    // For testing purposes
    public Path(int ... vertices) {
        path = Arrays.stream(vertices)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toList(),  Collections::unmodifiableList));
    }

    public Path() {
        path = new LinkedList<>();
    }

    public void addVertex(int v) {
        path.add(v);
    }

    public int getSize() {
        return path.size();
    }

    public List<Integer> getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "Path{" +
                "path=" + path +
                '}';
    }

    int getVertex(final int i) {
        return path.get(i);
    }
}
