package subfolder;

public class ChristmasEngine {
    Gift[] tabGift;
    String factoryName;

    public ChristmasEngine(String factoryName) {
        this.factoryName = factoryName;
        this.tabGift = new Gift[0];
    }
    public void showName(){
        System.out.println("Nazwa fabryki " + this.factoryName);
    }
    public int countGifts(){
        return this.tabGift.length;
    }

    public Gift[] intotab(String giftContent, int weight){

        Gift[] NewTabGift = new Gift[tabGift.length + 1];
        for (int i = 0; i < tabGift.length; i++) {
            NewTabGift[i] = tabGift[i];
        }
        NewTabGift[tabGift.length] = new Gift(giftContent, weight);

        return NewTabGift;
    } // funckja pomocnicza wstawiajaca do tablicy prezenty

    public void createGift(String giftContent, int weight) {
        this.tabGift = intotab(giftContent, weight);
    };

    public void createGift() {
        String[] gifttab2 = {"Car", "Doll", "Ball"};
        String randomGift = gifttab2[(int) (Math.random() * 3)];
        int randomWeight = (int) (Math.random() * 10) + 1; // Unika wagi 0

        this.tabGift = intotab(randomGift, randomWeight);
    }
    public void createGift(String giftContent) {
        this.tabGift = intotab(giftContent, 5);
    }

    public void createGift(String[] names, int[] weights) {
        for (int i = 0; i < names.length; i++) {
            this.tabGift = intotab(names[i], weights[i]);
        }
    }
    public double countAvarageWeights() {
        double totalWeight = 0;
        for (int i = 0; i < tabGift.length; i++) {
            totalWeight += tabGift[i].getWeight();
        }
        return totalWeight;
    }

    public void showAllGifts() {
            System.out.println("Prezenty w fabryce:");
            for (int i = 0; i < tabGift.length; i++) {
                System.out.println(tabGift[i]);
            }
    }

    public Gift[] getTabGift(){
        return this.tabGift;
    }
}
