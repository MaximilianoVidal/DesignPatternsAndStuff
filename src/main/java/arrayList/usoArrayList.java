package arrayList;

public class usoArrayList {
    public static void main(String[] args) {
        ArrayList files= new ArrayList(4);
        files.add("juan");
        files.add("maxi");
        files.add("la bebita");
        files.add("barby");

        String PersonName = (String) files.get(2);

    }
}
