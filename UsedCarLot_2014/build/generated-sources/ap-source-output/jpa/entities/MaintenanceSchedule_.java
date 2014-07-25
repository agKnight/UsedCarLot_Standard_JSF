package jpa.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.Vehicle;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-07-25T12:32:36")
@StaticMetamodel(MaintenanceSchedule.class)
public class MaintenanceSchedule_ { 

    public static volatile SingularAttribute<MaintenanceSchedule, Date> engineTest;
    public static volatile SingularAttribute<MaintenanceSchedule, Boolean> enginePass;
    public static volatile SingularAttribute<MaintenanceSchedule, Boolean> windowPass;
    public static volatile SingularAttribute<MaintenanceSchedule, Date> windowTest;
    public static volatile SingularAttribute<MaintenanceSchedule, Boolean> electricalPass;
    public static volatile SingularAttribute<MaintenanceSchedule, Date> electricalTest;
    public static volatile SingularAttribute<MaintenanceSchedule, Boolean> fluidPass;
    public static volatile SingularAttribute<MaintenanceSchedule, Date> fluidTest;
    public static volatile SingularAttribute<MaintenanceSchedule, Boolean> tirePass;
    public static volatile SingularAttribute<MaintenanceSchedule, Vehicle> vehicle;
    public static volatile SingularAttribute<MaintenanceSchedule, Boolean> roadPass;
    public static volatile SingularAttribute<MaintenanceSchedule, Date> roadTest;
    public static volatile SingularAttribute<MaintenanceSchedule, String> vehicleVin;
    public static volatile SingularAttribute<MaintenanceSchedule, Boolean> brakePass;
    public static volatile SingularAttribute<MaintenanceSchedule, Date> tiretest;
    public static volatile SingularAttribute<MaintenanceSchedule, Date> brakeTest;

}