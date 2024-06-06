package PackageOBeans;

/**
 * BigParent object for BigBean class.
 */

 public class BigParent {
    private String trait1;
    private String trait2;
    private String trait3;

    public BigParent(String one1, String two2, String three3){
        this.trait1 = one1;
        this.trait2 = two2;
        this.trait3 = three3;
    }

    public String getTrait1(){
        return trait1;
    }

    public String getTrait2(){
        return trait2;
    }

    public String getTrait3(){
        return trait3;
    }

 }
