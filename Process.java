/**
 * 
 * @author Joshua Henderson
 *
 */
public class Process implements Priority{
	final String processID;
	public int priority;

	Process(String process1) {
		processID = process1;
	}
@Override
	public int getPriority() {
		return priority;
	}
@Override
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getProcessID() {
		return processID;
		
	}
	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}
	public int compareTo(Process process1) {
		int p1=process1.getPriority();
		int p2=this.getPriority();
		if(p1==p2) {
			return 0;
		}
		else if (p1>p2) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
