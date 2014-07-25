package jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.Vehicle;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-07-25T12:32:36")
@StaticMetamodel(PreviousOwner.class)
public class PreviousOwner_ { 

    public static volatile SingularAttribute<PreviousOwner, String> firstName;
    public static volatile SingularAttribute<PreviousOwner, String> lastName;
    public static volatile SingularAttribute<PreviousOwner, Integer> previousOwnerID;
    public static volatile SingularAttribute<PreviousOwner, String> address;
    public static volatile SingularAttribute<PreviousOwner, String> city;
    public static volatile SingularAttribute<PreviousOwner, String> postalCode;
    public static volatile CollectionAttribute<PreviousOwner, Vehicle> vehicleCollection;

}