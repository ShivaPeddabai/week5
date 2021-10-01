
public class TestApplication {

	public static void main(String[] args) {
		Context c=new Context();
		GlassMadeofState made = new GlassMadeofState();
		made.madeOf(c);
		System.out.println(c.getState().toString());
		
		GlassServedState served = new GlassServedState();
		served.servedFor(c);
		System.out.println(c.getState().toString());
		
		GlassShapeState shape = new GlassShapeState();
		shape.shape(c);
		System.out.println(c.getState().toString());
	}

}
