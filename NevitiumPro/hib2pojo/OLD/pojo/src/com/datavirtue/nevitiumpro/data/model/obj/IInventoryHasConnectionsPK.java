package com.datavirtue.nevitiumpro.data.model.obj;
import com.datavirtue.nevitiumpro.data.model.obj.Connections;
import com.datavirtue.nevitiumpro.data.model.obj.Inventory;
import javax.persistence.Basic;


/** 
 * Object interface mapping for hibernate-handled table: inventory_has_connections.
 * @author autogenerated
 */

public interface IInventoryHasConnectionsPK {



    /**
     * Return the value associated with the column: connectionsConnections.
	 * @return A Connections object (this.connectionsConnections)
	 */
	Connections getConnectionsConnections();
	

  
    /**  
     * Set the value related to the column: connectionsConnections.
	 * @param connectionsConnections the connectionsConnections value you wish to set
	 */
	void setConnectionsConnections(final Connections connectionsConnections);

    /**
     * Return the value associated with the column: inventoryInventory.
	 * @return A Inventory object (this.inventoryInventory)
	 */
	Inventory getInventoryInventory();
	

  
    /**  
     * Set the value related to the column: inventoryInventory.
	 * @param inventoryInventory the inventoryInventory value you wish to set
	 */
	void setInventoryInventory(final Inventory inventoryInventory);

	// end of interface
}