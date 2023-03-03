/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_interface3;

/**
 *
 * @author User
 */
public class ujibank extends bank {
    public static void main(String[] args){
        bank obj = new bank();
        obj.menabung();
        obj.transfer();
        obj.menarik();
    }
}
