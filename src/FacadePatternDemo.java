/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 10116251-Rasyid
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        MatpelMaker matpelMaker = new MatpelMaker();
        
        matpelMaker.siswaIPA("Helmi");
        System.out.println("===============================================");
        matpelMaker.siswaIPS("Udin");
    }
}
