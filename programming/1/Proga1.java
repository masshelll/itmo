import java.util.Random;
import java.lang.Math;
public class Proga1 {

     int g = 4; 
    public static void main(String[] args) {
       System.out.println(g);
        var w1 = array1();
        var x2 = array2();
        var s3 = array3(w1, x2);
        print_array3(s3);
    }
    public static int[] array1() {
        int[] w = new int[20];
	long a = 1110;
	int b = 1110;
	a = b;
        for (int i = 1; i < w.length; i++) {
            w[i] = i;
        }
	// System.out.println(a);
        return w;
    }



    public static float[] array2() {
        float[] x = new float[13];
        Random random = new Random();
        float max = 12.0f;
        float min = -8.0f;
        for (int j = 0; j < x.length; j++) {
            x[j] = random.nextFloat(min, max + 1e-9f);
            if (x[j] > max) {
                x[j] = max;
            }
        }
        return x;
    }

    public static double[][] array3(int[] w, float[] x) {
        double[][] s = new double[19][13];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 13; j++) {
		System.out.println(s[i][j]);
                switch (w[i]) {
                    case 15: s[i][j] = Math.cos(Math.pow(2/3 * (Math.pow(10, 2 * 10) + 2), 2));
                    case 2, 6, 7, 9, 10, 11, 12, 14, 17: s[i][j] = Math.cbrt(Math.cbrt(Math.pow(10, 10)));
                    default: s[i][j] = Math.sin(Math.pow(Math.cos(Math.sin(10)),
                            (2/3) / Math.asin(Math.sin(10))));	
                }
		if (w[i] == 15) {
			System.out.println(s[i][j]);
		};
            }
        }
        return s;
    }

    public static void print_array3(double[][] s) {
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 13; j++) {
                while (i != 5) {
                    System.out.println(s[i][j]);
                }
                System.out.printf("%.2f ", s[i][j]);
            }
	System.out.println("\n");
        }	
    }


}
