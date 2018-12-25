package randomproblemsolving.basic;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by pourush.sinha on 23/12/18.
 */
public class PairOfSocks {

    static int sockMerchant(int n, int[] ar) {
        Map<Integer,Integer> map = Maps.newHashMap();
        int numberOfPairs =0;

        for(int socks :ar){
            if (map.containsKey(socks)){
                numberOfPairs +=1 ;
                map.remove(socks);
            }else{
                map.put(socks,1);
            }

        }

        return numberOfPairs;


    }

    public static void main(String[] args) {
        int[] arr = {10,20,20,10,10,30,50,10,20};
        System.out.println(sockMerchant(9,arr));

    }
}
