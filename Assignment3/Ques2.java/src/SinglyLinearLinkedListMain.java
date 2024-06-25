import java.util.Scanner;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SinglyLinearLinkedListMain {

    public static void main(String[] args) {

        List l1 = new List();

        l1.addFirst(40);
        l1.addFirst(30);
        l1.addFirst(20);
        l1.addFirst(10);
        // 10 -> 20 -> 30 -> 40

        //l1.addLast(50);
      

       // l1.deletePosition(5);
        System.out.println("");
//        System.out.println(" \n Search the element 20 : " + l1.Search(40));

        l1.display();
        System.out.println("Enter given Data node to insert data at after its position  ");
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        l1.insertAtSameData(pos);
      // l1.insertAtSameData(40); // modify insert function so that it checks with all count values and traverses to all count value to insert value ,it works fro only value of last element 40 ;
        l1.display();
        System.out.println("Enter given Data node to insert data at before its position  ");

        pos = sc.nextInt();
        l1.insertBeforeData(pos);
        l1.display();

    }

}

//