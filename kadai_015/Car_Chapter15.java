package kadai_015;

// 車クラスを定義
public class Car_Chapter15 {
	private int gear = 1; // 1速から5速のギアを表す。初期値1
	private int speed = 10; // ギアチェンジ後の速度を表す。初期値10

	public Car_Chapter15(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	// ギアの値により速度を変える用途のメソッド
	public void gearChange(int afterGear) {
		int beforeGear = this.gear;

		// ギアに応じた速度
		this.gear = afterGear;
		switch (afterGear) {
			case 1 -> this.speed = 10;
			case 2 -> this.speed = 20;
			case 3 -> this.speed = 30;
			case 4 -> this.speed = 40;
			case 5 -> this.speed = 50;
			default -> this.speed = 10; // ギア1～5以外のギアの場合は速度を時速10kmとする。
		}

		System.out.println("ギア" + beforeGear + "から" + afterGear + "に切り替えました");
	}

	// ギアチェンジ後の速度を表示する用途のメソッド
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}
}