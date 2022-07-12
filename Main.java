package casino00_hole;

public class Main {

	public static void main(String[]args) {

			System.out.println("プレイヤーネームを入力してください");
			//プレイヤー入店
			//データをインスタンス化
			Player a = new Player();

			String name = new java.util.Scanner(System.in).nextLine();
			a.setName(name);

			System.out.println( a.getName() + "さん、こんにちは。ようこそカジノGへ");
//			System.out.println("あなたは"+ a.getPl_money() +"$ををもっています");


			System.out.println("ここでは様々なゲームが遊べます");

			while(a.getPl_money() >=0 ){
				System.out.println("現在の所持金は"+ a.getPl_money() +"$です");
				System.out.println("どれをプレイしますか？");
				System.out.println(" ");
				System.out.println("ブラックジャック：1");
				System.out.println("ルーレット：2");
				System.out.println("バカラ：3");
				System.out.println("ポーカー：4");
				System.out.println("スロット：5");
				int choiceGame = new java.util.Scanner(System.in).nextInt();

				switch(choiceGame) {
				case 1 :
					a.setPl_money(casino02_black_jack.BlackJack.BlackJack(a.getPl_money()));
					break;

				case 2 :
					a.setPl_money(casino01_roulette.Roulette.roulette(a.getPl_money()));
					break;

				case 3 :
					System.out.println("未実装");
					break;

				case 4 :
					System.out.println("未実装、こうご期待");
					break;

				case 5 :
					a.setPl_money(casino04_slot_α.SlotMachine.SlotMachine(a.getPl_money()));
				}
			}
			System.out.println("所持金がなくなりました、またお越しください");
//				self.practice00_
			// TODO 自動生成されたコンストラクター・スタブ
	}

}
