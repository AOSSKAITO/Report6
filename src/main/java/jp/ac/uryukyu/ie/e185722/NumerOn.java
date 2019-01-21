package jp.ac.uryukyu.ie.e185722;


import java.util.Scanner;

public class NumerOn {
    String title;
    int[] answer;
    int[] input;
    boolean end;
    int eat,bite,count;


    public NumerOn(String title) {
        //各変数の初期化。↓
        /*必要な変数
         * タイトル(String)、ルール文(String)、答え(int)の格納される配列。
         * プレイヤーが入力した数字(int)の格納される配列。
         * イート数(int)、バイト数(int)、チャレンジ(count)の回数
         */
        this.title = title;

        answer = new int[4];

        input = new int[4];

        end = false;

        eat = 0;
        bite = 0;
        count = 0;

        //タイトルとルールの表示
        System.out.println(title);
    }

    //メソッド１
    public void number(NumerOn oppnent) {
        //ランダムな答えを作成。(ヌメロンのルール上数字が被ってはいけない)
        for (int i = 0; i < answer.length; i++) {
            Loop:
            while (true) {
                answer[i] = (int) (Math.random() * 9 + 1);
                for (int j = 0; j < i; j++) {
                    if (answer[j] == answer[i]) continue Loop;

                    oppnent.game();
                }
                break;
            }
        }
    }


    //メソッド２
    public void game() {
        /*
        ゲームの動作に関する処理に関するメソッド
         */
        while (true) {
            //入力させる。
            count++;
            System.out.println("" + count + "ターン目");
            for (int i = 0; i < answer.length; i++) {
                System.out.print((i + 1) + "個目の数字 : ");
                Scanner scanner = new Scanner(System.in);
                try {
                    input[i] = scanner.nextInt();
                } catch (NumberFormatException e) {
                    i--;
                }
            }
            //答え判断
            eat = 0;
            bite = 0;
            for (int i = 0; i < answer.length; i++) {
                for (int j = 0; j < answer.length; j++) {
                    if (i == j && input[i] == answer[j]) {
                        eat++;
                    } else if (input[i] == answer[j]) {
                        bite++;
                    }
                }
            }

            //終了判断(ヒットが4つになったら終了)
            System.out.println("イート" + eat + " バイト" + bite);
            if (eat == 4) {
                System.out.println("YOU WIN");
                end = true;
                System.exit(0);
            } else {
                System.out.println();
            }
        }
    }
}