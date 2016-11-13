package com.datavirtue.nevitiumpro.data.model.obj;
import javax.persistence.Basic;


/** 
 * Object interface mapping for hibernate-handled table: debit_account_ledger.
 * @author autogenerated
 */

public interface IDebitAccountLedger {



    /**
     * Return the value associated with the column: credit.
	 * @return A java.math.BigDecimal object (this.credit)
	 */
	java.math.BigDecimal getCredit();
	

  
    /**  
     * Set the value related to the column: credit.
	 * @param credit the credit value you wish to set
	 */
	void setCredit(final java.math.BigDecimal credit);

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
     * Return the value associated with the column: debit.
	 * @return A java.math.BigDecimal object (this.debit)
	 */
	java.math.BigDecimal getDebit();
	

  
    /**  
     * Set the value related to the column: debit.
	 * @param debit the debit value you wish to set
	 */
	void setDebit(final java.math.BigDecimal debit);

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
     * Return the value associated with the column: memo.
	 * @return A String object (this.memo)
	 */
	String getMemo();
	

  
    /**  
     * Set the value related to the column: memo.
	 * @param memo the memo value you wish to set
	 */
	void setMemo(final String memo);

	// end of interface
}