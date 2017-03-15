/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classpackage;

/**
 *
 * @author Diego
 */
public class Info {
    private String name, information;

    public Info() {
    }

    public Info(String name, String information) {
        this.name = name;
        this.information = information;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getName() {
        return name;
    }

    public String getInformation() {
        return information;
    }
    
    
}
