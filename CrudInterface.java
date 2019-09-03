/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory;

/**
 *
 * @author 2ndyrGroupC
 */
public interface CrudInterface {

    public void create(String obj);

    public void read();

    public boolean update(String oldObj, String newObj);

    public boolean delete(String obj);

}
