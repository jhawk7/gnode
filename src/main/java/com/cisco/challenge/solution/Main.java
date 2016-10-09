package com.cisco.challenge.solution;

import java.util.ArrayList;
import java.util.List;

import com.cisco.challenge.graphstructure.GNode;
import com.cisco.challenge.graphstructure.GNodeImpl;
import com.cisco.challenge.util.GNodeUtil;

public class Main {	
	public static void main(String[] args){
		//Creating Data
		GNodeImpl node1 = new GNodeImpl("node1", new GNode[]{new GNodeImpl("node11"), new GNodeImpl("node12"), new GNodeImpl("node13")});
		GNodeImpl node2 = new GNodeImpl("node2", new GNode[]{new GNodeImpl("node21"), new GNodeImpl("node22"), new GNodeImpl("node23")});
		GNodeImpl node3 = new GNodeImpl("node3", new GNode[]{new GNodeImpl("node31"), new GNodeImpl("node32"), new GNodeImpl("node33")});
		GNodeImpl node4 = new GNodeImpl("node4", new GNode[]{new GNodeImpl("node41"), new GNodeImpl("node42"), new GNodeImpl("node43")});
		GNode[] nodes = {node1, node2, node3, node4};
		GNodeImpl node = new GNodeImpl("node",nodes);
		
		//Utilizing Utility functions
		GNodeUtil gnodeUtil = new GNodeUtil();
		List<GNode> gnodes = gnodeUtil.walkGraph(node);
		for(GNode gnode : gnodes){
			System.out.println(gnode.getName());
		}
		
		System.out.println("=============================================================================");
		
		ArrayList<ArrayList<GNode>> listOfPaths = gnodeUtil.paths(node);
		for(ArrayList<GNode> gnodeList : listOfPaths){
			for(GNode gnode : gnodeList){
				System.out.print(gnode.getName());
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		
	}
}
