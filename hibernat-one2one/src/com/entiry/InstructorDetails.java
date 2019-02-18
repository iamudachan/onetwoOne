package com.entiry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="instructor_details" ,schema="nmc")
public class InstructorDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="id")
	private int id ;
	
	@Column(name="youtube_channel")
	private String youtubeChannel ;
	
	@Column(name="hobby")
	private String hobby ;

	public InstructorDetails() {

	}

	public InstructorDetails(String youtubeChannel, String hobby) {
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYoutubeChannel() {
		return youtubeChannel;
	}

	@Override
	public String toString() {
		return "InstructorDetails [id=" + id + ", youtubeChannel="
				+ youtubeChannel + ", hobby=" + hobby + "]";
	}

	public void setYoutubeChannel(String youtubeChannel) {
		this.youtubeChannel = youtubeChannel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
}
