import java.io.*;
import java.util.*;

public class MyGenericPriorityQueue
 {

  public static class MyPriorityQueue<T>
  {
    ArrayList<T> data;
    Comparator cmptr;

    public MyPriorityQueue()
     {
      data = new ArrayList<>();
      cmptr=null;
    }
    public MyPriorityQueue(Comparator cmptr) {
        data = new ArrayList<>();
        this.cmptr = cmptr;
      }

boolean isSmaller(int i,int j )
{
    T ith =data.get(i);
    T jth=data.get(j);

    if(cmptr!=null)
    { 
        if(cmptr.compare(ith,jth)<0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    else{
        Comparable cith=(Comparable)ith;
        Comparable cjth=(Comparable)jth;
        if(cith.compareTo(cjth)<0)
            {
            return true;
            }
            else
            {
                return false;
            }
    }
}

    public void add(T val)
     {
      data.add(val);
      upheapify(data.size()-1);//upheapify me hum. index pass krte hai  
    }

    public void swap(int i,int j)
    {
     T ith=data.get(i);
     T jth=data.get(j);
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
        if(isSmaller(i,pi)==true)
      {
         swap(pi,i);
         upheapify(pi);
      }
 
    }

  void  downheapify(int i)
    {
      int mini=i;
      
      int lci=2*i+1;
      int rci=2*i+2;

      if(lci<data.size()&&isSmaller(lci,mini)==true)
      {
        mini=lci;
      }

      if(rci<data.size()&&isSmaller(rci,mini)==true) 
      {
        mini=rci;
      }

      if(mini!=i)
      {
        swap(mini,i);
        downheapify(mini);
      }

    }

    public T remove() 
    {
      if(data.size()==0) 
      {
        System.out.println("Underflow");
        return null;
      }

      swap(0,data.size()-1);
      T val= data.remove(data.size()-1);

      downheapify(0);     
      return val;

    }

    public T peek() 
    {
      if(data.size()==0)
      {
        System.out.println("Underflow");
        return null;
      }
      return data.get(0);
    }

    public int size() 
    {
      return data.size();
    }

  }

//ab humne student class bnayi h 
static class Student implements Comparable<Student>
{
  String name;
  int height;
  int weight;
  int marks;

  Student(String name,int height, int weight,int marks )
  {
    this.name=name;
    this.height=height;
    this.weight=weight;
    this.marks=marks;

  }


//agar positive aaya difference , this is bigger than other 
//agar negative aaya difference , this is smaller than other 
//0 aaya difference , both are equal 
  public int compareTo(Student other)//comparable me ek hota hai this aur dusra hota hai  
  {
    return this.name.compareTo(other.name);
  }

  public String toString()
  {
    return (this.name+"->["+this.height+"],["+this.weight+"],["+this.marks+"]");
  }
}

static class StudentHeightComparator implements Comparator<Student>//agar hum static comparators bnate hai to unme comparator interface implement krna hota hai compare 
{
 public int compare(Student Student1, Student Student2)//do student ko compare krne k liye hum comparator inteface implement krna hoga
 {
     return Student1.height-Student2.height;

 }
}

 static class StudentMarksComparator implements Comparator<Student>//agar hum static comparators bnate hai to unme comparator interface implement krna hota hai compare 
{
 public int compare(Student Student1, Student Student2)//do student ko compare krne k liye hum comparator inteface implement krna hoga
 {
     return Student1.marks-Student2.marks;

 }
}


//agar hum comprator apply krte hai to priority queue comparable ka use nhi kregi  
static class StudentWeightComparator implements Comparator<Student>//agar hum static comparators bnate hai to unme comparator ka function hota hai compare 
{
 public int compare(Student Student1, Student Student2)//do student ko compare krne k liye hum comparator interface implement krna pdega 
 {
     return Student1.weight-Student2.weight;

 }
}


public static void main(String[] args) throws Exception {
 
  Student[] students=new Student[5];

  students[0]=new Student("Amit",180,75,566);
  students[1]=new Student("Sumeet",150,74,334);
  students[2]=new Student("Neha",185,77,888);
  students[3]=new Student("Kunal",165,79,77);
  students[4]=new Student("Aryan",177,66,88); 


   //Collection.reverseOrder ek comparator return krta hai aur humne humare code me comparator ko receive kiya hai
   MyPriorityQueue<Student>  pqName = new MyPriorityQueue<>();
   MyPriorityQueue<Student>  pqReverseName = new MyPriorityQueue<>(Collections.reverseOrder());
   MyPriorityQueue<Student>  pqHeight = new MyPriorityQueue<>(new StudentHeightComparator());
   MyPriorityQueue<Student>  pqWeight = new MyPriorityQueue<>(new StudentWeightComparator());
   MyPriorityQueue<Student> pqMarks  = new MyPriorityQueue<>(new StudentMarksComparator());
  for(Student student :students)
  {
    pqName.add(student); 
    pqReverseName.add(student);
    pqHeight.add(student);
    pqWeight.add(student);
    pqMarks.add(student);

  }

  System.out.println("Sorting on basis of Name\n");
  while(pqName.size()>0)
  {
    Student student=pqName.peek();
    pqName.remove();
    System.out.println(student);
  }

  System.out.println("Sorting on basis of Reverse Name\n");
  while(pqReverseName.size()>0)
  {
    Student student=pqReverseName.peek();
    pqReverseName.remove();
    System.out.println(student);
  }

System.out.println("Sorting on basis of Height\n");
while(pqHeight.size()>0)
{ 
Student student=pqHeight.peek();
pqHeight.remove();
System.out.println(student);
}


System.out.println("Sorting on basis of Weight\n");
while(pqWeight.size()>0)
{
Student student=pqWeight.peek();
pqWeight.remove();
System.out.println(student);
}


System.out.println("Sorting on basis of Marks\n");
while(pqMarks.size()>0)
{
Student student=pqMarks.peek();
pqMarks.remove();
System.out.println(student);
}
}
  }
