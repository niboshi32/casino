package casino00_hole;

public class Player {
	private String name;
	private int pl_money;

	public String getName() {
		this.name = name;
		return name;
	}
	public int getPl_money() {
		this.pl_money = pl_money;
		return pl_money;
	}

	public void setName(String name) {
		//while 正しい名前の記述があるまで
		if(name == null) {
			System.out.println("名前を入力してください");
		}
		if(name.length() <= 2) {
			System.out.println("名前は３文字以上にしてください");
		}
		if(name.length() >= 10) {
			System.out.println("名前は10文字以内にしてください");
		}

		this.name = name;
	}

	public void setPl_money(int a) {
		this.pl_money = a;
	}


	public Player() {
		this.setPl_money(1000);
	}

}
