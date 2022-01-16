
import java.io.*;
import java.util.*;

public class PredecessorAndSuccessor
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
static Node Predecessor;
static Node Successor;
static int State;
  
public static void PredecessorAndSuccessor(Node node,int data)
{
    if(State==0)
    {
        if(node.data!=data)
        { 
         Predecessor=node;
        }
        else
        {
           State=1;;
        }
    }else if(State==1)
    {
        Successor=node;
        State++;
    }
    
    //preorder me predecessor aur successor btane hai to recursive call se phle ye code likha jayega 
    //agar postorder me predecessor aur successor btane hote to recursive call k bad hum likhte code humara

    for(Node childNode:node.children)
    {
        PredecessorAndSuccessor(childNode,data);
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
   int data= Integer.parseInt(br.readLine());
    Node root = construct(arr);
    PredecessorAndSuccessor(root,data);
    System.out.println("Predecessor = "+Predecessor.data);
    System.out.println("Successor = "+Successor.data);
  }

}
