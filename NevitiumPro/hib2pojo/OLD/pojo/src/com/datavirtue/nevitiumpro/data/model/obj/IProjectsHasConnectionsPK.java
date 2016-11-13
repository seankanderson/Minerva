package com.datavirtue.nevitiumpro.data.model.obj;
import com.datavirtue.nevitiumpro.data.model.obj.Connections;
import com.datavirtue.nevitiumpro.data.model.obj.Projects;
import javax.persistence.Basic;


/** 
 * Object interface mapping for hibernate-handled table: projects_has_connections.
 * @author autogenerated
 */

public interface IProjectsHasConnectionsPK {



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
     * Return the value associated with the column: projectsProjects.
	 * @return A Projects object (this.projectsProjects)
	 */
	Projects getProjectsProjects();
	

  
    /**  
     * Set the value related to the column: projectsProjects.
	 * @param projectsProjects the projectsProjects value you wish to set
	 */
	void setProjectsProjects(final Projects projectsProjects);

	// end of interface
}