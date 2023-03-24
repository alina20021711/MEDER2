public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(array((new int[]{1, 2, 3, 4, 5}), 5));
        System.out.println(soz("b"));
        System.out.println(soz1("m"));
        System.out.println(aBoolean(4));
    }

    static int array(int[] a, int b) {
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                index = i;
            }
        }
        return index;
    }

    static int soz(String soz) {
        int counter = 0;
        String []sozdor = {"a","b","s"};
        for (int i = 0; i <sozdor.length; i++) {
            if (sozdor[i] == soz) {
                counter ++;
            }


        }
        return counter;
    }
    static String soz1(String soz){
        String[] soxdor={"v","h","i","m"};
        for (int i = 0; i < soxdor.length; i++) {
            if (soxdor[i] == soz) {
                return soxdor[i]+ " bar";
            } else {
            }
        }
        return soz+" jok";
    }
    static boolean aBoolean(int a){
        if(a%2==0){
            return true;
        }else {
            return false;
        }

    }

}







