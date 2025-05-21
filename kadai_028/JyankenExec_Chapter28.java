package kadai_028;

public class JyankenExec_Chapter28 {
    public static void main(String[] args) {
        Jyanken_Chapter28 game = new Jyanken_Chapter28();
        String myChoice = game.getMyChoice();              // 自分の手を入力
        String opponentChoice = game.getRandom();          // 相手の手をランダムで取得
        game.playGame(myChoice, opponentChoice);           // 勝負！
    }
}
