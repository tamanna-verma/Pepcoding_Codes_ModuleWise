import java.io.*;
import java.util.*;

public class ConstructBST {
  public static class Node
   {
    int data;
    Node left;
    Node right;

   
  }
public static Node constructBST(int sarr [],int low, int high)
{
    if(low>high)
    {
        return null;
    }
    int mid=(low+high)/2;
    Node node=new Node();
    node.data=sarr[mid];
    
    node.left=constructBST(sarr,low,mid-1);
    node.right=constructBST(sarr,mid+1,high);

    return node;

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


  public static void main(String[] args) throws Exception {
    int sarr[]={10,20,30,40,50,60,70,80,90};
    Node root = constructBST(sarr,0,sarr.length-1);
display(root);
    
  }

}
