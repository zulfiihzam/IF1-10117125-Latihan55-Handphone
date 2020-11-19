/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan55.handphone;

/**
 *
 * @author Zulfi
 */
public class Handphone {
    protected String manufacture,operatingSystem,model;
    protected int harga;

    public Handphone(String manufacture, String operatingSystem, String model, int harga) {
        this.manufacture = manufacture;
        this.operatingSystem = operatingSystem;
        this.model = model;
        this.harga = harga;
    }

    public void displayProduct(){
      Android andro = new Android("Samsung","Android","Grand",3000000);
        System.out.println("Manufaktur : "+andro.manufacture);
        System.out.println("Os : "+andro.operatingSystem);
        System.out.println("Model : "+andro.model);
        System.out.println("Harga : "+andro.harga);
        andro.setKeyStore("234ibfd3840fo");
        System.out.println("Android Key Store : "+andro.getKeyStore());
        
        System.out.println("");
        
        BlackBerry bB = new BlackBerry("blackB","RIM","Cruve",2000000);
        System.out.println("Manufaktur : "+bB.manufacture);
        System.out.println("Os : "+bB.operatingSystem);
        System.out.println("Model : "+bB.model);
        System.out.println("Harga : "+bB.harga);
        bB.setPinBB("BHS249");
        System.out.println("Android Key Store : "+bB.getPinBB());
        
        System.out.println("");
        
        WindowsPhone wp = new WindowsPhone("Nokia","Win8","Lumia",1000000);
        System.out.println("Manufaktur : "+wp.manufacture);
        System.out.println("Os : "+wp.operatingSystem);
        System.out.println("Model : "+wp.model);
        System.out.println("Harga : "+wp.harga);
        wp.setWpKeyStore("UUUQIJWORJ");
        System.out.println("Android Key Store : "+wp.getWpKeyStore());  
    }
}
