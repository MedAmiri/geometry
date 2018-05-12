package org.geometry.user.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class Loging {
	
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
	private LocalDateTime dateSignIn;
	
	@Column(name = "date_connexion", nullable = false)
	private LocalDateTime dateConnection;
}
