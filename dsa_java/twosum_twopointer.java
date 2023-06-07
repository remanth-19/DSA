package dsa_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class twosum_twopointer {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> array = new ArrayList<>();
    Integer n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      array.add(sc.nextInt());
    }
    Integer sumInteger = sc.nextInt();
    Collections.sort(array);
    sc.close();
    Integer firstPointer = 0;
    Integer lastPointer = n-1;
    while(firstPointer < lastPointer){
      if(array.get(firstPointer)+array.get(lastPointer) == sumInteger){
        System.out.println(array.get(firstPointer)+" "+array.get(lastPointer));
        break;
      }
      else if(array.get(firstPointer)+array.get(lastPointer) < sumInteger){
        firstPointer++;
      }
      else{
        lastPointer--;
      }
    }
  }
}
