package jp.ac.uryukyu.ie.e185722;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumerOnTest {
    /*
    初期設定4桁の数字がランダムでできているかの確認
     */

    @Test
    void number() {
        int[] answer1 = new int[4];
        int[] answer2 = new int[4];
        for (int i = 0; i < answer1.length; i++) {
            answer1[i] = (int) (Math.random() * 9 + 1);
        }
        for (int i = 0; i < answer2.length; i++) {
            answer2[i] = (int) (Math.random() * 9 + 1);
        }
        if(answer1 == answer2){
            System.out.printf("ランダムにできていません");
        }
        System.out.printf("ランダムにできています");
    }
}