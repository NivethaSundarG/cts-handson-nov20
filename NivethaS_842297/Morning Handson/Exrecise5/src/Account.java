public class Account {
	private int accnumber;
	private String name;
	private long amount;
	public int getAccountnumber() {
		return accnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accnumber = accountnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public Account(int accountnumber, String name, long amount) {
		super();
		this.accnumber = accnumber;
		this.name = name;
		this.amount = amount;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [accnumber=" + accnumber + ", name=" + name + ", amount=" + amount + "]";
	}
	

}