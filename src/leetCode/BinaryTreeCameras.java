package leetCode;

public class BinaryTreeCameras {
	//2021.05.17
	//greedy solution -> dfs
	//1.잎의 부모 모두에 카메라 설치
    //2. 커버되는 노드의 카메라 삭제
	//3. 모든 노드가 커버 될 때까지 반복
	
	//return 0 : a leaf
	//return 1 : parent of a leaf, with a camera
	//return 2 : if it's covered, without a camera
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
	
	int res = 0;
    
	public int minCameraCover(TreeNode root) {
		return (dfs(root) <1 ? 1 :0) +res;
	}
	
	public int dfs(TreeNode root) {
		//결국, binary tree에서 dfs는 맨 아래에서부터 거꾸로 생각해봐야 함.
		
		if(root==null) return 2;
		int left = dfs(root.left); //left가 끝까지 있을 때까지 들어감
		int right = dfs(root.right);
		
		if(left == 0 || right == 0) {
			res++; //부모 root에 카메라 설치
			return 1;
		}
		return left == 1 || right ==1? 2:0;
		
	}
	
}
