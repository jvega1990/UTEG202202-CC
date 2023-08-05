/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.zoo.model;

/**
 *
 * @author elascano
 */
public abstract class Feline extends Mammal{
    private boolean scary;
    
    public Feline(boolean isScary, int furThinkness, int numLegs, String name) {
        super(furThinkness, numLegs, name);
        this.scary = isScary;
    }

    public Feline(boolean isScary) {
        this.scary = isScary;
    }

    public Feline() {

    }
    
    public Feline(boolean isScary, int furThinkness) {
        super(furThinkness);
        this.scary = isScary;
    }

    /**
     * @return the scary
     */
    public boolean isIsScary() {
        return scary;
    }

    /**
     * @param isScary the scary to set
     */
    public void setIsScary(boolean isScary) {
        this.scary = isScary;
    }
    
}