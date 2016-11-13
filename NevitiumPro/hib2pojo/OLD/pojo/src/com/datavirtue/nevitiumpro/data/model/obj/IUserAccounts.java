package com.datavirtue.nevitiumpro.data.model.obj;
import javax.persistence.Basic;


/** 
 * Object interface mapping for hibernate-handled table: user_accounts.
 * @author autogenerated
 */

public interface IUserAccount {



    /**
     * Return the value associated with the column: checks.
	 * @return A Integer object (this.checks)
	 */
	Integer getChecks();
	

  
    /**  
     * Set the value related to the column: checks.
	 * @param checks the checks value you wish to set
	 */
	void setChecks(final Integer checks);

    /**
     * Return the value associated with the column: connections.
	 * @return A Integer object (this.connections)
	 */
	Integer getConnections();
	

  
    /**  
     * Set the value related to the column: connections.
	 * @param connections the connections value you wish to set
	 */
	void setConnections(final Integer connections);

    /**
     * Return the value associated with the column: exports.
	 * @return A Integer object (this.exports)
	 */
	Integer getExports();
	

  
    /**  
     * Set the value related to the column: exports.
	 * @param exports the exports value you wish to set
	 */
	void setExports(final Integer exports);

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
	Integer getId();
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	void setId(final Integer id);

    /**
     * Return the value associated with the column: inventory.
	 * @return A Integer object (this.inventory)
	 */
	Integer getInventory();
	

  
    /**  
     * Set the value related to the column: inventory.
	 * @param inventory the inventory value you wish to set
	 */
	void setInventory(final Integer inventory);

    /**
     * Return the value associated with the column: invoices.
	 * @return A Integer object (this.invoices)
	 */
	Integer getInvoices();
	

  
    /**  
     * Set the value related to the column: invoices.
	 * @param invoices the invoices value you wish to set
	 */
	void setInvoices(final Integer invoices);

    /**
     * Return the value associated with the column: invoiceManager.
	 * @return A Integer object (this.invoiceManager)
	 */
	Integer getInvoiceManager();
	

  
    /**  
     * Set the value related to the column: invoiceManager.
	 * @param invoiceManager the invoiceManager value you wish to set
	 */
	void setInvoiceManager(final Integer invoiceManager);

    /**
     * Return the value associated with the column: master.
	 * @return A Boolean object (this.master)
	 */
	Boolean isMaster();
	

  
    /**  
     * Set the value related to the column: master.
	 * @param master the master value you wish to set
	 */
	void setMaster(final Boolean master);

    /**
     * Return the value associated with the column: password.
	 * @return A String object (this.password)
	 */
	String getPassword();
	

  
    /**  
     * Set the value related to the column: password.
	 * @param password the password value you wish to set
	 */
	void setPassword(final String password);

    /**
     * Return the value associated with the column: quotes.
	 * @return A Integer object (this.quotes)
	 */
	Integer getQuotes();
	

  
    /**  
     * Set the value related to the column: quotes.
	 * @param quotes the quotes value you wish to set
	 */
	void setQuotes(final Integer quotes);

    /**
     * Return the value associated with the column: reports.
	 * @return A Integer object (this.reports)
	 */
	Integer getReports();
	

  
    /**  
     * Set the value related to the column: reports.
	 * @param reports the reports value you wish to set
	 */
	void setReports(final Integer reports);

    /**
     * Return the value associated with the column: settings.
	 * @return A Integer object (this.settings)
	 */
	Integer getSettings();
	

  
    /**  
     * Set the value related to the column: settings.
	 * @param settings the settings value you wish to set
	 */
	void setSettings(final Integer settings);

    /**
     * Return the value associated with the column: username.
	 * @return A String object (this.username)
	 */
	String getUsername();
	

  
    /**  
     * Set the value related to the column: username.
	 * @param username the username value you wish to set
	 */
	void setUsername(final String username);

	// end of interface
}