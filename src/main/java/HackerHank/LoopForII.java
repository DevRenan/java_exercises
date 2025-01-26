package HackerHank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LoopForII {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        String[] resultados = new String[q];
        for (int i = 0; i < q; i++){
            resultados[i] = "";
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 1; j <= n; j++) {
                int result = 0;
                for(int x = 0; x < j; x++){
                    result += (int) (Math.pow(2,x)*b);
                }

                resultados[i] += a+result + " ";
            }
        }
        in.close();

        for (int i = 0; i < q; i++){
            System.out.println(resultados[i]);
        }
    }

//    public static void main(String []argh){
//        Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        for(int i=0;i<t;i++){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//
//            int ans = a+b;
//            for(int j=1;j<=n;j++){
//                System.out.print(ans+" ");
//                ans=(int)(ans+Math.pow(2, j)*b);
//            }
//            System.out.println();
//        }
//        in.close();
//    }
}
