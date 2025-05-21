package kadai_028;

import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    // 自分のじゃんけんの手を入力するメソッド
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        // ユーザーへの入力ガイダンス
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        // 入力が正しいまで繰り返す
        while (true) {
            input = scanner.nextLine().toLowerCase();
            if (input.equals("r") || input.equals("s") || input.equals("p")) {
                break;
            } else {
                System.out.println("無効な入力です。r、s、pのいずれかを入力してください。");
            }
        }
        return input;
    }

    // 相手の手をランダムに決めるメソッド
    public String getRandom() {
        String[] hands = { "r", "s", "p" };
        Random random = new Random();
        int index = (int) Math.floor(random.nextDouble() * 3); // 0〜2の整数
        return hands[index];
    }

    // じゃんけん勝負をするメソッド
    public void playGame(String myChoice, String opponentChoice) {
        // 表示用マッピング
        java.util.HashMap<String, String> handMap = new java.util.HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");

        // 両者の手を表示
        System.out.println("自分の手は" + handMap.get(myChoice) + ",対戦相手の手は" + handMap.get(opponentChoice));

        // 勝敗判定
        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです");
        } else if (
            (myChoice.equals("r") && opponentChoice.equals("s")) ||
            (myChoice.equals("s") && opponentChoice.equals("p")) ||
            (myChoice.equals("p") && opponentChoice.equals("r"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
