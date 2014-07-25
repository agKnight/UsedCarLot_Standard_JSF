package jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.Vehicle;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-07-25T12:32:36")
@StaticMetamodel(NewOwner.class)
public class NewOwner_ { 

    public static volatile SingularAttribute<NewOwner, String> firstName;
    public static volatile SingularAttribute<NewOwner, String> lastName;
    public static volatile SingularAttribute<NewOwner, String> address;
    public static volatile SingularAttribute<NewOwner, String> city;
    public static volatile SingularAttribute<NewOwner, String> postalCode;
    public static volatile CollectionAttribute<NewOwner, Vehicle> vehicleCollection;
    public static volatile SingularAttribute<NewOwner, Integer> newOwnerID;

}