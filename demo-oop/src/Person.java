//height,weight ->bmi

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {//!Class -> Blueprint(藍圖)
//!1. Attributes
private String name;
private int age;
//private double bmi;//Wrong design,Should be calcutlated by height and weight
private double height;
private double weight;

//!2.Construstor (Step to create object)
//Input(String + int)
public Person(String name,int age){
  //!第一人稱
  this.name = name;
  this.age = age;
}
public Person(String name,int age,double height,double weight){
  //!第一人稱
  this.name = name;
  this.age = age;
  this.height = height;
  this.weight = weight;
}

public double bmi(){
  //weight/height^2
  BigDecimal.valueOf(this.height).multiply(BigDecimal.valueOf(this.weight));
  return BigDecimal.valueOf(this.weight)
      .doubleValue(heightSquare,2,RoundingMode.HALF_UP).doubleValue();
}


//!3.Getter 
public String getName(){
  //!第一人稱視野
  return this.name;
}

public int getAge(){
  //!第一人稱視野
  return this.age;
}

public void setName(String name){
  this.name = name;
}

public void setAge(int age){
  //!第一人稱視野
  this.age = age;
}

public String weightCat(){
  if(this.bmi() > 40){
    return"Severe Obesity";
  }else if (this.bmi()>= 30.0){
    return"Obesity";
  }else if (this.bmi()>= 25.0){
    return"Overweight";
  }else if (this.bmi()>= 18.5){
    return"Healthy Weight";
  }else{
    return "Under Weight";
  }
}

//! 第三人稱視野
public static void main(String[]args){
  //Hraddisk -> store Person.java file
  //Commond to Create Person Object (memory)

  //object -> Life
  Person p1 = new Person("John",10);//!calling constructor to create object
  Person p2 = new Person("Peter",7); 
  
  //p1 -> name age 
  System.out.println(p1.getName());//John
  System.out.println(p1.getAge());//10

  p1.setName("Jenny");
  System.out.println(p1.getName());//Jenny
  System.out.println(p1.getAge());//7

  //p3()
  Person p3 = new Person("Jenny",45,1.76,66);
  System.out.println(p3.bmi());

   }

   

   
}
