package abstractClasses;

public abstract class AMenu {
	public void add(AMenu menu) {
		throw new UnsupportedOperationException();
	}
	public abstract void description();
	
	public AMenu getChild(int i) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(AMenu menu) {
		throw new UnsupportedOperationException();
	}
}
