package subfolder;

public class Child {
    String imie;
    Boolean fun;
    ChristmasEngine engine;
    Gift reciveGift;
    public Child(String imie, Boolean fun, ChristmasEngine engine) {
        this.imie = imie;
        this.fun = fun;
        this.engine = engine;
    }
    public void opengift(){
        Gift[] newtab = engine.getTabGift();
        System.out.println("Prezent otrzymany dla " + imie + newtab[newtab.length-1]);

        this.reciveGift = newtab[newtab.length-1];
    }

    public void changeAttitiude(){
        this.fun=!this.fun;
    }
}
