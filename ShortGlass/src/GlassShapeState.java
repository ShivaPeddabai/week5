
public class GlassShapeState implements State{

	@Override
	public void madeOf(Context c) {
	}

	@Override
	public void servedFor(Context c) {		
	}

	@Override
	public void shape(Context c) {
		System.out.println("Short Glasses are available in Bottles, HighBall glasses etc..");
		c.setState(this);
	}
	public String toString() {
		return "Glass Shape State";
	}

}
