package abstractClasses;

public abstract class AConfirmDiscount {
	protected AConfirmDiscount succesor;
	
	public abstract void checkDiscount(int discount);
	public void sendForAcceptance(AConfirmDiscount succesor2) {
		succesor = succesor2;
	}
}