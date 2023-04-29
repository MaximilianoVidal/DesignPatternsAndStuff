package arrayList;

public class ArrayList {
    public ArrayList(int z) {
        elementData= new Object[z];
    }
    public Object get (int i){
        return elementData[i];
    }
    public void add (Object o){
        elementData[i]=o;
        i++;
    }
    private Object[] elementData;
    private int i=0;
}
