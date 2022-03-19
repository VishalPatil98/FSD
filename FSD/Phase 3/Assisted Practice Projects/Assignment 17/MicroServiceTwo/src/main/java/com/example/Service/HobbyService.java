package com.example.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Entity.HobbyEntity;
import com.example.Repository.HobbyRepository;
@Service
public class HobbyService 
{
	@Autowired
	private HobbyRepository hobbyRepository;
	
	public HobbyEntity addHobby(HobbyEntity hobby)
	{
		return hobbyRepository.save(hobby);
	}
	public String findByPersonId(int personId) 
	{
		return hobbyRepository.findByPersonId(personId);
	}
}	