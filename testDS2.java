import java.util.*;
// TEST  AT 7:00 ON 02-12-2022
	class Triplet
	{
	    int max, above, below;
	    Triplet(int max, int above, int below)
	    {
	        this.max = max;
	        this.above = above;
	        this.below = below;
	    }
	}

public class testDS2
{
	public static int timeToBurnTree(BinaryTreeNode<Integer> root, int start)
	    {
	        Triplet ans = fun(root, start);
	        return ans.max;
	    }
	public static Triplet fun(BinaryTreeNode<Integer> root, int start)
	    {
	        if (root == null)
	            return new Triplet(-1, -1, 0);
	        Triplet left = fun(root.left, start);
	        Triplet right = fun(root.right, start);
	        Triplet ans = new Triplet(-1, -1, 0);
	        if (root.data == start)
	        {
	            int below = Math.max(left.below, right.below);
	            ans.max = below;
	            ans.above = 0;
	            ans.below = below;
	        }
	        else if (left.above != -1)
	        {
	            ans.max = Math.max(left.max, Math.max(left.below, left.above + right.below + 1));
	            ans.above = left.above + 1;
	            ans.below = left.below;
	        }
	        else if (right.above != -1)
	        {
	            ans.max = Math.max(right.max, Math.max(right.below, right.above + left.below + 1));
	            ans.above = right.above + 1;
	            ans.below = right.below;
	        }
	        else
	        {
	            ans.max = -1;
	            ans.above = -1;
	            ans.below = Math.max(left.below, right.below) + 1;
	        }
	        return ans;
	    }
	
	/* **********************************************************************/
	private static boolean helper(BinaryTreeNode<Integer> root, int min, int max)
	{
        // An empty tree is a BST
        if (root == null)
            return true;
        // False if this node violates the min/max constraint
        if ((root.data < min) || (root.data > max))
            return false;
        // Otherwise check the subtrees recursively, modifying the min or max constraint
        boolean leftSearch = helper(root.left, min, root.data);
        boolean rightSearch = helper(root.right, root.data, max);
        return leftSearch & rightSearch;
    }

    public static boolean validateBST(BinaryTreeNode<Integer> root)
    {
        return (helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
    
    /* **************************************************************************/
    public static ArrayList<Integer> inorder = new ArrayList<Integer>();

    public static void inorderTraversal(BinaryTreeNode<Integer> currentNode)
    {
        // Base case, if the node is null then reutrn back.
        if (currentNode == null)
            return;
        // For inorder traver we will first visit left child, then we will store the current node, then we visit the right child.
        inorderTraversal(currentNode.left);
        inorder.add(currentNode.data);
        inorderTraversal(currentNode.right);
    }

    public static int binarySearch(int key)
    {
        // We will find the first element in the array which is greater than or equal to key using binary search.
        // l is the lower limit of binary search and r is the upper limit of the binary search.
        // We will store our answer in ans variable.
        int l = 0, r = inorder.size() - 1, ans = -1;
        while (l <= r)
        {
            // We will initialize the mid with (l+r)/2.
            // If the element at position mid is greater than or equal to key then we will update the answer and compress range to left hand side.
            // Else we will compress the range to the right hand side.
            int mid = (l + r) / 2;
            if (inorder.get(mid) >= key)
            {
                ans = mid;
                r = mid - 1;
            }
            else
                l = mid + 1;
        }

        // If there is no element in preorder array list which is greater than or equal to key then we will-
        // -return the size of the preorder array list as all the elements are less than key.
        // Else we will reutrn our answer.
        if (ans == -1)
            return inorder.size();
        else
            return  ans;
    }

    public static ArrayList<Integer> bstQueries(BinaryTreeNode<Integer> root, int q, int[][] queries)
    {
        // Initialize the answer array list where we will store the answers of all the queries.
        ArrayList<Integer> answer = new ArrayList<Integer>();
        inorder.clear();   
        //We will traverse the binary tree and get its inorder array list.
        inorderTraversal(root);
        // Iterate through all the queries and for each query calculate the (upper_bound - lower_bound)
        for (int i = 0; i < q; i++)
        {
            // We will calculate the position which is just greater than R and store it in IndexR.
            // We will calculate the position which is just greater than or equal to L and store it in IndexL.
            // The number of elements between L and R is (IndexR - IndexL).
            int indexR = binarySearch(queries[i][1] + 1);
            int indexL = binarySearch(queries[i][0]);
            answer.add(indexR - indexL);
        }
        // Return the answer array list.
        return answer;
    }
    /* **************************************************************************************/
	public static void main(String args[])
	{
		
	}
}
