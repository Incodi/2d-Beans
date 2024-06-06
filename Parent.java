package PackageOBeans;
/**
 * Parent object for Bean class.
 */

public class Parent {
    private String trait1;
    private String trait2;

    public Parent(String one1, String two2){
        this.trait1 = one1;
        this.trait2 = two2;
    }
    
    public String getTrait1(){
        return trait1;
    }

    public String getTrait2(){
        return trait2;
    }

}
