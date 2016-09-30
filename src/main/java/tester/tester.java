/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import entities.dataGenerator;

public class tester {
    public static void main(String[] args) {
        dataGenerator dg = new dataGenerator();
        dg.generateData();
        
        String tmp = dg.getData(3, "fname,lname");
        
        System.out.println(tmp);
    }
}
