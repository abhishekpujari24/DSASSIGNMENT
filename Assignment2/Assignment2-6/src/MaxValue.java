
public class MaxValue {

//6. Insert 5 elements in stack and find maximum value in stack without traversing it.	
	public static void main(String[] args) {
		DescnedStack stack = new DescnedStack(5);
		stack.push(50);
		stack.push(80);
		stack.push(40);
		stack.push(90);
		stack.push(70);
		
		int maxValue=0;
		for(int i=0; i<5; i++) {
			int popElement=stack.pop();
			if(maxValue<popElement)
				maxValue=popElement;
		}
		System.out.println("Max value-"+maxValue);
	}
}
