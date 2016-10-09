package com.cisco.challenge.util;

import java.util.ArrayList;

import com.cisco.challenge.graphstructure.GNode;

public class GNodeUtil{
	
	private ArrayList<GNode> visitedNodes = new ArrayList<GNode>();
	private ArrayList<ArrayList<GNode>> listOfPaths = new ArrayList<ArrayList<GNode>>();
	private ArrayList<GNode> path = new ArrayList<GNode>();

	public ArrayList<GNode> walkGraph(GNode node){
		dfs(node);
		return visitedNodes;
	}

	private void dfs(GNode node){
		if(!visitedNodes.contains(node)){
			visitedNodes.add(node);
		}
		GNode[] gnodes = node.getChildren();
		for(GNode gnode : gnodes){
			dfs(gnode);
		}
	}
	
	public ArrayList<ArrayList<GNode>> paths(GNode node){
		return findPaths(node);
	}

	private ArrayList<ArrayList<GNode>> findPaths(GNode node){
		path.add(node);		
		GNode[] gnodes = node.getChildren();
		if(gnodes.length == 0){
			listOfPaths.add((ArrayList<GNode>) path.clone());
		}
		for(GNode gnode : gnodes){
			listOfPaths = findPaths(gnode);
		}			
		path.remove(node);
		return listOfPaths;
	}
}
