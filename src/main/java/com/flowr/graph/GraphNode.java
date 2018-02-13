package com.flowr.graph;

import org.apache.commons.collections.CollectionUtils;

import java.util.LinkedList;
import java.util.List;

public class GraphNode {

    private boolean isRootNode = false;
    private boolean isFinalNode = false;
    private String handlerId;
    private String name;
    private String desc;
    private List<GraphNode> subNodes;

    private GraphNode() {}

    public static GraphNode newRootNode() {
        GraphNode node = new GraphNode();
        node.isRootNode = true;
        return node;
    }

    public static GraphNode newFinalNode() {
        GraphNode node = new GraphNode();
        node.isFinalNode = true;
        return node;
    }

    public void addChild(GraphNode subNode) {
        if(CollectionUtils.isEmpty(subNodes)) {
            subNodes = new LinkedList<>();
        }
        subNodes.add(subNode);
    }

    public void removeChild(GraphNode subNode) {
        if(CollectionUtils.isEmpty(subNodes)) {
            return;
        }
        subNodes.remove(subNode);
    }
}
