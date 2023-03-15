
/**
 * 
 * @author Joshua Henderson
 *
 */
public class Program2Application {

	public static void main(String[] args) {
		Task t1=new Task("Task1");
		Task t2=new Task("Task2");
		Process p1=new Process("Process1");
		Process p2=new Process("Process2");
		t1.setPriority(Task.MAX_PRIORITY);
		t2.setPriority(Task.MED_PRIORITY);
		p1.setPriority(Process.MIN_PRIORITY);
		p2.setPriority(Process.MIN_PRIORITY);
		System.out.println("This is t1's priority:"+t1.getPriority());
		System.out.println("This is t2's priority:"+t2.getPriority());
		System.out.println("This is p2's priority:"+p2.getPriority());
		System.out.println("This is p1's priority:"+p1.getPriority());
		t1.setStatus(Task.Status.IN_PROCESS);
		t2.setStatus(Task.Status.NOT_STARTED);
		System.out.println("This is t1's name:"+t1.getName());
		System.out.println("This is t2's name:"+t2.getName());
		System.out.println(t1.compareTo(t2));
		System.out.println(p2.compareTo(p1));
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
	}

}
