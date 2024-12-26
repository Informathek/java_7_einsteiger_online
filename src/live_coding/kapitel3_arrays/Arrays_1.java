package live_coding.kapitel3_arrays;

public class Arrays_1 {
    public static void main(String[] args) {
//        int x = 45;
//        int y = 5;
//        int yx = 534;
//        int ahmad = 6;

        int[] MohammadArr = new int[4];
        float[] joudiZekraArrFloat = new float[2];
        String[] joudiZekraArrString = new String[2];
        char[] joudiZekraArrChar = new char[2];


        MohammadArr[0] = 45;
        MohammadArr[1] = 5;
        MohammadArr[2] = 534;
        MohammadArr[3] = 6;
//        MohammadArr[4] = 3;

        System.out.println(MohammadArr[0]);
        System.out.println(MohammadArr[1]);
        System.out.println(MohammadArr[2]);
        System.out.println(MohammadArr[3]);

        joudiZekraArrChar[0] = 'J';
        joudiZekraArrChar[1] = 'Z';

        joudiZekraArrString[0] = "Joudi";
        joudiZekraArrString[1] = "Zekra";

        joudiZekraArrFloat[0] = 0.2f;
        joudiZekraArrFloat[1] = 3.4f;



        System.out.println(joudiZekraArrChar[0]); //
        System.out.println(joudiZekraArrChar[1]); //

        System.out.println(joudiZekraArrString[0]); // null
        System.out.println(joudiZekraArrString[1]); // null

        System.out.println(joudiZekraArrFloat[0]); // 0.0
        System.out.println(joudiZekraArrFloat[1]); // 0.0





    }
}
