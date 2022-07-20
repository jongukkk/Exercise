import java.lang.reflect.Member;
import java.util.Arrays;
import java.util.Scanner;
import javax.xml.crypto.Data;
import sun.awt.geom.AreaOp.SubOp;

public class Test6_11 {

    public static void main(String[] args) {
        StudyCafe s = new StudyCafe();
        s.registration();
        Object o = new Object();

        s.registration();
    }
}

class StudyCafe {

    Register[] member; // 회원정보를 담을 Register 배열 생성 총 회원수 100
    SeatInfo[] seat; // 좌석 리스트 배열 선언
    int num; // 임시로 회원목록 빈 공간의 번호를 저장
    Scanner sc = new Scanner(System.in); // 입력받을 공간 생성

    {
        member = new Register[100];// 길이 100의 회원정보 배열 생성
        seat = new SeatInfo[50];// 길이 50의 Seat 배열 생성
        for (int i = 0; i < seat.length; i++) { // 좌석에 번호를 붙여줌
            seat[i] = new SeatInfo();
            seat[i].seatNum = i;
            seat[i].useCheck = false;
        }
    }

    Register[] registration() { // 회원등록 메서드
        for (int i = 1; i < member.length; i++) {
            if (member[i] == null) { // 회원목록의 빈 공간을 탐색
                num = i; // 빈 공간의 번호를 수집
                member[num] = new Register(); // 빈 공간에 회원 인스턴스 생성
                System.out.println("이름을 입력하세요.");
                member[num].name = sc.next(); // name 정보를 수집
                System.out.println("핸드폰 번호를 입력하세요.");
                member[num].phone = sc.next(); // phone 정보를 수집
                member[num].number = num; // 회원 번호 부여
                System.out.printf(
                    "%n이름: %s%n연락처: %s%n회원번호: %d%n%n회원 등록이 완료되었습니다.%n", member[num].name,
                    member[num].phone, member[num].number
                );
                break;
//            } else {
//                System.out.println("회원 정원이 초과하여 신규 등록이 불가능합니다.");
            }
        }
        return new Register[]{member[num]}; // 회원의 정보를 Register 배열에 저장함
    }


    public void getRegister() {// 회원의 정보를 불러옴
        int num = getMemberNum();
        if (num != 999) {
            System.out.printf(
                "%n회원 정보를 불러옵니다.%n%n이름: %s%n연락처: %s%n회원번호: %d%n", member[num].name,
                member[num].phone, member[num].number
            );
        }
    }

    public void getSeatList() {
        System.out.printf("%n사용가능한 좌석: ");
        for (int i = 0; i < seat.length; i++) {
            if (seat[i].useCheck) {
                System.out.printf("%s(사용중), ", seat[i].seatNum);
            } else {
                System.out.printf("%s, ", seat[i].seatNum);
            }
        }
    }

    public void setSeat() {
        int num = getMemberNum(); // 회원의 번호를 얻음

        if (num != 999) { //
            System.out.println("원하는 좌석의 번호를 입력하세요.");
            int seatNum = sc.nextInt();
            if (seat[seatNum].useCheck == false) {
                member[num].mySeat = seatNum; // 회원의 사용중인 좌석에 등록
                seat[seatNum].useCheck = true; // 좌석을 사용중으로 바꿈
                System.out.println(member[num].mySeat + "번 좌석 등록완료!");
            } else {
                System.out.println("선택하신 좌석은 이미 사용중입니다.");
            }
        }
    }

    public int getMemberNum() {
        System.out.printf("%n연락처를 입력하세요.");
        String input = sc.next();
        for (int num = 1; num < member.length; num++) {
            if (input.equals(member[num].phone)) {
                return num;
            } else {
                System.out.println("입력한 정보가 존재하지 않습니다.");

            }
            break;
        }
        return 999;
    }
}

class Register {

    protected String name;
    protected String phone;
    protected int mySeat;
    protected static int number;

}

class SeatInfo {

    int seatNum;
    boolean useCheck;

}