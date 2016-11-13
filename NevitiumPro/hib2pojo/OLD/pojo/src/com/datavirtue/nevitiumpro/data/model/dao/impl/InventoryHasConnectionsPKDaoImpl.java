package com.datavirtue.nevitiumpro.data.model.dao.impl;

import com.felees.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import com.datavirtue.nevitiumpro.data.model.obj.InventoryHasConnectionsPK;
import org.springframework.stereotype.Repository;
import com.datavirtue.nevitiumpro.data.model.dao.InventoryHasConnectionsPKDao;
import java.io.Serializable;
 
/**
 * DAO for table: InventoryHasConnectionsPK.
 * @author autogenerated
 */
@Repository
public class InventoryHasConnectionsPKDaoImpl extends GenericHibernateDaoImpl<InventoryHasConnectionsPK, Serializable> implements InventoryHasConnectionsPKDao {
	
	/** Constructor method. */
		public InventoryHasConnectionsPKDaoImpl() {
			super(InventoryHasConnectionsPK.class);
		}
	}

