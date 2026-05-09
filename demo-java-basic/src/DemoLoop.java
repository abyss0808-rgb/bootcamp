public class DemoLoop {
  public static void main(String[] args) {
    // for-loop
    int x = 3;
    for(int i = 0;i < 3; i++){// 0,1,2
      System.out.println("hello");
    }
    //Step 1 :i =0
    //Step 2 :i < 3 ?
    //Step 3 :yes,print hello
    //Step 4 :i++ (i = 1 )
    //Step 5 :i < 3 ?
    //Step 6 :yes,print hello
    //Step 7 :i++ (i = 2 )
    //Step 8 :i < 3 ?
    //Step 9 :yes,print hello
    //Step 10 :i++ (i = 3 )
    //Step 11 :i < 3?
    //Step 12 :No, exit loop

    int y = 3;//3^4
    for(int y= 0;y<3;y++){
      y = y*3;
    }
    System.out.println(y);//81

    //for +if -> 99%
    for(int i = 0;i < 10;i++){//i=0-9
      if (i % 2 == 1 ){
        System.out.println(i);
      }
    }

    //for loop -> print 'a' - 'z'
    for(int i =0; i <26;i++){
      //!risky
      //Accept my own risk(downcasting)
      char ch = (char)(97 + i);
      System.out.println(ch);
    }

    //String
    //print index,if char value is l or w or o 
    String s = "helloworld";
    for(int i = 0; i< s.length();i++){
      if(s.charAt(i)=='l'||s.charAt(i)== 'w'||s.charAt(i) == 'o'){
        System.out.println(i);
      }
    }

    //0- 99,print value divisible by 3 and 7
    for(int i = 0;i < 100;i++){
      if(i % 3 == 0 && i % 7 ==0){
        System.out.println(i);
      }
    }


    //Check if 'n' exists
    //if yes,print "Character n exists"
    //if no,print "Character n does not exists"
    String s2 = "JavaPythonHtml";
    boolean isFound = false;
    for(int i = 0;i < s2.length();i++){
      if(s2.charAt(i)=='n'){
        isFound = ture;
      }
    }
    if(isFound){
      System.out.println("Character n exists");
    }



    //!2.while loop
    //1.counter increment with criteria
    //2.another criteria to break

    //print 3 hello
    int count = 0;
    while(count < 3){
      System.out.println('hello');
      count++;
    }
    //Step 1 : count <3 ?
    //Step 2 : yes,print hello
    //Step 3 : count++
    //Step 4 : count <3 ?
    //Step 5 : yes,print hello
    //Step 6 : count++
    //Step 7 : count <3 ?
    //Step 8 : yes,print hello  
    //Step 9 : count+++(3)
    //Step 10 : no, exit loop

     //3. break
     //Exit earlier 
     String[]arr = new String[]{"Peter, "Sally","Steven"};
     //check if there is any Name length > 5
     for(int i = 0,i < arr.length;i++){
       if(arr [i].length() > 5) {
         isFound = ture;
         break;//!Exit Nearest LOOP
       }
     }
     if(isFound){
     System.out.println("Yes, there is name length > 5");
     }

     //4.continue (Skip the Rest)
     for(int i =0,i < arr.length;I++){
      if(i % 2) == 0){
         continus;// skip the rest,goes to i++
       }
      if(i > 100 ){
       continus;// skip the rest,goes to i++
      }
       //the rest of code(1000 lines....)
       System.out.println("hello");
     }

     //Assignment 
     //6 marksix (1-49) -> No duplicate number
     int[]marksixNumber = new int[6];
     //for loop? while loop?
     //while -> the criteria to exit/continue (dosen't know the times of loop)
     int counter =0;
     while(counter < 6){//0,1,2,3,4,5}
     //logic
     int number = new Random().nextInt(49)+1;//0-48 +1
     for(int i =0;i < counter ; i++){
     if(marksinNumber[i] == number){
           isDupLicated = ture ;
           break;
         }
     }
         if(isDuplicated){
         continue;
         }
         marksixNumber[counter] = number;
         counter++;
  }
         System.out.println(Arrays.toString(marksixNumber));
         
}
