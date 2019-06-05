package randomproblemsolving.medium;

/**
 * Created by pourush.sinha on 22/05/19.
 */
/*
* Given n items of different weights and bins each of capacity c, assign each item to a bin such that number of total used bins is minimized. It may be assumed that all items have weights smaller than bin capacity.
Example:

Input:  wieght[]       = {4, 8, 1, 4, 2, 1}
        Bin Capacity c = 10
Output: 2
We need minimum 2 bins to accommodate all items
First bin contains {4, 4, 2} and second bin {8, 2}

Input:  wieght[]       = {9, 8, 2, 2, 5, 4}
        Bin Capacity c = 10
Output: 4
We need minimum 4 bins to accommodate all items.

Input:  wieght[]       = {2, 5, 4, 7, 1, 3, 8};
        Bin Capacity c = 10
Output: 3

*/
public class BinPackingProblem {


    static int noOfBinsRequired(int[] arr ,int c){

        int numberOfBinRequired=0;
        int remaningBinCapicity = c;

        for(int i=0; i<arr.length; i++){
            if(arr[i] >= remaningBinCapicity){
                numberOfBinRequired++;
                remaningBinCapicity = c - (arr[i] - remaningBinCapicity);
            }else{
                remaningBinCapicity -= arr[i];
            }
        }
        return numberOfBinRequired;

    }

    public static void main(String[] args) {
        int[] arr ={4, 8, 1, 4, 2, 1};
        System.out.println("No of beans required ="+noOfBinsRequired(arr ,10));
    }
}
