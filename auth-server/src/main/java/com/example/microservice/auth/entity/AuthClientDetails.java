package com.example.microservice.auth.entity;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AuthClientDetails implements ClientDetails {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String clientId;

	private String clientSecret;

	private String grantTypes;

	private String scopes;

	private String resources;

	private String redirectUris;

	private Integer accessTokenValidity;

	private Integer refreshTokenValidity;

	private String additionalInformation;

	@Override
	public Set<String> getResourceIds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSecretRequired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isScoped() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<String> getScope() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getAuthorizedGrantTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getRegisteredRedirectUri() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getAccessTokenValiditySeconds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getRefreshTokenValiditySeconds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAutoApprove(String scope) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<String, Object> getAdditionalInformation() {
		// TODO Auto-generated method stub
		return null;
	}

}
