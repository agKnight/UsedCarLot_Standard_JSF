package jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.MaintenanceSchedule;
import jpa.entities.NewOwner;
import jpa.entities.PreviousOwner;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-07-25T12:32:36")
@StaticMetamodel(Vehicle.class)
public class Vehicle_ { 

    public static volatile SingularAttribute<Vehicle, PreviousOwner> previousOwnerPreviousOwnerID;
    public static volatile SingularAttribute<Vehicle, NewOwner> newOwnerNewOwnerID;
    public static volatile SingularAttribute<Vehicle, String> color;
    public static volatile SingularAttribute<Vehicle, Integer> year;
    public static volatile SingularAttribute<Vehicle, Float> price;
    public static volatile SingularAttribute<Vehicle, String> vin;
    public static volatile SingularAttribute<Vehicle, String> model;
    public static volatile SingularAttribute<Vehicle, MaintenanceSchedule> maintenanceSchedule;
    public static volatile SingularAttribute<Vehicle, String> make;
    public static volatile SingularAttribute<Vehicle, Boolean> onLot;

}