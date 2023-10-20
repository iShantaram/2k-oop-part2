package pro.sky.agapov;

public class Transport {
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        setModelName(modelName);
        setWheelsCount(wheelsCount);
    }

    public Transport() {
        this("Транспорт", 4);
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void serviceWork() {
        System.out.println("Обслуживаем " + getModelName());

        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }

    protected void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
