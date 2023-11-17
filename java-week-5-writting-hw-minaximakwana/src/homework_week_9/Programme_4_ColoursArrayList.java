package homework_week_9;

import java.util.ArrayList;

public class Programme_4_ColoursArrayList {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("RED");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Yellow");
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Orange");
        colorList.add("Purple");
        colorList.add("Cyan");

        for (String colourList : colorList){
            System.out.println(colourList + " , ");
        }
        }
    }

