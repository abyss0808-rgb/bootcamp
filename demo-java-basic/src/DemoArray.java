import java.util.Arrays;

public class DemoArray {
  public static void main(String[]args){
    int x = 3;
    int rate = 4;


    int[]arr = new int[3];//
    arr[0] = 100_000;
    arr[1] = -2;
    arr[2] = 999;
    //arr[3] = 999;

    //!print array
    System.out.println(Arrays.toString(arr));//[100000,-2,999]

    //reassign 100 into the second box
    arr[1] = 100;
    System.out.println(Arrays.toString(arr));//[100000,100,999]

    //String[] ->"Peter","Steve","Jenny"
    String[]arr2 = new String[3];
    arr2[0] = "Peter";
    arr2[1] = "Steve";
    arr2[2] = "Jenny";
    System.out.println(Arrays.toString(arr2)); // [Peter,Steve,Jenny]

    //for loop
    for(int i=0;i <arr2.length;i++){
      System.out.println(arr2[i]);
    }


    double[] prices = new double[4];
    prices[0]=99.9;
    prices[1]=10.0;
    prices[2]= 5.4;
    prices[3]= 20.5;

    int[]quantities = new int[4];
    quantities[0]=3;
    quantities[1]=10;
    quantities[2]=5;
    quantities[3]=4;

    //double[] amounts
    double[]amounts = new double[4];
    for(int i=0;i < amounts.length;i++){
      amounts[i] = prices[i] * quantities[i];
    }

    //double totalAmount
    double totalAmount = 0.0;
    for(int i=0;i < amounts.length;i++){
      totalAmount += prices[i] * quantities[i];
    }
    System.out.println(totalAmount);

    char[]chs = new char[]{'b','c','q'};
    //String + anything -> String
    String result = "";
    for(int i =0 ;i < chs.length;i++) {
      result +=chs[i];
    }
    System.out.println(result);//"bcq"


    // max
    int[] arr3 = new int[] {10,100,4,200,-3};
    int max = arr3[0];
    for(int i = 0;i < arr3.length;i++){
      if(arr3[i]>max){
        max = arr3 [i];
      }
    }
    System.out.println(max);//200


    //min
    int min = arr3[0];
    for(int i = 0;i <arr3.length;i++){
      if(arr3[i]<min){
        min = arr3 [i];
      }
    }
    System.out.println(min);//-3

    String[] arr4 = new String[]{"John","Peter","Jenny","Tommy"};
    //Count the name start with J
    int count =0;
    for(int i = 0;i < arr4.length;i++){
      if(arr4[i].charAt(0) == 'J') {
        count++;
      }
    }
    System.out.println(count);


    //The total length of all names.
    int lengthSum = 0;
    for(int i= 0;i < arr4.length;i++){
      lengthSum += arr4[i].length();
    }
    System.out.println(lengthSum);

    //Searching
    //which name contains more than one 'e'

    for(int i =0;i <arr4.length;i++){
      if(arr4[i].indexOf('e') != arr4[i].lastIndexOf('e')){
        System.out.println(arr4[i]);
      }
    }

    for(int i = 0; i <arr4.length;i++){//loop every word in an array}
      boolean isTarget = false;
      int countChar = 0;
      for(int j = 0;j < arr4[i].length();j++){//loop every char in a word 

      }
    }





  }
}
