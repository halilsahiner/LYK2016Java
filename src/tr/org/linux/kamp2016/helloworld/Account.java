package tr.org.linux.kamp2016.helloworld;

public class Account {

	// private sadece aynı sınıfın içinden ulaşıma izin veriyor
	// public her yerden erişime izin veriyor
	// protected aynı paketin içinden erişime izin veriyor
	// default aynı sınıf ve hiyerarşi içinde erişime izin veriyor
	private String name;
	private double balance;// herkes erişmesin bunları değiştirmek için diye private'a aldık

	public Account(String name, double balance){ //constructor objeleri yaratmamıza olanak veriyor, istersek objeleri oluşturup gönderebiliriz
		this.name = name; // name'leri eşitledik işaret ederek

		if (balance > 0.0)
			this.balance = balance;

	}

	public void deposit(double depositAmount) {

		if (depositAmount > 0.0)
			balance = balance + depositAmount;

	}

	public double getBalance() { // double istediğimiz için yani boş olmadığı için return etmemiz gerekiyor
		return balance;
		
	}

	public void setName(String name) { // değişkenin tipi yoksa void yani boş bırakıyoruz
		this.name = name;
		// sadece buradaki name erişilebilir oluyor bu yaptıklarımız ile
	}

	public String getName() {
		return name;
	}
}
