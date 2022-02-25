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
public abstract class Animal {

    private int numLegs;
    private String name;

    public abstract String getData();

    public void printInfo() {
        System.out.println("printing from class --> " + Animal.class
                + " <--\n The animal named " + name
                + ", has Number of Legs of --> " + numLegs);
    }

    public Animal(int numLegs, String name) {
        this.numLegs = numLegs;
        this.name = name;
    }

    public Animal() {
        this.numLegs = 0;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("run fast");
    }

    public void run(int speed) {
        System.out.println("run at speed " + speed);
    }

    public void run(float speed) {
        System.out.println("run at speed " + speed);
    }
    
    public void run(String park){
        System.out.println("running at " + park + " park");
    }
    
    public void run(String park, float speed){
        System.out.println("running at " +park + " park, at " + speed + " miles/hour");
    }

}
