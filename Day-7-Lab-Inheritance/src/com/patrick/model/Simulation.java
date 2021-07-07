package com.patrick.model;

public class Simulation {
	
	public static void main(String[] args){
        FlyingVehicle fv = new FlyingVehicle((short)4, new Engine());
        fv.setName("A New Flying Vehicle");
        System.out.println(fv.getName());
        /* Notice how we were able to use the methods setName()
         *and getName() although they were only defined in the 
         *parent class Vehicle
         */
        Airplane boeing = new Airplane((short)4,(short) 5);
        boeing.move(15);
		}
}
