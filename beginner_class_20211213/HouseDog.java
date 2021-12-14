public class HouseDog extends Dog {
    public void sleep() {
        System.out.println(this.name+" zzz in house");
    }

    //생성자 형성
    public HouseDog(String name) {
        this.setName(name);
    }

    public HouseDog(int type) {
        if (type == 1) {
            this.setName("york");
        } else if (type == 2) {
            this.setName("shire");
        }
    }

    public void sleep(int hour) {
        System.out.println(this.name+" zzz in house for "+ hour + " hours");
    }
    public static void main(String[] args) {
        HouseDog houseDog1 = new HouseDog("happy");
        System.out.println(houseDog1.name);

        HouseDog houseDog2 = new HouseDog(1);
        System.out.println(houseDog2.name);
        // houseDog.setName("happy");
        // houseDog.sleep();
        // houseDog.sleep(3);
    }
}
