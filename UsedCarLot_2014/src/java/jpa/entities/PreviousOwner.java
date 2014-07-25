/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpa.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Nukeboy666
 */
@Entity
@Table(name = "previous_owner")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PreviousOwner.findAll", query = "SELECT p FROM PreviousOwner p"),
    @NamedQuery(name = "PreviousOwner.findByPreviousOwnerID", query = "SELECT p FROM PreviousOwner p WHERE p.previousOwnerID = :previousOwnerID"),
    @NamedQuery(name = "PreviousOwner.findByFirstName", query = "SELECT p FROM PreviousOwner p WHERE p.firstName = :firstName"),
    @NamedQuery(name = "PreviousOwner.findByLastName", query = "SELECT p FROM PreviousOwner p WHERE p.lastName = :lastName"),
    @NamedQuery(name = "PreviousOwner.findByAddress", query = "SELECT p FROM PreviousOwner p WHERE p.address = :address"),
    @NamedQuery(name = "PreviousOwner.findByCity", query = "SELECT p FROM PreviousOwner p WHERE p.city = :city"),
    @NamedQuery(name = "PreviousOwner.findByPostalCode", query = "SELECT p FROM PreviousOwner p WHERE p.postalCode = :postalCode")})
public class PreviousOwner implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Previous_Owner_ID")
    private Integer previousOwnerID;
    @Size(max = 15)
    @Column(name = "First_Name")
    private String firstName;
    @Size(max = 15)
    @Column(name = "Last_Name")
    private String lastName;
    @Size(max = 45)
    @Column(name = "Address")
    private String address;
    @Size(max = 15)
    @Column(name = "City")
    private String city;
    @Size(max = 7)
    @Column(name = "Postal_Code")
    private String postalCode;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "previousOwnerPreviousOwnerID")
    private Collection<Vehicle> vehicleCollection;

    public PreviousOwner() {
    }

    public PreviousOwner(Integer previousOwnerID) {
        this.previousOwnerID = previousOwnerID;
    }

    public Integer getPreviousOwnerID() {
        return previousOwnerID;
    }

    public void setPreviousOwnerID(Integer previousOwnerID) {
        this.previousOwnerID = previousOwnerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @XmlTransient
    public Collection<Vehicle> getVehicleCollection() {
        return vehicleCollection;
    }

    public void setVehicleCollection(Collection<Vehicle> vehicleCollection) {
        this.vehicleCollection = vehicleCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (previousOwnerID != null ? previousOwnerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PreviousOwner)) {
            return false;
        }
        PreviousOwner other = (PreviousOwner) object;
        if ((this.previousOwnerID == null && other.previousOwnerID != null) || (this.previousOwnerID != null && !this.previousOwnerID.equals(other.previousOwnerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.PreviousOwner[ previousOwnerID=" + previousOwnerID + " ]";
    }
    
}
