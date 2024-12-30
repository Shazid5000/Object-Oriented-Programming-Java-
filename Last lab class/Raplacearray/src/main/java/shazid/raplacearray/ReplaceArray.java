package shazid.raplacearray;
public class ReplaceArray {
    public static void main(String[] args) {
        String[] names = {"Neha", "Mim", "Esha"};
        names[2] = "Miss";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
