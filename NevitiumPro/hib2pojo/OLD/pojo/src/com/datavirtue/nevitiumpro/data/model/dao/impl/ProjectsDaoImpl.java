package com.datavirtue.nevitiumpro.data.model.dao.impl;

import com.felees.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import com.datavirtue.nevitiumpro.data.model.obj.Projects;
import org.springframework.stereotype.Repository;
import com.datavirtue.nevitiumpro.data.model.dao.ProjectsDao;
 
 
/**
 * DAO for table: Projects.
 * @author autogenerated
 */
@Repository
public class ProjectsDaoImpl extends GenericHibernateDaoImpl<Projects, Integer> implements ProjectsDao {
	
	/** Constructor method. */
		public ProjectsDaoImpl() {
			super(Projects.class);
		}
	}

