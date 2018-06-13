package lets.code.every.day;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class AverageofLevelsinBinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			val = x;
		}
	}

	public List<Double> averageOfLevels(TreeNode root) {
	        List < Double > res = new ArrayList < > ();
	        Queue<TreeNode> q=new LinkedList<>();
	        q.add(root);
	        while(!q.isEmpty())
	        {
	        	int n = q.size();
	        	double sum = 0.0;
	        	for(int i = 0; i<n;i++) //这个地方设计的比较巧妙，用来计算一层的节点
	        	{
	        		TreeNode x = q.poll();
	        		sum += x.val;
	        		if(x.left != null)
	        			q.add(x.left);
	        		if(x.right != null)
	        			q.add(x.right);//同q.offer
	        		
	        	}
	        	res.add(sum / n);
	        }
	        return res;
	       
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
