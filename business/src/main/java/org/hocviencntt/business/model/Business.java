package org.hocviencntt.business.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="business")
@Table(name="business")
public class Business {
	
	@Id
	private int id;
	@Column
	private String name;
	@Column
	private String experience;
	@Column(name="startday")
	private Date startDay;
	@Column(name="username")
	@ManyToOne
	@JoinColumn(name = "username")
	private String userName;
	public Business(int id, String name, String experience, Date startday, String userName) {
		super();
		this.id = id;
		this.name = name;
		this.experience = experience;
		this.startDay = startday;
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "Business [id=" + id + ", name=" + name + ", experience=" + experience + ", startday=" + startDay
				+ ", userName=" + userName + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public Date getStartday() {
		return startDay;
	}
	public void setStartday(Date startday) {
		this.startDay = startday;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Business() {
		// TODO Auto-generated constructor stub
	}
	
}
