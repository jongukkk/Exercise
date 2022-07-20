import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test7_8 {

    public static void main(String[] args) {



        HashMap map = new HashMap();
        map.put("whddnr0908", "qmffor");
        map.put("fbtm0908", "qmffor");

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry e = (Entry) it.next();
            System.out.println(e.getKey() + "" + e.getValue());
        }

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("이규호", 2, 10));
        list.add(new Student("김석범", 3, 7));
        Iterator<Student> it2 = list.iterator();

        while (it2.hasNext()) {
            Student s = it2.next();
            System.out.println(s.name);
        }


    }
}



class Student {

    String name = "";
    int ban;
    int no;

    Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }

//    @Override
    @Deprecated
//    @FunctionalInterface
    @SuppressWarnings("e")

    // @Target TYPE, FIELD , TYPE_USE
    // @Retention SOURCE (소스파일) , CLASS(기본) , RUNTIME(런타임)
    // @Documented javadoc.exe *.html 파일을 위한 애너테이션 정의
    // @Repeatable 반복 가능한 애너테이션 정의 / 이를 묶어줄 컨테이너 애너테이션 필요
    void test () {}
}

