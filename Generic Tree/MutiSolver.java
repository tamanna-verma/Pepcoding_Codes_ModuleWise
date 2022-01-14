import java.io.*;
import java.util.*;

public class MultiSolver{
  private static class Node                                   //class hai node
  {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {                     //ye display function hai to print the entire tree
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {                   //ye construct function hai kisi array se tree construct krne k liye 
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

  public static int size(Node node) {                         //ye size function hai kisi bhi tree ka size batane k liye
    int s = 0;

    for (Node child : node.children) {
      s += size(child);
    }
    s += 1;

    return s;
  }

  public static int max(Node node) {                          //ye max function hai kisi bhi tree ki maximum value btane k liye 
    int m = Integer.MIN_VALUE;

    for (Node child : node.children) {
      int cm = max(child);
      m = Math.max(m, cm);
    }
    m = Math.max(m, node.data);

    return m;
  }

  public static int height(Node node) {                       //ye height function hai kisi bhi tree ki height btane k liye 
    int h = -1;

    for (Node child : node.children) {
      int ch = height(child);
      h = Math.max(h, ch);
    }
    h += 1;

    return h;
  }

  static int sum=0;                                           //ye sum ,max,min ,height ko humne statically initialize kiya hai 
  static int max= Integer.MIN_VALUE;                               
  static int min=Integer.MAX_VALUE;
  static int height=-1;

  public static void MultiSolver(Node node, int depth)          //ye multiSolver function hai 
  {
    sum+=node.data;
 
    if(node.data>max)
    {
      max=node.data;
    }
    if(node.data<min)
    {
       min=node.data;
    }

    if(depth>height)
    {
       height=depth;
    }

    for(Node childNode:node.children)
    { 
        MultiSolver(childNode,depth+1);
    }
  }
  public static class HeapMover                            //ye HeapMover class hai , ye class hum use krege , iske andar hum data members/variable ko initiate krskte hai 
  {
      int sum=0;
      int max=Integer.MIN_VALUE;
      int min=Integer.MAX_VALUE;
      int height=-1;
  }

  public static void multiSolver2(Node node, int depth,HeapMover mover)      //ye multiSolver 2 function hai , this function uses 
  {
   
   mover.sum+=node.data; 
    if(node.data>mover.max)
    {
        mover.max=node.data;
    }

    if(node.data<mover.min)
    {
        mover.min=node.data;
    }
    if(mover.height<depth)
    {
        mover.height=depth;
    }
    
    for(Node childNode:node.children)
    {
        multiSolver2(childNode,depth+1,mover);
    }
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
    MultiSolver(root,0);
    System.out.println("Sum "+ sum);
    System.out.println("Max "+max);
    System.out.println("Min "+ min);
    System.out.println("Height "+ height);

    HeapMover mover=new HeapMover();
    multiSolver2(root,0,mover);
    System.out.println("Sum "+ mover.sum);
    System.out.println("Max "+mover.max);
    System.out.println("Min "+ mover.min);
    System.out.println("Height "+ mover.height);
  }

}
