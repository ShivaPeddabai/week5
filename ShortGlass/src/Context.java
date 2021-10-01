
public class Context {
	State s;
	public Context() {
		s=null;
	}
	public void setState(State s) {
		this.s = s;
	}
	public State getState() {
		return s;
	}
}
