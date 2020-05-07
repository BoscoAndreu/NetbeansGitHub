/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logisticab;

/*
 * Desarrollada por Bosco a 4 feb. 2020
 */
public class Container {

    private boolean available;

    public Container() {
        available = false;
    }

    public Container(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
