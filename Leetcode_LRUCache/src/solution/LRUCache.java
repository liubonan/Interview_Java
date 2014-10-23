package solution;

import java.util.*;

public class LRUCache {
	
	private int capacity;
	private HashMap<Integer, Node> map;
	private Node list;
	private Node tail;
    
    public LRUCache(int capacity) {
    	this.capacity = capacity;
    	this.map = new HashMap<Integer, Node>(capacity);
    	this.list = new Node(0, 0); // dummy
    	this.tail = new Node(0, 0); // dummy
    	this.list.next = this.tail;
    	this.tail.prev = this.list;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            this.markUsed(map.get(key));
        	return map.get(key).value;
        }
        
        return -1;
    }
    
    public void set(int key, int value) {
        if(map.containsKey(key)){
        	Node node = map.get(key);
        	node.value = value;
        	this.markUsed(node);
        	return;
        }
        
        if (map.size() >= this.capacity && map.size() != 0){
        	Node first = this.list.next;
        	map.remove(first.key);
        	this.list.next = first.next;
        	first.next.prev = this.list;
        }
        
        Node node = new Node(key, value);
        Node last = this.tail.prev;
        last.next = node;
        node.prev = last;
        node.next = this.tail;
        this.tail.prev = node;
    	map.put(key, node);
    }
    
    private void markUsed(Node node){
    	if(node != this.tail.prev){
        	Node prev = node.prev;
        	Node next = node.next;
        	Node last = this.tail.prev;
        	
        	prev.next = next;
        	next.prev = prev;
        	
        	last.next = node;
        	node.prev = last;
        	this.tail.prev = node;
        	node.next = this.tail;
    	}
    }
    
    private class Node{
    	int key;
    	int value;
    	Node next;
    	Node prev;
    	public Node(int key, int value){
    		this.key = key;
    		this.value = value;
    	}
    }
}
