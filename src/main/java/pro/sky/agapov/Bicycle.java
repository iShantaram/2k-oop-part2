package pro.sky.agapov;

public class Bicycle extends Transport {
//    public String modelName;
//    public int wheelsCount;
//
//    public void updateTyre() {
//        System.out.println("Меняем покрышку");
//    }

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Bicycle() {
        this("Велосипед", 2);
    }

    @Override
    public void serviceWork() {
        super.serviceWork();
    }
}
