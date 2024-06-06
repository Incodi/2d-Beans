package PackageOBeans;

import java.util.Random;

/**
 * Punnett squares in Java.
 */

public class Beans {

    public String[][] punnett(Parent mom, Parent dad){
        String[][] twoD = new String[2][2];
        twoD[0][0] = mom.getTrait1() + dad.getTrait1();
        twoD[0][1] = mom.getTrait1() + dad.getTrait2();
        twoD[1][0] = mom.getTrait2() + dad.getTrait1();
        twoD[1][1] = mom.getTrait2() + dad.getTrait2();
        print2D(twoD);
        return twoD;
    }

    public void print2D(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { 
                System.out.print(arr[i][j] + " "); // Use print instead of println to print elements in the same line
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }

    public void determineSex(String box){
        if (box.equals("XY") || box.equals("XX")){
            if (box.equals("XX")){
                System.out.println("It's a girl!");
            } else {
                System.out.println("It's a boy!");
            }
        } else { //incorrect format
            System.out.println("Not a valid String");
        }
    }

    public static void main(String[] args) {
        Beans beans = new Beans();
        Parent mother = new Parent("X", "X");
        Parent father = new Parent("X", "Y");

        String [][] possible= beans.punnett(mother, father);

        //Random Numbers
        Random random = new Random();
        int point1 = random.nextInt(2); 
        int point2 = random.nextInt(2); 

        beans.determineSex(possible[point1][point2]);
        
    }
}
