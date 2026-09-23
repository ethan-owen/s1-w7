public class WeightMain {
    public static void main(String[] args) {
        Weight w1 = new Weight(12, 9);
        Weight w2 = new Weight(7, 11);
        w1.print();
        System.out.println(w1.isHeavier(w2));
        Weight w3 = w1.multiple(2);
        System.out.println(w3.isHeavier(w2));
        w1.print();
        w3.print();
    }
}