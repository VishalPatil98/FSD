package com.project.SpringSecurity.entities;
import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
public class MyUserDetails implements UserDetails
{
	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;
	public MyUserDetails() 
	{
	
	}
	public MyUserDetails(User user) 
	{
		this.userName = user.getName();
		this.password = user.getPassword();
	}
	public Collection<? extends GrantedAuthority> getAuthorities() 
	{
		return null;
	}
	public String getPassword() 
	{
		return password;
	}
	public String getUsername()
	{
		return userName;
	}
	public boolean isAccountNonExpired()
	{
		return true;
	}
	public boolean isAccountNonLocked() 
	{
		return true;
	}
	public boolean isCredentialsNonExpired() 
	{
		return true;
	}
	public boolean isEnabled()
	{
		return true;
	}
}
