package com.protect;

public class Cats extends Pets {

    private String catName;
    private int catAge;

    Cats( String name, int age){
        catName = name;
        catAge = age;
    }

    public void WriteInfo(){
      String infoAboutCat =  super.petString(catName, catAge);
      System.out.println(infoAboutCat);
    }



}
