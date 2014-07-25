/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpa.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nukeboy666
 */
@Entity
@Table(name = "vehicle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vehicle.findAll", query = "SELECT v FROM Vehicle v"),
    @NamedQuery(name = "Vehicle.findByVin", query = "SELECT v FROM Vehicle v WHERE v.vin = :vin"),
    @NamedQuery(name = "Vehicle.findByMake", query = "SELECT v FROM Vehicle v WHERE v.make = :make"),
    @NamedQuery(name = "Vehicle.findByModel", query = "SELECT v FROM Vehicle v WHERE v.model = :model"),
    @NamedQuery(name = "Vehicle.findByYear", query = "SELECT v FROM Vehicle v WHERE v.year = :year"),
    @NamedQuery(name = "Vehicle.findByColor", query = "SELECT v FROM Vehicle v WHERE v.color = :color"),
    @NamedQuery(name = "Vehicle.findByOnLot", query = "SELECT v FROM Vehicle v WHERE v.onLot = :onLot"),
    @NamedQuery(name = "Vehicle.findByPrice", query = "SELECT v FROM Vehicle v WHERE v.price = :price")})
public class Vehicle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Vin")
    private String vin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Make")
    private String make;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Model")
    private String model;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Year")
    private int year;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Color")
    private String color;
    @Basic(optional = false)
    @NotNull
    @Column(name = "On_Lot")
    private boolean onLot;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Price")
    private float price;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "vehicle")
    private MaintenanceSchedule maintenanceSchedule;
    @JoinColumn(name = "Previous_Owner_Previous_Owner_ID", referencedColumnName = "Previous_Owner_ID")
    @ManyToOne(optional = false)
    private PreviousOwner previousOwnerPreviousOwnerID;
    @JoinColumn(name = "New_Owner_New_Owner_ID", referencedColumnName = "New_Owner_ID")
    @ManyToOne(optional = false)
    private NewOwner newOwnerNewOwnerID;

    public Vehicle() {
    }

    public Vehicle(String vin) {
        this.vin = vin;
    }

    public Vehicle(String vin, String make, String model, int year, String color, boolean onLot, float price) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.onLot = onLot;
        this.price = price;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getOnLot() {
        return onLot;
    }

    public void setOnLot(boolean onLot) {
        this.onLot = onLot;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public MaintenanceSchedule getMaintenanceSchedule() {
        return maintenanceSchedule;
    }

    public void setMaintenanceSchedule(MaintenanceSchedule maintenanceSchedule) {
        this.maintenanceSchedule = maintenanceSchedule;
    }

    public PreviousOwner getPreviousOwnerPreviousOwnerID() {
        return previousOwnerPreviousOwnerID;
    }

    public void setPreviousOwnerPreviousOwnerID(PreviousOwner previousOwnerPreviousOwnerID) {
        this.previousOwnerPreviousOwnerID = previousOwnerPreviousOwnerID;
    }

    public NewOwner getNewOwnerNewOwnerID() {
        return newOwnerNewOwnerID;
    }

    public void setNewOwnerNewOwnerID(NewOwner newOwnerNewOwnerID) {
        this.newOwnerNewOwnerID = newOwnerNewOwnerID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vin != null ? vin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehicle)) {
            return false;
        }
        Vehicle other = (Vehicle) object;
        if ((this.vin == null && other.vin != null) || (this.vin != null && !this.vin.equals(other.vin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.Vehicle[ vin=" + vin + " ]";
    }
    
}
