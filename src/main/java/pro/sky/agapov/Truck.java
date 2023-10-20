package pro.sky.agapov;

public class Truck extends Car {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Truck() {
        this("Грузовик", 6);
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void serviceWork() {
        super.serviceWork();
        checkTrailer();
    }
}


//public class Truck {
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
//
//    public void checkTrailer() {
//        System.out.println("Проверяем прицеп");
//    }
//}