public class DemoMath {
  public static void main(String[] args) {
    //pow()
    System.out.println(Math.pow(2.0,4));//16

    //PI
    System.out.println(Math.PI);

    //sqrt()
    System.out.println(Math.sqrt(9.0));//3
    System.out.println(Math.sqrt(9.2));//3.03315017762062

    //min()
    int[] arr= new int[]{10,5,-3,100,90};
    int min = arr[0];
    for(int i =0 ;i<arr.length;i++){
      min = Math.min(min,arr[i]);
    }
    System.out.println(min);

    //max()
    int max = arr[0];
    for(int i =0 ;i<arr.length;i++){
      max=Math.max(max,arr[i]);
    }
    System.out.println(max);

    //abs()

    //ceil()floor()
    System.out.println(Math.floor(2.98));//2.0

    //sin,cos,tan,log

    //random(0.0 - < 1)
    double randomNumber = Math.random();//0.0-1.0
    System.out.println(randomNumber);

    //Random 1-49
    double result = Math.floor(Math.random()*49)+1;//1-49
    System.out.println(result);

    //round (nearest  integer,1dp 4捨5入)
    System.out.println(Math.round(2.23));//2
    System.out.println(Math.round(2.50));//3
    System.out.println(Math.round(2.49));//2
    System.out.println(Math.round(2.98));//3

  }
}
