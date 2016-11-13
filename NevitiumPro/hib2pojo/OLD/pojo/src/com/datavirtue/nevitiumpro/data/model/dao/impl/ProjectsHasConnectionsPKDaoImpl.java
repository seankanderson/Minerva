package com.datavirtue.nevitiumpro.data.model.dao.impl;

import com.felees.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import com.datavirtue.nevitiumpro.data.model.obj.ProjectsHasConnectionsPK;
import org.springframework.stereotype.Repository;
import com.datavirtue.nevitiumpro.data.model.dao.ProjectsHasConnectionsPKDao;
import java.io.Serializable;
 
/**
 * DAO for table: ProjectsHasConnectionsPK.
 * @author autogenerated
 */
@Repository
public class ProjectsHasConnectionsPKDaoImpl extends GenericHibernateDaoImpl<ProjectsHasConnectionsPK, Serializable> implements ProjectsHasConnectionsPKDao {
	
	/** Constructor method. */
		public ProjectsHasConnectionsPKDaoImpl() {
			super(ProjectsHasConnectionsPK.class);
		}
	}
