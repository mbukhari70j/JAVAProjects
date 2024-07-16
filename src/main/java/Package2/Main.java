package Package2;
import Package1.*;

import java.util.ArrayList;

public class Main{
public static void main(String[] args) {
    LearnGeneric<String> stringLearnGeneric = new LearnGeneric<>();
    stringLearnGeneric.setContent("Welcome to String");
    System.out.println(stringLearnGeneric.getContent());
    LearnGeneric<Integer> intLearnGeneric = new LearnGeneric<>();
    intLearnGeneric.setContent(12);
    System.out.println(intLearnGeneric.getContent());
    }

}