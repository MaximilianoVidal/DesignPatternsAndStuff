package BuilderPatronDesign;

public abstract class pizzaBuilder {
    protected  Pizza pizza;
    public Pizza getPizza(){
        return  pizza;
    }
    public void createNewPizza(){
        pizza= new Pizza();
    }
    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildRelleno();
}
