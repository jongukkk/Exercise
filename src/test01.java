import java.util.Arrays;

public class test01 {

    static double getDistance(int x, int y, int x1, int y1) {
        return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y - 1));
    }

    public static void main(String[] args) {

        Student s = new Student("홍길동", 1, 1, 100, 60, 76);
        String str = s.info();
        System.out.println(str);
        System.out.println("이름:" + s.name);
        System.out.println("총점:" + s.getTotal());
        System.out.println("평균:" + s.getAverage());
        System.out.println(getDistance(1, 1, 2, 2));
        MyPoint p = new MyPoint(1, 1);
        System.out.println(p.getDistance2(2, 2));
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(original));

        int[] result = (stud.shuffle(original));
        System.out.println(Arrays.toString(result));

    }
}

class Student {

    String name; // 학생이름
    int ban; // 반
    int no; // 번호
    int kor; // 국어점수
    int eng; // 영어점수
    int math; // 수학점수

    Student(String name, int ban, int no, int kor, int eng, int math) {

        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    String info() {

        return name +
            ", " + ban +
            ", " + no +
            ", " + kor +
            ", " + eng +
            ", " + math +
            ", " + (kor + eng + math) +
            ", " + (int) ((kor + eng + math) / 3f * 10 + 0.5) / 10f;

    }

    int getTotal() {

        return kor + eng + math;

    }

    float getAverage() {

        return (int) (getTotal() / 3f * 10 + 0.5) / 10f;

    }
}

class MyPoint {

    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance2(int x1, int y1) {
        return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));

    }
}

class stud {

    static int[] shuffle(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int n = (int)(Math.random()*9);
            int tmp = arr[0];
            arr[0] = arr[n];
            arr[n] = tmp;
        }
        return arr;
    }

}

// 결과 "홍길동", 1, 1, 100, 60, 76,236,78.7