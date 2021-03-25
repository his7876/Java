package com.company.chapter14;

//14-1 상속과 생성자의 호출
public class Car {
   int gasolineGauge;

    public Car(int gasolineGauge) {
        this.gasolineGauge = gasolineGauge;
    }
}

class HybrideCar extends Car{
    int electricGauge;

    public HybrideCar(int gasolineGauge, int electricGauge) {
        super(gasolineGauge);
        this.electricGauge = electricGauge;
    }
}

class HybridWaterCar extends HybrideCar{
    int waterGauge;

    public HybridWaterCar(int gasolineGauge, int electricGauge, int waterGauge) {
        super(gasolineGauge, electricGauge);
        this.waterGauge = waterGauge;
    }

    public void showCurrentGauge(){
        System.out.println("잔여 가솔린 :"+ gasolineGauge);
        System.out.println("잔여 전기량 :"+electricGauge);
        System.out.println("잔여 워터량 :"+waterGauge);
    }
}

class Test{
    public static void main(String[] args) {
        HybridWaterCar hybridWaterCar1= new HybridWaterCar(2,4,9);
        hybridWaterCar1.showCurrentGauge();

        HybridWaterCar hybridWaterCar2 = new HybridWaterCar(7,8,3);
        hybridWaterCar2.showCurrentGauge();
    }
}