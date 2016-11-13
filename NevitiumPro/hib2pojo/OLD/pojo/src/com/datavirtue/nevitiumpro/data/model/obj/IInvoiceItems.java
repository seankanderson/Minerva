package com.datavirtue.nevitiumpro.data.model.obj;
import com.datavirtue.nevitiumpro.data.model.obj.Invoices;
import javax.persistence.Basic;


/** 
 * Object interface mapping for hibernate-handled table: invoice_items.
 * @author autogenerated
 */

public interface IInvoiceItems {



    /**
     * Return the value associated with the column: code.
	 * @return A String object (this.code)
	 */
	String getCode();
	

  
    /**  
     * Set the value related to the column: code.
	 * @param code the code value you wish to set
	 */
	void setCode(final String code);

    /**
     * Return the value associated with the column: cost.
	 * @return A java.math.BigDecimal object (this.cost)
	 */
	java.math.BigDecimal getCost();
	

  
    /**  
     * Set the value related to the column: cost.
	 * @param cost the cost value you wish to set
	 */
	void setCost(final java.math.BigDecimal cost);

    /**
     * Return the value associated with the column: date.
	 * @return A Long object (this.date)
	 */
	Long getDate();
	

  
    /**  
     * Set the value related to the column: date.
	 * @param date the date value you wish to set
	 */
	void setDate(final Long date);

    /**
     * Return the value associated with the column: description.
	 * @return A String object (this.description)
	 */
	String getDescription();
	

  
    /**  
     * Set the value related to the column: description.
	 * @param description the description value you wish to set
	 */
	void setDescription(final String description);

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
     * Return the value associated with the column: invoicesInvoices.
	 * @return A Invoices object (this.invoicesInvoices)
	 */
	Invoices getInvoicesInvoices();
	

  
    /**  
     * Set the value related to the column: invoicesInvoices.
	 * @param invoicesInvoices the invoicesInvoices value you wish to set
	 */
	void setInvoicesInvoices(final Invoices invoicesInvoices);

    /**
     * Return the value associated with the column: qtySold.
	 * @return A java.math.BigDecimal object (this.qtySold)
	 */
	java.math.BigDecimal getQtySold();
	

  
    /**  
     * Set the value related to the column: qtySold.
	 * @param qtySold the qtySold value you wish to set
	 */
	void setQtySold(final java.math.BigDecimal qtySold);

    /**
     * Return the value associated with the column: tax1.
	 * @return A Boolean object (this.tax1)
	 */
	Boolean isTax1();
	

  
    /**  
     * Set the value related to the column: tax1.
	 * @param tax1 the tax1 value you wish to set
	 */
	void setTax1(final Boolean tax1);

    /**
     * Return the value associated with the column: tax2.
	 * @return A Boolean object (this.tax2)
	 */
	Boolean isTax2();
	

  
    /**  
     * Set the value related to the column: tax2.
	 * @param tax2 the tax2 value you wish to set
	 */
	void setTax2(final Boolean tax2);

    /**
     * Return the value associated with the column: unitPrice.
	 * @return A java.math.BigDecimal object (this.unitPrice)
	 */
	java.math.BigDecimal getUnitPrice();
	

  
    /**  
     * Set the value related to the column: unitPrice.
	 * @param unitPrice the unitPrice value you wish to set
	 */
	void setUnitPrice(final java.math.BigDecimal unitPrice);

	// end of interface
}