package com.example.microservice.auth.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.microservice.auth.enumeration.Authorities;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserAuthority {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne(optional = false)
	@JoinColumn(name = "user_id")
	private User user;
	
	@Enumerated(EnumType.STRING)
	private Authorities authorities;
	
}
