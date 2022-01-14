import java.io.*;
import java.util.*;

public class SecondLargestInTree{
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

  static int Largest=Integer.MIN_VALUE;
  static int SecondLargest=Integer.MAX_VALUE;

  public static void SecondLargest(Node node)
  {
      if(node.data>Largest)
      {
          SecondLargest=Largest;
          Largest=node.data;
      }
      else if(node.data>SecondLargest)
      {
          SecondLargest=node.data;
      }
      for(Node childNode:node.children)
      {
          SecondLargest(childNode);
      }
  }

  static class MoverForSecondLargest
  {
       int largest=Integer.MIN_VALUE;
       int secondLargest=Integer.MIN_VALUE;
  }

  public static void SecondLargest2(Node node , MoverForSecondLargest mover)
  {
     if(node.data>mover.largest)
     {
         mover.secondLargest=mover.largest;
         mover.largest=node.data;
     }
     else if(node.data>mover.secondLargest)
     {
         mover.secondLargest=node.data;
     }

     for(Node childNode:node.children)
     {
     SecondLargest2(childNode,mover);
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
    SecondLargest(root);
    System.out.println(Largest);
    System.out.println(SecondLargest);
    
    MoverForSecondLargest mover=new MoverForSecondLargest();
    SecondLargest2(root,mover);
    System.out.println(mover.largest+" "+mover.secondLargest);
  }

}
