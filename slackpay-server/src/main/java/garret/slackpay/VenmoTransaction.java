package garret.slackpay;

public class VenmoTransaction {
	public String txn;
	public double amount;
	public String note;
	public String recipient;
	public static final String audience = "private";
	
	private VenmoTransaction(double amount,String recipient, String note){
		this.amount = amount;
		this.recipient = recipient;
		this.note = note;
	}
	
	private void setTxn(String type){
		this.txn = type; 
	}
	
	public static VenmoTransaction getPayTransaction(double amount,String recipient,String note){
		VenmoTransaction v = new VenmoTransaction(amount, recipient, note);
		v.setTxn("pay");
		return v;
	}
	
	public String getLink(){
		return "<https://venmo.com/?txn"+this.txn+"&"+
				"recipients="+this.recipient+"&"+
				"amount="+this.amount+"&"+
				"note="+this.note+"&"+
				"audience="+this.audience+"|Pay User>";
	}
}
