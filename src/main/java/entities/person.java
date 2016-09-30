/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

public class person {
    private final String fname;
    private final String lname;
    private final String street;
    private final String city;
    
    public person(String f, String l, String s, String c) {
        fname = f;
        lname = l;
        street = s;
        city = c;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }
}
