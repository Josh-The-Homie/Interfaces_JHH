/**
 * 
 * @author Joshua Henderson
 *
 */


public class Task implements Priority, Comparable<Task> {
	public enum Status{
		NOT_STARTED, IN_PROCESS, COMPLETE
	};

	private final String name;
	private int priority;
	private Status Status;
	public String getName() {
		return name;
	}

	@Override
	public int getPriority() {
		return priority;
	}

	@Override
	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Task(String name) {
		this.name=name;
		this.priority=0;
		this.Status=Status.NOT_STARTED;

	}

	public void setStatus(Status Status) {
		this.Status = Status;
	}

	public Status getStatus() {
		return Status;
	}

	@Override
	public int compareTo(Task task1) {
		int t1 = task1.getPriority();
		int t2 = this.getPriority();
		if (t1 == t2) {
			return 0;
		} else if (t1 > t2) {
			return 1;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Task [name=" + name + ", priority=" + priority + ", Status=" + Status + "]";
	}

}
