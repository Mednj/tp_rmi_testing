/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;


/**
 *
 * @author Mohamed
 */


public class Salle implements Serializable{
    
    private int id;
    private String code;
    private List<Machine> machines;
    
     public Salle(){};

    public Salle(String code) {
        this.code = code;
    }

    

    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }

    public List<Machine> getMachines() {
        return machines;
    }
    

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    
    
}
