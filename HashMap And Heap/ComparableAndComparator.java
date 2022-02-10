import java.io.*;
import java.util.*;
public class ComparableComparator
  {
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

    students[0]=new Student("A",180,75,566);
    students[1]=new Student("S",150,74,334);
    students[2]=new Student("B",185,77,888);
    students[3]=new Student("O",165,79,77);
    students[4]=new Student("T",177,66,88); 


     PriorityQueue<Student>  pqName = new PriorityQueue<>();
     PriorityQueue<Student>  pqHeight = new PriorityQueue<>(new StudentHeightComparator());
     PriorityQueue<Student>  pqWeight = new PriorityQueue<>(new StudentWeightComparator());
     PriorityQueue<Student> pqMarks  = new PriorityQueue<>(new StudentMarksComparator());
    for(Student student :students)
    {
      pqName.add(student); 
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
