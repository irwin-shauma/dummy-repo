package com.lawencon.community.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.search.mapper.pojo.mapping.definition.annotation.Indexed;

import com.lawencon.base.BaseEntity;

@Entity
@Indexed
@Table(uniqueConstraints = {
		@UniqueConstraint(
				name = "role_ck",
				columnName = {"role_code"}
				)
})
public class Role extends BaseEntity{
	
	
	private String roleCode;
	

}
