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

public static class DiaPair
{
  int Diameter;
  int height;
}
  public static DiaPair diameter4(Node node) 
  {
    if(node==null)
    {
        DiaPair baseCase=new DiaPair();
        baseCase.Diameter=0;
        baseCase.height=0;
        return baseCase;
    }
    
    DiaPair LeftSubtree=diameter4(node.left);
    DiaPair RightSubtree=diameter4(node.right);
    
    DiaPair MaxPair=new DiaPair();
    MaxPair.height=Math.max(height(node.left),height(node.right))+1;
    MaxPair.Diameter=Math.max(LeftSubtree.Diameter,Math.max(RightSubtree.Diameter,LeftSubtree.height+RightSubtree.height+2));
    return MaxPair;

  }
  public static int diameter3(Node node) 
  {
    if(node==null)
    {
        return 0;
    }
    int leftHeight=height(node.left);//jab bhi recursion k andar ek aur recursive calllgrhi ho to iska mtlb hoga ki us question ki time complexity bnrhiu hai o n2 but agar hume ise kam time complexity e solve krna hai to iska mtlb hoga ki ehume ek aisa function bnayege jha dono km eksth solve honge
    int rightHeight=height(node.right);
    
    int factor1=leftHeight+rightHeight+2;//agar beech me hoga diameter
    int factor2=diameter3(node.left);//left subtree ka dimeter
    int factor3=diameter3(node.right);//right subtree ka diameter
    
    //root node ka diameter
    //left subtree ka diameter 
    //right subtree ka diameter
    
    return Math.max(factor1,Math.max(factor2,factor3));
  }


static class DiaMover
{
    
    int dia=0;
}
public static int diameter2(Node node,DiaMover dm)
{
    if(node==null)
    {
       return -1;
        
    }
    
 int leftHeight=diameter2(node.left,dm);
 int rightHeight=diameter2(node.right,dm);
    
    int height=Math.max(leftHeight,rightHeight)+1;

    if(leftHeight+rightHeight+2>dia)
    {
        dm.dia=leftHeight+rightHeight+2;
    }
    return height;

}
static int dia=0;

public static int diameter1(Node node)
{
    if(node==null)
    {
        return -1;
    }
    
    int leftHeight=diameter1(node.left);
    int rightHeight=diameter1(node.right);
    
    int height=Math.max(leftHeight,rightHeight)+1;

    if(leftHeight+rightHeight+2>dia)
    {
        dia=leftHeight+rightHeight+2;
    }
    return height;
    
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

   int diameter = diameter1(root);//0;
   System.out.println(dia);
 //  DiaPair MaxPair= diameter4(root);
   //diameter=MaxPair.Diameter;
   
 //  DiaMover dm=new DiaMover();
  // diameter2(root,dm);
   // System.out.println(dm.dia);
  }

}
