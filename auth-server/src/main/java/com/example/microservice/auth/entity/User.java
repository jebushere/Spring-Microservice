package com.example.microservice.auth.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.security.core.userdetails.UserDetails;

import com.example.microservice.auth.enumeration.Authorities;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter@Getter
public class User implements UserDetails {
	
	private static final long serialVersionUID = -5108207691305250365L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(unique = true)
	private String username;

	private String password;

	private boolean activated;

	private String activationKey;

	private String resetPasswordKey;

	@OneToMany(mappedBy = "user_id", targetEntity = UserAuthority.class)
	private Set<UserAuthority> authorities = new HashSet<>();

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
