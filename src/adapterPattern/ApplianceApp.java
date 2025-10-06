package adapterPattern;

public class ApplianceApp {
    public static void main(String[] args){

        Laptop laptop = new Laptop();
        PowerOutlet lPo = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet rPo = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet scPo = new SmartphoneAdapter(smartphoneCharger);

        //turn on the appliances
        System.out.println(lPo.plugIn());
        System.out.println(rPo.plugIn());
        System.out.println(scPo.plugIn());
    }
}
