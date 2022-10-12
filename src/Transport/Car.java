package Transport;

public class Car {
    private final String brand;//марка
    private final String model;//модель
    private float engineVolume;//объем двигателя

    public Car(String brand, String model, float engineVolume) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        setEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume > 0f) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5f;
        }
    }

    //Метод начать движение
    public void start(){
        System.out.println("Автомобиль: "+brand+" "+model+" начал движение");
    }

    //Метод закончить движение
    public void stop(){
        System.out.println("Автомобиль: "+brand+" "+model+" закончил движение");
    }

    @Override
    public String toString(){
        return "Марка: "+brand+", Модель: "+model+", Объем двигателя: "+engineVolume+" литров";
    }

    public boolean passDiagnostics(){
        return true;
    }
}
