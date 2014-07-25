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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Nukeboy666
 */
@Entity
@Table(name = "new_owner")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NewOwner.findAll", query = "SELECT n FROM NewOwner n"),
    @NamedQuery(name = "NewOwner.findByNewOwnerID", query = "SELECT n FROM NewOwner n WHERE n.newOwnerID = :newOwnerID"),
    @NamedQuery(name = "NewOwner.findByFirstName", query = "SELECT n FROM NewOwner n WHERE n.firstName = :firstName"),
    @NamedQuery(name = "NewOwner.findByLastName", query = "SELECT n FROM NewOwner n WHERE n.lastName = :lastName"),
    @NamedQuery(name = "NewOwner.findByAddress", query = "SELECT n FROM NewOwner n WHERE n.address = :address"),
    @NamedQuery(name = "NewOwner.findByCity", query = "SELECT n FROM NewOwner n WHERE n.city = :city"),
    @NamedQuery(name = "NewOwner.findByPostalCode", query = "SELECT n FROM NewOwner n WHERE n.postalCode = :postalCode")})
public class NewOwner implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "New_Owner_ID")
    private Integer newOwnerID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "First_Name")
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "Last_Name")
    private String lastName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "City")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "Postal_Code")
    private String postalCode;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "newOwnerNewOwnerID")
    private Collection<Vehicle> vehicleCollection;

    public NewOwner() {
    }

    public NewOwner(Integer newOwnerID) {
        this.newOwnerID = newOwnerID;
    }

    public NewOwner(Integer newOwnerID, String firstName, String lastName, String address, String city, String postalCode) {
        this.newOwnerID = newOwnerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
    }

    public Integer getNewOwnerID() {
        return newOwnerID;
    }

    public void setNewOwnerID(Integer newOwnerID) {
        this.newOwnerID = newOwnerID;
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
        hash += (newOwnerID != null ? newOwnerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NewOwner)) {
            return false;
        }
        NewOwner other = (NewOwner) object;
        if ((this.newOwnerID == null && other.newOwnerID != null) || (this.newOwnerID != null && !this.newOwnerID.equals(other.newOwnerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.NewOwner[ newOwnerID=" + newOwnerID + " ]";
    }
    
}
