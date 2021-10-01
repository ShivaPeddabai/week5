
public class GlassMadeofState implements State{

		@Override
		public void madeOf(Context c) {
			System.out.println("Short Glasses are made with Bronze,Glass and Plastic etc.");
			c.setState(this);
		}

		@Override
		public void servedFor(Context c) {		
		}

		@Override
		public void shape(Context c) {
		}
		
		public String toString() {
			return "Glass MadeOf State";
		}

	}

