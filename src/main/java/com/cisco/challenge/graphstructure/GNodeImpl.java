package com.cisco.challenge.graphstructure;

public class GNodeImpl implements GNode {
	
	private String name;
	private GNode[] children;
	
	public GNodeImpl(String name){
		this(name, new GNode[0]);
	}
	
	public GNodeImpl(String name, GNode[] children){
		this.name = name;
		this.children = children;
	}
	
	public String getName() {
		return name;
	}

	public GNode[] getChildren() {
		return children;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setChildren(GNode[] children) {
		this.children = children;
	}

}
