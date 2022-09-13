package ex_ch04;

public class Ex5_2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int sum = 0; // 총합을 저장하기 위한 변수
        float average = 0f; // 평균을 저장하기 위한 변수

        int[] score = { 100, 88, 100, 100, 90 };

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        average = sum / (float) score.length; // 계산결과를 float타입으로 얻으려 형변환

        System.out.println("총합:" + sum);
        System.out.println("평균:" + average);
    }

}
