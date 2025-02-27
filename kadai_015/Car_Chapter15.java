package kadai_015;

// 車クラスを定義
public class Car_Chapter15 {
	private int gear = 1; // 1速から5速のギアを表す。初期値1
	private int speed = 10; // ギアチェンジ後の速度を表す。初期値10

	// ギアの値により速度を変える用途のメソッド
	public void gearChange(int afterGear) {
		int beforeGear = this.gear;

		// ギアに応じた速度
		this.gear = afterGear;
		this.speed = switch(this.gear) {
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10; // ギア1～5以外のギアの場合は速度を時速10kmとする。
		};

		System.out.println("ギア" + beforeGear + "から" + afterGear + "に切り替えました");
	}

	// ギアチェンジ後の速度を表示する用途のメソッド
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}
}