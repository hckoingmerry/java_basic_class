/*
import java.util.Scanner;
public class Flowchart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("height: "); double  height = sc.nextDouble();
        System.out.print("base: "); double base = sc.nextDouble();
    
        double area = base * height / 2;
        System.out.println("삼각형의 넓이는 " + area + "입니다.");
    }
}

import java.util.Scanner;
public class Flowchart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: "); double a = sc.nextDouble();
        System.out.print("b: "); double b = sc.nextDouble();
    
        if (a > b) {
            System.out.println("a가 더 큽니다.");
        } else if (a == b) {
            System.out.println("a와 b는 는 같다.");
        } else {
            System.out.println("b가 더 큽니다.");
        }
    }
}

public class Flowchart {
    public static void main(String[] args) {
        int a = 11;
        int b = 55;
        int w = 0;
        
        w = a;
        a = b;
        b = w;
        System.out.println(a);
        System.out.println(b);
    }
}

public class Flowchart {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
        sum += array[i];
        }
        System.out.println(sum);
    }
}


public class Flowchart {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        } System.out.println(max);
    }
}


public class Flowchart {
    public static void main(String[] args) {
        int[] array = {1,2,3,5,4};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 5) {
                System.out.println(i + "번째 요소가 일치합니다."); break;
            } else if (i == array.length - 1) {
                System.out.println("찾지 못했습니다.");
            }
        }
    }
}
*/

public class Flowchart {
    public static void main(String[] args) {
        int[] arr = {7,8,10,14,15,17};
        int h = arr.length - arr.length;
        int t = arr.length - 1;
        int c = (h + t) / 2;
        for (int i = h; i <= t; i++) {
            if (arr[i] == 17) {
                System.out.println(i + "번째입니다."); break;
            } else if (arr[i] < 17 && i == arr.length - 1) {
                System.out.println("찾지 못했습니다."); break;
            } else if (arr[i] < 17) {
                h = c + 1;
            }
        }
    }
}

/*
public class Flowchart {
    static int[] arr = {13,14,15,16,17,19};
    public int Flowchart(int key, int h, int t) {

        int c = arr.length / 2;
        while (h <= t) {
            if (key == arr[c]) {
                return c;
            } else if (key > arr[c]) {
                h = c + 1;
            } else {
                t = c -1;
            }
        } return - 1;
    }
    public static void main(String[] args) {
       int a = Flowchart(17, 0, arr.length - 1);
        if (a == -1) {
           System.out.println("찾지 못했습니다.");
       } else {
           System.out.println(a + "번째 요소와 일치");
       }
    } 
}
*/
