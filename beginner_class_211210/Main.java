//복습

/*
class Main {
  public static void main(String[] args) {
    //Array(배열) - 배열의 길이는 고정돼서 수정할 수 없음

    int[] num = {1,2,3,4,5};

    System.out.println(num[2]); //3
    System.out.println(num.length); //5
  }
}

import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    ArrayList lists = new ArrayList ();

    lists.add("1234");
    lists.add("6543");
    lists.add("5432");

    System.out.println(lists.get(0));
  }
}

import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    
    ArrayList<String> alist = new ArrayList<String>();
    alist.add("Hello");
    alist.add("22222"); // 그냥 22222는 숫자기 때문에 자료형을 강제하는 Generics 내에서는 못 들어감. "" 안에 넣어줘야 함.
    //Generics를 선언하면 형변환과 같은 불필요한 코딩과 잘못된 형변환 등의 오류를 사전에 방지할 수 있음

    System.out.println(alist.get(1));
  }
}

import java.util.HashMap;
class Main {
  public static void main(String[] args) {
    HashMap map = new HashMap();
    map.put("people", "사람");
    map.put("baseball","야구");

    System.out.println(map.get("people")); //사람
  }
}

import java.util.HashMap;
class Main {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<String, String>();
    map.put("people", "사람");
    map.put("baseball","야구");

    System.out.println(map.get("people")); //사람
    System.out.println(map.size()); //2
  }
}
*/

/*
Variable(변수)는 local variable과 global variable 2가지가 있음
전역변수는 그러나 영향이 굉장히 광범위하게 미치기 때문에 오류 방지를 위해서라도 지역변수 사용을 권장. 다만 지역변수는 또 영향 범위가 적기 때문에 원하는 대로 계산이 안 될 수도 있음
*/
// ----if문으로 바꾸기----
public class Main {
  public static void main(String[] args) {
    // int b1 = (5 > 4) ? 50 : 40;
    int b1;

    if (5 > 4) {
      b1 = 50;
    } else {
      b1 = 40;
    } System.out.println(b1);
  }
}