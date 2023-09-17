package com.pharmacy.hub.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private Long userId;
	private String userName;
	private String firstName;
	private String lastName;
	private boolean canLogin;
	@Column (columnDefinition = ("varchar(255) default 'user'"))
	private String role;
	@Column(unique = true)
	private String emailAddress;
	@JsonIgnore
	private String password;
	@Column(name = "created_at", nullable = true, updatable = false)
	@CreationTimestamp
	private Timestamp createdAt;
	@Column(name = "updated_at")
	@UpdateTimestamp 
	private Timestamp updatedAt;
	@OneToOne (mappedBy = "user")
	private Pharmacist pharmacist;
	@OneToOne (mappedBy = "user")
	private Proprietor proprietor;
}







