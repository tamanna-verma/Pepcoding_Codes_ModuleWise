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
  
  static class TPair
  {
    Node node;
    int state;
    
    TPair(Node node, int state)
    {
        this.node=node;
        this.state=state;
        
    }
  }

  public static void iterativePrePostInTraversal(Node node) 
  {
    Stack<TPair> stack=new Stack();
    TPair pair=new TPair(node,1);
    stack.push(pair);
    String Pre="";
    String In="";
    String Post="";
    
    while(stack.size()>0)
    {
        TPair top=stack.peek();
        
        if(top.state==1)
        {
            //state++,pre,left child is added
            Pre+=top.node.data+" ";
            if(top.node.left!=null)
            {
                TPair leftp=new TPair(top.node.left,1);
                stack.push(leftp);
                
            }
            
        }
        else if(top.state==2)
        {
            //state++,in , right child is added
            In+=top.node.data+" ";
            if(top.node.right!=null)
            {
                TPair rightp=new TPair(top.node.right,1);
                stack.push(rightp);
                
            }
        }
        else
        {
            //post,pop
            Post+=top.node.data+" ";
            stack.pop();
            
        }
        
        top.state++;
    }
    
    System.out.println(Pre);
    System.out.println(In);
    System.out.println(Post);
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
    iterativePrePostInTraversal(root);
  }

}
