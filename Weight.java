public class Weight {
    private int pounds;
    private int ounces;

    public Weight (int ounces, int pounds) {
        if (ounces >=- 0) {
            if(ounces<16) {
                this.pounds = pounds;                    
                this.ounces = ounces;
            }
        }
    }

    public Weight(int ounces) {
        this(ounces, 0);
    }

    public int totalOunces(){
        return this.ounces + this.pounds * 16;
    }

    public boolean isHeavier(Weight other){
        int totalW = this.totalOunces();
        int otherW = other.totalOunces();
        if (totalW > otherW){
            return true;
        } 
        return false;
    }

    public Weight multiple(int k){
            int newWeight = this.totalOunces() * k;
            int p = newWeight/16;
            int o = newWeight % 16;
            return new Weight(o, p);
    }

    public void print(){
        System.out.println(this.pounds + " pounds, " + this.ounces + " ounces.");
    }
}