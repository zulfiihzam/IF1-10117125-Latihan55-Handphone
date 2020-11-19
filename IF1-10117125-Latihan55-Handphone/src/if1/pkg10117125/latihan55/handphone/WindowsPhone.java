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
public class WindowsPhone extends Handphone{
    private String wpKeyStore;

    public String getWpKeyStore() {
        return wpKeyStore;
    }

    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }

    public WindowsPhone(String man, String os, String model, int harga) {
        super(man, os, model, harga);
       
    }
    
}
