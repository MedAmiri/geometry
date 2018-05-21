package org.geometry.user.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonProperty;

@Entity
@Table(name = "LOGING", schema = "public")
public class Loging implements Serializable{
	
	private static final long serialVersionUID = -5866756994898070667L;

	@Id
	@Column(name = "id", nullable = false)
	private long id;
	
	@Column(name = "id_user", nullable = false)
	private long idUser;
	
	@Column(name = "loging", nullable = false)
	private String loging;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Column(name = "date_inscription", nullable = false)
	@JsonProperty("date_inscription")
	private LocalDateTime dateSignIn;
	
	@Column(name = "date_connexion", nullable = false)
	@JsonProperty("date_connexion")
	private LocalDateTime dateConnection;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public String getLoging() {
		return loging;
	}

	public void setLoging(String loging) {
		this.loging = loging;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDateTime getDateSignIn() {
		return dateSignIn;
	}

	public void setDateSignIn(LocalDateTime dateSignIn) {
		this.dateSignIn = dateSignIn;
	}

	public LocalDateTime getDateConnection() {
		return dateConnection;
	}

	public void setDateConnection(LocalDateTime dateConnection) {
		this.dateConnection = dateConnection;
	}
}
