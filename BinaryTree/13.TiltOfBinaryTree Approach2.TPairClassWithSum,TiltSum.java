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

  public static void display(Node node) {
    if (node == null) {
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

  public static int height(Node node) {
    if (node == null) {
      return -1;
    }

    int lh = height(node.left);
    int rh = height(node.right);

    int th = Math.max(lh, rh) + 1;
    return th;
  } 

  static int TreeTilt = 0;
  public static int tilt(Node node)
  {
      if(node==null)
      {
          return 0;
      }
      
      int ls=tilt(node.left);
      int rs=tilt(node.right);
      
      int ts=ls+rs+node.data;
      TreeTilt+=Math.abs(ls-rs);
      
      return ts;
  }

static class TPair//TPair means traversal pair 
{
    int sum=0;
    int tiltSum=0;
}

public static TPair tilt2(Node node)
{
if(node==null)
{
    TPair BasePair=new TPair();
    BasePair.sum=0;
    BasePair.tiltSum=0;
    return BasePair;
}
TPair leftPair=tilt2(node.left);
TPair rightPair=tilt2(node.right);

TPair myPair=new TPair();
myPair.sum=leftPair.sum+rightPair.sum+node.data;
myPair.tiltSum=leftPair.tiltSum+rightPair.tiltSum+Math.abs(leftPair.sum-rightPair.sum);

return myPair;    
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

   TPair Answer=tilt2(root);
    System.out.println(Answer.tiltSum);
  }

}
