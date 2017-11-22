package com.javaaapplication.springboot.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
 
@Entity
@Table(name="APP_USER")
public class User implements Serializable{
 
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

	@NotEmpty
    @Column(name="NAME", nullable=false)
    private String name;
    
    @NotEmpty
    @Column(name="EMAILADDRESS", nullable=false)
    private String emailaddress;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
    
}
