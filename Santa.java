package subfolder;

public class Santa {
    Gift[] tabGift;
    Reindeer[] tabReindeer;
    ChristmasEngine christmasEngine;

    public Santa(ChristmasEngine christmasEngine, Reindeer[] tabReindeer) {
        this.tabGift = new Gift[0];
        this.tabReindeer = tabReindeer;
        this.christmasEngine = christmasEngine;
    }

    public ChristmasEngine getChristmasEngine() {
        return christmasEngine;
    }

    public void addGiftFromFactory(){
        Gift[] factoryGifts = christmasEngine.tabGift;

        Gift[] newgifts = new Gift[factoryGifts.length];

        for (int i = 0; i < factoryGifts.length; i++) {
            newgifts[i] = factoryGifts[i];
        }
        tabGift = newgifts;
    }

    public Gift dropGift(){
        Gift oldgift = this.tabGift[0];

        Gift[] newgift = new Gift[this.tabGift.length - 1];

        for(int i = 1; i < newgift.length; i++){
            newgift[i - 1] = this.tabGift[i];
        }

        this.tabGift = newgift;

        return oldgift;
    }

    public int CountSantaGift(){
        return this.tabGift.length;
    }

    public void fly(){

        if(this.tabReindeer.length < 9){
            System.out.println("I'm afraid I can't do that.");
            return;
        }

        for (Reindeer renifery : this.tabReindeer) {
            if (!renifery.isHealth()) {
                System.out.println("I'm afraid I can't do that. " + renifery.getName() + " Renifer jest chory");
                return;
            }
        }

        System.out.println("Let's go");
    }

    public void giveGift(Child child){
    if(!child.fun){
        System.out.println("Sorry you are naughty");
        return;
    }
    child.opengift();
    dropGift();
    }


}
