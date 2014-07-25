/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nukeboy666
 */
@Entity
@Table(name = "maintenance_schedule")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MaintenanceSchedule.findAll", query = "SELECT m FROM MaintenanceSchedule m"),
    @NamedQuery(name = "MaintenanceSchedule.findByVehicleVin", query = "SELECT m FROM MaintenanceSchedule m WHERE m.vehicleVin = :vehicleVin"),
    @NamedQuery(name = "MaintenanceSchedule.findByEngineTest", query = "SELECT m FROM MaintenanceSchedule m WHERE m.engineTest = :engineTest"),
    @NamedQuery(name = "MaintenanceSchedule.findByEnginePass", query = "SELECT m FROM MaintenanceSchedule m WHERE m.enginePass = :enginePass"),
    @NamedQuery(name = "MaintenanceSchedule.findByBrakeTest", query = "SELECT m FROM MaintenanceSchedule m WHERE m.brakeTest = :brakeTest"),
    @NamedQuery(name = "MaintenanceSchedule.findByBrakePass", query = "SELECT m FROM MaintenanceSchedule m WHERE m.brakePass = :brakePass"),
    @NamedQuery(name = "MaintenanceSchedule.findByElectricalTest", query = "SELECT m FROM MaintenanceSchedule m WHERE m.electricalTest = :electricalTest"),
    @NamedQuery(name = "MaintenanceSchedule.findByElectricalPass", query = "SELECT m FROM MaintenanceSchedule m WHERE m.electricalPass = :electricalPass"),
    @NamedQuery(name = "MaintenanceSchedule.findByFluidTest", query = "SELECT m FROM MaintenanceSchedule m WHERE m.fluidTest = :fluidTest"),
    @NamedQuery(name = "MaintenanceSchedule.findByFluidPass", query = "SELECT m FROM MaintenanceSchedule m WHERE m.fluidPass = :fluidPass"),
    @NamedQuery(name = "MaintenanceSchedule.findByTiretest", query = "SELECT m FROM MaintenanceSchedule m WHERE m.tiretest = :tiretest"),
    @NamedQuery(name = "MaintenanceSchedule.findByTirePass", query = "SELECT m FROM MaintenanceSchedule m WHERE m.tirePass = :tirePass"),
    @NamedQuery(name = "MaintenanceSchedule.findByWindowTest", query = "SELECT m FROM MaintenanceSchedule m WHERE m.windowTest = :windowTest"),
    @NamedQuery(name = "MaintenanceSchedule.findByWindowPass", query = "SELECT m FROM MaintenanceSchedule m WHERE m.windowPass = :windowPass"),
    @NamedQuery(name = "MaintenanceSchedule.findByRoadTest", query = "SELECT m FROM MaintenanceSchedule m WHERE m.roadTest = :roadTest"),
    @NamedQuery(name = "MaintenanceSchedule.findByRoadPass", query = "SELECT m FROM MaintenanceSchedule m WHERE m.roadPass = :roadPass")})
public class MaintenanceSchedule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Vehicle_Vin")
    private String vehicleVin;
    @Column(name = "Engine_Test")
    @Temporal(TemporalType.DATE)
    private Date engineTest;
    @Column(name = "Engine_Pass")
    private Boolean enginePass;
    @Column(name = "Brake_Test")
    @Temporal(TemporalType.DATE)
    private Date brakeTest;
    @Column(name = "Brake_Pass")
    private Boolean brakePass;
    @Column(name = "Electrical_Test")
    @Temporal(TemporalType.DATE)
    private Date electricalTest;
    @Column(name = "Electrical_Pass")
    private Boolean electricalPass;
    @Column(name = "Fluid_Test")
    @Temporal(TemporalType.DATE)
    private Date fluidTest;
    @Column(name = "Fluid_Pass")
    private Boolean fluidPass;
    @Column(name = "Tire_test")
    @Temporal(TemporalType.DATE)
    private Date tiretest;
    @Column(name = "Tire_Pass")
    private Boolean tirePass;
    @Column(name = "Window_Test")
    @Temporal(TemporalType.DATE)
    private Date windowTest;
    @Column(name = "Window_Pass")
    private Boolean windowPass;
    @Column(name = "Road_Test")
    @Temporal(TemporalType.DATE)
    private Date roadTest;
    @Column(name = "Road_Pass")
    private Boolean roadPass;
    @JoinColumn(name = "Vehicle_Vin", referencedColumnName = "Vin", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Vehicle vehicle;

    public MaintenanceSchedule() {
    }

    public MaintenanceSchedule(String vehicleVin) {
        this.vehicleVin = vehicleVin;
    }

    public String getVehicleVin() {
        return vehicleVin;
    }

    public void setVehicleVin(String vehicleVin) {
        this.vehicleVin = vehicleVin;
    }

    public Date getEngineTest() {
        return engineTest;
    }

    public void setEngineTest(Date engineTest) {
        this.engineTest = engineTest;
    }

    public Boolean getEnginePass() {
        return enginePass;
    }

    public void setEnginePass(Boolean enginePass) {
        this.enginePass = enginePass;
    }

    public Date getBrakeTest() {
        return brakeTest;
    }

    public void setBrakeTest(Date brakeTest) {
        this.brakeTest = brakeTest;
    }

    public Boolean getBrakePass() {
        return brakePass;
    }

    public void setBrakePass(Boolean brakePass) {
        this.brakePass = brakePass;
    }

    public Date getElectricalTest() {
        return electricalTest;
    }

    public void setElectricalTest(Date electricalTest) {
        this.electricalTest = electricalTest;
    }

    public Boolean getElectricalPass() {
        return electricalPass;
    }

    public void setElectricalPass(Boolean electricalPass) {
        this.electricalPass = electricalPass;
    }

    public Date getFluidTest() {
        return fluidTest;
    }

    public void setFluidTest(Date fluidTest) {
        this.fluidTest = fluidTest;
    }

    public Boolean getFluidPass() {
        return fluidPass;
    }

    public void setFluidPass(Boolean fluidPass) {
        this.fluidPass = fluidPass;
    }

    public Date getTiretest() {
        return tiretest;
    }

    public void setTiretest(Date tiretest) {
        this.tiretest = tiretest;
    }

    public Boolean getTirePass() {
        return tirePass;
    }

    public void setTirePass(Boolean tirePass) {
        this.tirePass = tirePass;
    }

    public Date getWindowTest() {
        return windowTest;
    }

    public void setWindowTest(Date windowTest) {
        this.windowTest = windowTest;
    }

    public Boolean getWindowPass() {
        return windowPass;
    }

    public void setWindowPass(Boolean windowPass) {
        this.windowPass = windowPass;
    }

    public Date getRoadTest() {
        return roadTest;
    }

    public void setRoadTest(Date roadTest) {
        this.roadTest = roadTest;
    }

    public Boolean getRoadPass() {
        return roadPass;
    }

    public void setRoadPass(Boolean roadPass) {
        this.roadPass = roadPass;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vehicleVin != null ? vehicleVin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MaintenanceSchedule)) {
            return false;
        }
        MaintenanceSchedule other = (MaintenanceSchedule) object;
        if ((this.vehicleVin == null && other.vehicleVin != null) || (this.vehicleVin != null && !this.vehicleVin.equals(other.vehicleVin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.MaintenanceSchedule[ vehicleVin=" + vehicleVin + " ]";
    }
    
}
