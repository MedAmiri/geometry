package org.geometry.user.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonProperty;

@Entity
@Table(name = "USER", schema="public")
public class User implements Serializable {
	
	private static final long serialVersionUID = 4066041997352233673L;

	@Id
	@Column(name = "id")
	private long id;
	
	@Column(name ="firstname")
	@JsonProperty("first_name")
	private String firstName;
	
	@Column(name = "lastname")
	@JsonProperty("last_name")
	private String lastName;
	
	@Column(name = "birthdate")
	@JsonProperty("birth_date")
	private LocalDate birthDate;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Loging loging;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
}
