package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListSample
{
 public static void main(String[] args)
 {
     List mylist = new ArrayList();
     List mylis = new ArrayList();

     mylist.add("Shrey");
     mylist.add("Ayush");
     mylist.add("Shivam");


     mylis.add("Kaushik");
     mylis.add("Jethwani");
     mylis.add("Sharma");

     Iterator iterator = mylist.iterator();

     Iterator iterato = mylis.iterator();

     while(iterator.hasNext()||iterato.hasNext())
     {
         Object next = iterator.next();
         Object nex = iterato.next();
         System.out.println(next+" "+nex);
     }
 }
}
