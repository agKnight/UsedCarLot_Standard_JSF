/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jpa.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.entities.MaintenanceSchedule;

/**
 *
 * @author Nukeboy666
 */
@Stateless
public class MaintenanceScheduleFacade extends AbstractFacade<MaintenanceSchedule> {
    @PersistenceContext(unitName = "UsedCarLot_2014PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MaintenanceScheduleFacade() {
        super(MaintenanceSchedule.class);
    }
    
}
