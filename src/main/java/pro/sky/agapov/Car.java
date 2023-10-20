package pro.sky.agapov;

public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Car() {
        this("Машина", 4);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void serviceWork() {
        super.serviceWork();

        checkEngine();
    }
}

//public class Car {
//
//    public String modelName;
//    public int wheelsCount;
//
//    public void updateTyre() {
//        System.out.println("Меняем покрышку");
//    }
//
//    public void checkEngine() {
//        System.out.println("Проверяем двигатель");
//    }
//}
