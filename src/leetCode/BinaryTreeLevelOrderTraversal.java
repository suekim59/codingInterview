package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
	
	//2021.05.21
	//Binary Tree Level Order Traversal
	//BFS
	public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode() {}
	     TreeNode(int val) { this.val = val; }
	     TreeNode(int val, TreeNode left, TreeNode right) {
	         this.val = val;
	         this.left = left;
	         this.right = right;
	      }
		}
	class Solution {
	    public List<List<Integer>> levelOrder(TreeNode root) {
	    	
	    	ArrayList<List<Integer>> answer = new ArrayList<>();
	    	if(root == null) return answer; //root가 빈 매열일 때, 
	    	
	    	Queue<TreeNode> q = new LinkedList<>();
	    	q.offer(root);
	    	
	    	while(!q.isEmpty()) {
	    		List<Integer> list= new ArrayList<>();
	    		int size = q.size(); // ***//안에서 계속적으로 q의 사이즈가 바뀌기 때문에 무조건 고정
	    		for(int i = 0; i<size; i++) {
	    			TreeNode node = q.poll();
	    			list.add(node.val);
	    			if(node.left != null) q.offer(node.left); //넣은 순서대로 나오기 때문에, left가 먼저 나옴
	    			if(node.right !=null) q.offer(node.right);
	    		}
	    		answer.add(list);
	    	}
	    	
			return answer;
	    }

	}

}
