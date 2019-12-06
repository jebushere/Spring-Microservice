package com.example.microservice.auth.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.core.userdetails.UserDetails;

import com.example.microservice.auth.enumeration.Authorities;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User implements UserDetails {
	
	private static final long serialVersionUID = -5108207691305250365L;

	@Id
	private String id;

	@Column(unique = true)
	private String username;

	private String password;

	private boolean activated;

	private String activationKey;

	private String resetPasswordKey;

	private Set<Authorities> authorities = new HashSet<>();

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
}
