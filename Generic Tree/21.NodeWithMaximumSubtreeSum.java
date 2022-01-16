import java.io.*;
import java.util.*;

public class MaximumSumNode
{
  private static class Node                                   //class hai node
  {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static Node construct(int[] arr) 
   {                   //ye construct function hai kisi array se tree construct krne k liye 
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  public static int MaximumSum=0;
  public static Node MaximumSumNode=null;

  public static int MaximumSumNode(Node node)
  {
      int sum=node.data;

      for(Node childNode:node.children)
      {
          int childSum=MaximumSumNode(childNode);
          sum+=childSum;
      }

      if(sum>MaximumSum)
      {
          MaximumSumNode=node;
          MaximumSum=sum;
      }
      return sum;
  }
  
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }
    Node root = construct(arr);
    MaximumSumNode(root);
   System.out.println(MaximumSumNode.data + " @ "+ MaximumSum);
  }

}
