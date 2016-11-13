package com.datavirtue.nevitiumpro.data.model.obj;
import com.datavirtue.nevitiumpro.data.model.obj.Connections;
import javax.persistence.Basic;


/** 
 * Object interface mapping for hibernate-handled table: connections_documents.
 * @author autogenerated
 */

public interface IConnectionsDocuments {



    /**
     * Return the value associated with the column: application.
	 * @return A String object (this.application)
	 */
	String getApplication();
	

  
    /**  
     * Set the value related to the column: application.
	 * @param application the application value you wish to set
	 */
	void setApplication(final String application);

    /**
     * Return the value associated with the column: binDocument.
	 * @return A Byte[] object (this.binDocument)
	 */
	Byte[] getBinDocument();
	

  
    /**  
     * Set the value related to the column: binDocument.
	 * @param binDocument the binDocument value you wish to set
	 */
	void setBinDocument(final Byte[] binDocument);

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
     * Return the value associated with the column: subject.
	 * @return A String object (this.subject)
	 */
	String getSubject();
	

  
    /**  
     * Set the value related to the column: subject.
	 * @param subject the subject value you wish to set
	 */
	void setSubject(final String subject);

    /**
     * Return the value associated with the column: textDocument.
	 * @return A String object (this.textDocument)
	 */
	String getTextDocument();
	

  
    /**  
     * Set the value related to the column: textDocument.
	 * @param textDocument the textDocument value you wish to set
	 */
	void setTextDocument(final String textDocument);

    /**
     * Return the value associated with the column: type.
	 * @return A String object (this.type)
	 */
	String getType();
	

  
    /**  
     * Set the value related to the column: type.
	 * @param type the type value you wish to set
	 */
	void setType(final String type);

	// end of interface
}