public class EAccessObj {
    public int p = 3;
    protected int p2 = 4;
    //protected 같은 패키지에서만 접근 허용. 단 상속받은 경우는 예외
    //package가 다르면 public만 가능하며, 다른 건 불러오기 안 됨

    int k = 2; //default, 같은 패키지 내에서만 접근 허용
    private int i = 1; //private는 자기 자신만 쓸 수 있음

    //public > protected > delfault > private
}
