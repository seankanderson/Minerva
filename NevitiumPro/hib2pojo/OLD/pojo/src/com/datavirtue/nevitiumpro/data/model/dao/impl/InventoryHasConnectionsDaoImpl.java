package com.datavirtue.nevitiumpro.data.model.dao.impl;

import com.felees.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import com.datavirtue.nevitiumpro.data.model.obj.InventoryHasConnections;
import org.springframework.stereotype.Repository;
import com.datavirtue.nevitiumpro.data.model.dao.InventoryHasConnectionsDao;
import com.datavirtue.nevitiumpro.data.model.obj.InventoryHasConnectionsPK;
 
/**
 * DAO for table: InventoryHasConnections.
 * @author autogenerated
 */
@Repository
public class InventoryHasConnectionsDaoImpl extends GenericHibernateDaoImpl<InventoryHasConnections, InventoryHasConnectionsPK> implements InventoryHasConnectionsDao {
	
	/** Constructor method. */
		public InventoryHasConnectionsDaoImpl() {
			super(InventoryHasConnections.class);
		}
	}

