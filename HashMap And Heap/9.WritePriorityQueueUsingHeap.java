import java.io.*;
import java.util.*;

public class Main {

  public static class PriorityQueue {
    ArrayList<Integer> data;

    public PriorityQueue()
     {
      data = new ArrayList<>();
    }

    public void add(int val)
     {
      data.add(val);
      upheapify(data.size()-1);//upheapify me hum. index pass krte hai  
    }
    public void swap(int i,int j)
    {
      int ith=data.get(i);
      int jth=data.get(j);
      data.set(i,jth);
      data.set(j,ith);
     
    }
   void upheapify(int i)//ek index mila hai
    {
      if(i==0)
      {
        return;
      }
        int pi=(i-1)/2;
        if(data.get(pi)>data.get(i))
      {
         swap(pi,i);

      }
      upheapify(pi);
    }
  void  downheapify(int i)
    {
      int mini=i;
      
      int lci=2*i+1;
      int rci=2*i+2;

      if(lci<data.size()&&data.get(lci)<data.get(mini))
      {
        mini=lci;
      }

      if(rci<data.size()&&data.get(rci)<data.get(mini))
      {
        mini=rci;
      }

      if(mini!=i)
      {
        swap(mini,i);
        downheapify(mini);
      }

    }

    public int remove() 
    {
      if(data.size()==0)
      {
        System.out.println("Underflow");
        return -1;
      }

      swap(0,data.size()-1);
      int val= data.remove(data.size()-1);

      downheapify(0);
       
      return val;

    }

    public int peek() 
    {
      if(data.size()==0)
      {
        System.out.println("Underflow");
        return -1;
      }
      return data.get(0);
    }

    public int size() 
    {
      return data.size();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue qu = new PriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}
