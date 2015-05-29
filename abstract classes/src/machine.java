
public abstract class machine {//added the abstract keyword
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public abstract void start();//abstract method
	public abstract void doStuff();
	public abstract void shutDown();
	
	
	public void run(){
		start();
		doStuff();
		shutDown();
	}
}
