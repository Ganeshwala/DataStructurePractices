package Com.DS.Tree.BasicTreeStructure;
import java.util.*;
import java.util.ArrayList;

public class TreeNode {
  
    String data;
    ArrayList<TreeNode> children;
    
    public TreeNode(String data) {
    	this.data=data;
    	children = new ArrayList<TreeNode>();
    }
  
    public void addChildren(TreeNode node) {
    	children.add(node);
    }
    
    public String printTree(int level) {
    	String result="  "+data+"\n";
    	String repeated = new String(new char[level]).replace("\0", result);
    	for(TreeNode node:children) {
    		result += node.printTree(level+1);
    	}
    	return result;
    }
}
