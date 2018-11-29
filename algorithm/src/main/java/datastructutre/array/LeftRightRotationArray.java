package datastructutre.array;

import com.google.common.base.Joiner;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 * Created by pourush.sinha on 27/07/18.
 */
public class LeftRightRotationArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nd = scanner.nextLine().split(" ");
        System.out.println("nd="+Arrays.toString(nd));

        int n = Integer.parseInt(nd[0]);
        System.out.println("n="+n);
        int d = Integer.parseInt(nd[1]);
        System.out.println("d="+d);
        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        System.out.println("before="+ Arrays.toString(a));
        a =leftRotate(a,n,d);
        String arr="";
        for (int i = 0; i < n; i++) {
            arr = arr +" "+a[i];
        }
        System.out.println("after="+arr);
        scanner.close();
    }

    private static int gcd(int a ,int b){
        if (b ==0 ){
            return a;
        }
        return gcd(b , a%b);
    }

    static int[] leftRotate(int[] arr ,int n ,int d){

        for (int i = 0 ; i < gcd(n,d) ; i++){
            int temp =  arr[i];
            int j = i ;
            while(true){
                int k = j + d;
                if(k >= n){
                    k= k-n;
                }

                if (k==i){
                    break;
                }
                arr[j] = arr[k];
                j = k;
            }
            arr[j] =temp;
        }
        return arr;

    }
}
