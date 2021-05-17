package leetCode;

public class BinaryTreeCameras {
	//2021.05.17
	//greedy solution -> dfs
	//1.���� �θ� ��ο� ī�޶� ��ġ
    //2. Ŀ���Ǵ� ����� ī�޶� ����
	//3. ��� ��尡 Ŀ�� �� ������ �ݺ�
	
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
		//�ᱹ, binary tree���� dfs�� �� �Ʒ��������� �Ųٷ� �����غ��� ��.
		
		if(root==null) return 2;
		int left = dfs(root.left); //left�� ������ ���� ������ ��
		int right = dfs(root.right);
		
		if(left == 0 || right == 0) {
			res++; //�θ� root�� ī�޶� ��ġ
			return 1;
		}
		return left == 1 || right ==1? 2:0;
		
	}
	
}
