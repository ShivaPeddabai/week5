
public class GlassServedState implements State{

	@Override
	public void madeOf(Context c) {
	}

	@Override
	public void servedFor(Context c) {
		System.out.println("Short Glasses are used to Serve Water, Coffee, Alcohol etc..");
		c.setState(this);
	}

	@Override
	public void shape(Context c) {
	}
	
	public String toString() {
		return "Glass Served State";
	}

}

