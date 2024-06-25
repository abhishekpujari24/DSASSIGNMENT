
public class DoublyLinearLinkedListMain {

	public static void main(String[] args) {
		
		List l1 = new List();
		
		
		l1.insertFront(40);
		l1.insertFront(30);
		l1.insertRear(20);
		l1.insertRear(10);
		l1.insertFront(50);
		l1.insertRear(60);
		l1.forwardDisplay();
		l1.deleteRear();
		l1.deleteFront();
		
		l1.forwardDisplay();
		

	}

}







