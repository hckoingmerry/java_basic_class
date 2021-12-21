/*배열(array): 같은 타입의 여러 변수들을 하나의 묶음을 다루는 방식
- 배열은 생성시 정한 개수를 수정할 수 없음
- 기본적으로 배열은 0으로 초기화되어 생성된다.
*/

/*예시
public class CArray {
    public static void main(String[] args) {
        int[] score = new int[5];
        score[0] = 10;
        score[1] = 20;
        score[2] = 30;
        score[3] = 40;
        score[4] = 50;
        for (int i = 0; i < 5; i++) {
            System.out.println(score[i]);
        }
    }
}

예시
public class CArray {
    public static void main(String[] args) {
        int[] score = new int[5];
        score[0] = 10;
        score[1] = 20;
        score[2] = 30;
        score[3] = 40;
        score[4] = 50;
        for (int i = 0; i < 5; i++) {
            System.out.println(score[i]);
        }

        int[] math = new int[5];
        for (int j = 0; j < math.length; j++) {
            math[j] = j * 10 + 50;
            System.out.println(math[j]);
        }
    }
}
*/

/* 배열의 길이를 수정하는 방법:
1. 더 큰 배열을 새로 생성한다.
2. 기존 배열의 데이터들을 새로 생성한 배열에 복사한다.

예시
public class CArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        } System.out.println("배열 수정 전");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]: " + arr[i]);
        }
        System.out.println("배열 수정 후");
        int[] tmp = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        } for (int i = 0; i < arr.length; i++) {
            System.out.println("tmp[" + i + "]: " + tmp[i]);
        }
        arr = tmp;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]: " + arr[i]);
        }
    }
}
*/

/*
public class CArray {
    public static void main(String[] args) {
        char[] abc = {'A', 'B', 'C', 'D', 'E'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);;
        System.out.println(result);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);
        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);
        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num);
    }    
}
*/

/*Quiz.학생 5명의 총점의 합계와 평균을 구하시오. 100,88,98,90,96
public class CArray {
    public static void main(String[] args) {
        int[] scores = {100,88,98,90,96};
        int sum = 0;
        double avg = 0;
        for (int item: scores) {
            sum+=item;
        }
        avg = sum / (double)scores.length;
        System.out.println("총합은: " + sum);
        System.out.println("평균 : " + avg);
    }    
}

Quiz. 아래 학생 점수의 최솟값과 최댓값을 구하시오. 78,88,98,90,96,67,65,87
public class CArray {
    public static void main(String[] args) {
        int[] scores = {78,88,98,90,96,67,65,87};
        int min = scores[0];
        int max = scores[0];
        for (int item:scores) {
            if (max < item) {
                max = item;
            } else if (min > item) {
                min = item;
            }
        } System.out.printf("최대값: %d\n최소값: %d", max, min);
    }    
}

Quiz. 아래 배열을 거꾸로 뒤집으시오. 78,88,98,90,96,67,65,87
public class CArray {
    public static void main(String[] args) {
        int[] scores = {78,88,98,90,96,67,65,87};
        int[] temp = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            temp[i] = scores[scores.length-1-i];
        }
        scores = temp;
        for (int item: scores) {
            System.out.print(item + " ");
        }
    }
}


Quiz. 배열 중에 각 수의 개수를 각각 구하시오. {4,4,4,6,5,7,9,7,5,3}
ex) 0 몇개, 1 몇개, 2 몇개, 3몇개 등등
public class CArray {
    public static void main(String[] args) {
        int[] numArr = {4,4,4,6,5,7,9,ㄺ7,5,3};
        int[] counter = new int[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            counter[numArr[i]]++;
        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(i + "의 개수: " + counter[i]);
            }
        }

    }
}


Quiz. 
public class CArray {
    public static void main(String[] args) {
        String[] name = new String[3]; //길이가 3인 String, 배열 생성
        name[0] = "Kim";
        name[1] = "Song";;
        name[2] = "Park";
    
        String[] name2 = {"Kim", "Song", "Park"};
        String[] name3 = new String[] {"Kim, Song, Park"};
        for (String each: name) {
                System.out.print(each + " ");
        }

        //char배열과 String 변환
        // char[] chArr = {'A','B','C'};
        // String str = new String(chArr); //char배열을 스트링으로
        // char[] tmp = str.toCharArray(); //스트링을 char배열로

        //src라는 String에 "ABCDE"를 만들어 chArr이라는 char[]로 변환하여 출력
        String src = "ABCDE";
        //char[] tmp = src.toCharArray(); //이건 자동화작업. 만약 수동으로 한다면 아래와 for 이용
        //System.out.println(tmp);
        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            System.out.println("src.charAt(" + i + "): " + ch);
        }
    }
}
*/