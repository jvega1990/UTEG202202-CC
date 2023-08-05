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
public abstract class Mammal extends Animal {

    private int furThikness;

    public void printInfo() {
        super.printInfo();
        System.out.println("printing from class --> " + Mammal.class + " <--");
        System.out.println(" furThikness is --> " + furThikness);
    }

    public void stayWarm() {
        System.out.println("this Mammal is staying warm ");
    }

    public Mammal(int furThinkness, int numLegs, String name) {
        super(numLegs, name);
        this.furThikness = furThinkness;
    }

    public Mammal() {
        super();
        this.furThikness = 0;
    }

    public Mammal(int furThinkness) {
        this.furThikness = furThinkness;
    }

    /**
     * @return the furThikness
     */
    public int getFurThinkness() {
        return furThikness;
    }

    /**
     * @param furThinkness the furThikness to set
     */
    public void setFurThinkness(int furThinkness) {
        this.furThikness = furThinkness;
    }

    @Override
    public abstract String getData();
    
//    @Override
//    public String getData() {
//        return "name : " + getName() + ", num of legs: " + getNumLegs();
//    }

}
