import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }
   static class BSTClass{
     int min=Integer.MAX_VALUE;
     int max=Integer.MIN_VALUE;
     boolean IsBST=true;
     Node LargestBSTNode=null;
     int LargestBSTSize=0;
 }
 
 public static BSTClass LargestBST(Node node)
 {
     if(node==null) 
     {
        return new BSTClass(); 
     }
    BSTClass leftSide=LargestBST(node.left);
    BSTClass rightSide=LargestBST(node.right);

    boolean IsNodeBST=(leftSide.max<node.data)&&(node.data<rightSide.min);
    
    BSTClass myNodeResult=new BSTClass();
    myNodeResult.min=Math.min(node.data,Math.min(leftSide.min,rightSide.min));
    myNodeResult.max=Math.max(node.data,Math.max(leftSide.max,rightSide.max));
    
    myNodeResult.IsBST=(leftSide.IsBST==true)&&(rightSide.IsBST==true)&&(IsNodeBST==true);
   
    if(myNodeResult.IsBST==true)
    {
        myNodeResult.LargestBSTNode=node;
        myNodeResult.LargestBSTSize=leftSide.LargestBSTSize+rightSide.LargestBSTSize+1;
    }
    else if(leftSide.LargestBSTSize>rightSide.LargestBSTSize)
    {
        myNodeResult.LargestBSTNode=leftSide.LargestBSTNode;
        myNodeResult.LargestBSTSize=leftSide.LargestBSTSize;
    }
    else if(leftSide.LargestBSTSize<rightSide.LargestBSTSize)
    {
        myNodeResult.LargestBSTNode=rightSide.LargestBSTNode;
        myNodeResult.LargestBSTSize=rightSide.LargestBSTSize;
    }
    
    return myNodeResult;
 }
  

  public static void display(Node node)
  {
    if (node == null)
    {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }
  
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);
    
   BSTClass answer=LargestBST(root);
   System.out.println(answer.LargestBSTNode.data+"@"+answer.LargestBSTSize);
  }

}
