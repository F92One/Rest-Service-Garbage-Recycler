package com.onetodiez.garbagerecycler.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter; 

/**
 * 
 * @author: Oneto, Fernando
 * @author: Diez, Lautaro
 *
 */
@Entity
@Table
public class UserRecycling {
	@Id
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "date", nullable = false)
	private Date date;

	@Column(name = "bottles", nullable = false)
	private int bottles;

	@Column(name = "tetrabriks", nullable = false)
	private int tetrabriks;

	@Column(name = "paperboard", nullable = false)
	private int paperboard;

	@Column(name = "glass", nullable = false)
	private int glass;
	
	@Column(name = "cans", nullable = false)
	private int cans;
	
	private User us;	
	
	@Column(name = "username", nullable = false)
	private String username;
	
	@GenericGenerator(name = "myGenerator",strategy = "foreign",parameters=@Parameter(value="user",name="property") )
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="us")
	public User getUser() {
		
		return us;
	}
	
	public void setUser(User u) {
		this.us=u;
	}
	
	/**
	 *  Como el usuario?? 
	 * Seria id_user una fk a user ? Como se hace?
	 * Si guardo el id del user creo una columna id_user y,
	 * en save de UserRecycling le seteo a userRecycling
	 *  el id del getUserByUsername? 
	 

	@Column(name = "user_id", nullable = false)
	private Long user_id;
	
	public Long getUserId() {
		return user_id;
	}
	
	public void setUserId(Long user_id) {
		this.user_id = user_id;
	}
	*/
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getBottles() {
		return bottles;
	}

	public void setBottles(int bottles) {
		this.bottles = bottles;
	}

	public int getTetrabriks() {
		return tetrabriks;
	}

	public void setTetrabriks(int tetrabriks) {
		this.tetrabriks = tetrabriks;
	}

	public int getPaperboard() {
		return paperboard;
	}

	public void setPaperboard(int paperboard) {
		this.paperboard = paperboard;
	}

	public int getGlass() {
		return glass;
	}

	public void setGlass(int glass) {
		this.glass = glass;
	}

	public int getCans() {
		return cans;
	}

	public void setCans(int cans) {
		this.cans = cans;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		//result = prime * result + (( == null) ? 0 : id.hashCode());
		return result;
	}
}
