package jp.ac.uryukyu.ie.e185722;

public class Main {
    public static void main(String[] args) {
        /*
        ゲームタイトルの表示およびゲームルールの表示
         */
        NumerOn numerOn = new NumerOn("---------------*** NumerOn ***---------------");
        System.out.print("•プレイヤーは4つの数字をあてます。\n" +
                "•数字は0から9の間で被りはありません。\n" +
                "•入力した数字の位置と数字が当たってたらイート、\n" +
                " 数字だけあってたらバイトとします。\n" +
                "•4つともイートになったら終了です\n\n");

        //NumerOnを動かす
        while(numerOn.end == false){
            numerOn.number(numerOn);
        }
    }
}
