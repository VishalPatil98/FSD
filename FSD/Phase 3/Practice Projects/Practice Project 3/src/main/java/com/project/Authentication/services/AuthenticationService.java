package com.project.Authentication.services;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.Authentication.entities.User;
import com.project.Authentication.exceptions.UserNotFoundException;
import com.project.Authentication.repositories.AuthenticationRepository;
@Service
public class AuthenticationService 
{
	@Autowired
	AuthenticationRepository authRepo;	
	public User GetUserByEmail(String email) 
	{
		Optional<User> found = authRepo.findByEmail(email);
		if(found.isPresent()) 
		{
			return found.get();
		}
		else
		{
			throw new UserNotFoundException();
		}
	}	
	public Boolean isValidPassword(String cmp, String actual)
	{
		return ((cmp.equals(actual)) ?  true :  false);	
	}	
}
 