package kadai_015;

// 車クラス（Car_Chapter15）を実行するクラスを定義。
public class CarExec_Chapter15 {
	// フローの各処理はmainメソッド内で実行。
    public static void main(String[] args) {
        Car_Chapter15 gear = new Car_Chapter15(1, 30);
        gear.gearChange(3);
        gear.run();  // 速度を表示
    }
}
