import java.util.Arrays;

class SutdaDeck { //

    final int CARD_NUM = 20; // 섯다 카드의 총 갯수를 상수 20으로 고정
    SutdaCard[] cards = new SutdaCard[CARD_NUM]; // 섯다 카드를 저장할 배열

    SutdaDeck() { // 총 20장의 카드, 1~10의 숫자를 가진 카드 한쌍 단, 1, 3, 8인 경우 한 쌍중 다른 하나는 광(Kwang)이 되어야함.
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
            cards[i] = new SutdaCard(num, isKwang);
        }
    }
    void shiffle (){ // 배열 cards에 담긴 카드의 위치를 뒤섞는다 (math.random()사용)

        int j = (int)(Math.random()*cards.length); // 0~19 랜덤값 생성

        for (int i = 0; i < cards.length; i++) {
            SutdaCard tmp = cards[i]; //  참조변수 SutdaCard 타입의 tmp 멤버변수에 cards[i] 저장
//            int tmp = cards[i];  // 참조변수의 타입이 달라서 저장 불가능
            cards[i] = cards[j];
            cards[j] = tmp;

        }
    }



    SutdaCard pick (int index){// 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
        if(!(0< index || index <20)) {return null;}

        return cards[index];

    }
    SutdaCard pick () {// 배열 cards에서 임의의 위치의 SutdaCard를 반환한다. (math.random(사용)}
        int index = (int)(Math.random()*cards.length);
        return cards[index];
    }
//

}

class SutdaCard {

    int num;
    boolean isKwang;

    SutdaCard() {

        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {

        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {

        return num + (isKwang ? "K" : "");
    }

}

public class Test7_1 {

    public static void main(String[] args) {

        SutdaDeck deck = new SutdaDeck();
        deck.shiffle();
        System.out.println(deck.pick(15));

//        for (int i = 0; i < deck.cards.length; i++) { // 섯다카드의 배열 출력
//            System.out.printf(deck.cards[i] + ",");
//        }
    }

}
