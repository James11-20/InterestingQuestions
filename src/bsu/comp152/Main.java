package bsu.comp152;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	 var myList = new LinkedList<String>();
     myList.add("John");
     myList.add("Enping");
     myList.add("Margaret");
     myList.add("Seikyung");
     myList.add("Haleh");
     myList.add("Paul");
     var listTraverser = myList.iterator();
     while (listTraverser.hasNext()){
         var name = listTraverser.next();
         if(name.equals("John"))
             listTraverser.remove();
     }
     System.out.println(myList);
//     for(var name: myList){
//         if(name.equals("John"))
//             myList.remove(name);
//     }
    }
}
