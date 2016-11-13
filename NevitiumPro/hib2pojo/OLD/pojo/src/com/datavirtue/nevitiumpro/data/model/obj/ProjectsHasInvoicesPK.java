package com.datavirtue.nevitiumpro.data.model.obj;

import com.datavirtue.nevitiumpro.data.model.obj.IProjectsHasInvoicesPK;
import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;


/** 
 * Object mapping for hibernate-handled table: projects_has_invoices.
 * @author autogenerated
 */

@Embeddable
public class ProjectsHasInvoicesPK implements Cloneable, Serializable,  IProjectsHasInvoicesPK {

	/** Serial Version UID. */
	private static final long serialVersionUID = -559029488L;

	

	/** Field mapping. */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "INVOICES_INVOICES_ID", nullable = false , insertable = false, updatable = false )
	private Invoices invoicesInvoices;

	/** Field mapping. */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "PROJECTS_PROJECTS_ID", nullable = false , insertable = false, updatable = false )
	private Projects projectsProjects;

 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return ProjectsHasInvoicesPK.class;
	}
 

    /**
     * Return the value associated with the column: invoicesInvoices.
	 * @return A Invoices object (this.invoicesInvoices)
	 */
	public Invoices getInvoicesInvoices() {
		return this.invoicesInvoices;
		
	}
	

  
    /**  
     * Set the value related to the column: invoicesInvoices.
	 * @param invoicesInvoices the invoicesInvoices value you wish to set
	 */
	public void setInvoicesInvoices(final Invoices invoicesInvoices) {
		this.invoicesInvoices = invoicesInvoices;
	}

    /**
     * Return the value associated with the column: projectsProjects.
	 * @return A Projects object (this.projectsProjects)
	 */
	public Projects getProjectsProjects() {
		return this.projectsProjects;
		
	}
	

  
    /**  
     * Set the value related to the column: projectsProjects.
	 * @param projectsProjects the projectsProjects value you wish to set
	 */
	public void setProjectsProjects(final Projects projectsProjects) {
		this.projectsProjects = projectsProjects;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public ProjectsHasInvoicesPK clone() throws CloneNotSupportedException {
		
        final ProjectsHasInvoicesPK copy = (ProjectsHasInvoicesPK)super.clone();

		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;
		
		if ( this == aThat ) {
			 return true;
		}

		if (aThat == null)  {
			 return false;
		}
		
		final ProjectsHasInvoicesPK that; 
		try {
			that = (ProjectsHasInvoicesPK) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((getInvoicesInvoices() == null) && (that.getInvoicesInvoices() == null)) || (getInvoicesInvoices() != null && getInvoicesInvoices().getId().equals(that.getInvoicesInvoices().getId())));	
		result = result && (((getProjectsProjects() == null) && (that.getProjectsProjects() == null)) || (getProjectsProjects() != null && getProjectsProjects().getId().equals(that.getProjectsProjects().getId())));	
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
	int hash = 0;
		hash = hash + getInvoicesInvoices().hashCode();
		hash = hash + getProjectsProjects().hashCode();
	return hash;
	}
	

	
}
