package PackageOBeans;

/**
 * Punnett squares in Java, but now using a 3x3 array.
 */

public class BigBeans {

    public void punnett(BigParent mom, BigParent dad){
        String[][] twoD = new String[3][3];
        String[] momTraits = {mom.getTrait1(), mom.getTrait2(), mom.getTrait3()};
        String[] dadTraits = {dad.getTrait1(), dad.getTrait2(), dad.getTrait3()};
    
        for (int i = 0; i < 3; i++){ //Iterate over the 3 rows.
            for (int j = 0; j < 3; j++){ //And the 3 rows in i.
                twoD[i][j] = momTraits[i] + dadTraits[j];
            }
        }

        print2D(twoD);
    }

    public void print2D(String[][] arr) { //This method is a simplified version from print2D in Beans class.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { 
                System.out.print(arr[i][j] + " "); // Use print instead of println to print elements in the same line
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        BigBeans bigBeans = new BigBeans();
        BigParent mother = new BigParent("X", "X", "Z");
        BigParent father = new BigParent("X", "Y", "Z");

        bigBeans.punnett(mother, father);
    }
}
