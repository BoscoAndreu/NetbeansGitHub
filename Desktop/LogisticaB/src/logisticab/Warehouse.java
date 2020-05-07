/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logisticab;

/*
 * Desarrollada por Bosco a 4 feb. 2020
 */
public class Warehouse {

    public Container[] a = new Container[2];
    public Container[] b = new Container[4];
    public Container[] c = new Container[8];
    
    public Warehouse(){
         
        for (int i = 0; i < a.length; i++) {
            a[i] = new Container();
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = new Container();
        }
        for (int i = 0; i < c.length; i++) {
            c[i] = new Container();
        }
    }
    
    
    public boolean checkgetA() {
        boolean puedo = false;
        for (int i = 0; i < a.length; i++) {
            if (puedo == false) {
                if (!a[i].isAvailable()) {
                    puedo = true;
                    a[i].setAvailable(true);
                }
            }
        }

        return puedo;
    }

    public boolean checkgetB() {
        boolean puedo = false;
        for (int i = 0; i < b.length; i++) {
            if (puedo == false) {
                if (!b[i].isAvailable()) {
                    puedo = true;
                    b[i].setAvailable(true);

                }
            }
        }

        return puedo;
    }

    public boolean checkgetC() {
        boolean puedo = false;
            for (int i = 0; i < c.length; i++) {
                if (puedo == false) {
                if (!c[i].isAvailable()) {
                    puedo = true;
                    c[i].setAvailable(true);

                }
            }
        }

        return puedo;
    }

    public boolean checkdropA() {
        boolean puedo = false;
        for (int i = 0; i < a.length; i++) {
            if (puedo == false) {
                if (a[i].isAvailable()) {
                    puedo = true;
                    a[i].setAvailable(false);
                }
            }
        }
        return puedo;
    }

    public boolean checkdropB() {
        boolean puedo = false;
        for (int i = 0; i < b.length; i++) {
            if (puedo == false) {
                if (b[i].isAvailable()) {
                    puedo = true;
                    b[i].setAvailable(false);
                }
            }
        }
        return puedo;
    }

    public boolean checkdropC() {
        boolean puedo = false;
        for (int i = 0; i < c.length; i++) {
            if (puedo == false) {
                if (c[i].isAvailable()) {
                    puedo = true;
                    c[i].setAvailable(false);
                }
            }
        }
        return puedo;
    }
}
