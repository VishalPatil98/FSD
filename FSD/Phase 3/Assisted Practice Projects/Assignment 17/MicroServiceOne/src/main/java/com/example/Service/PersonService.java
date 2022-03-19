package com.example.Service;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.Entity.PersonEntity;
import com.example.Repository.PersonRepository;

@Service
public class PersonService
{
	@Autowired
	PersonRepository personreop;
	
	public PersonEntity addPerson(PersonEntity person)
	{
		return personreop.save(person);
	}
	public PersonResponse getPerson(int personId)
	{
		//microservice
		final String url="http://localhost:8082/api/hobby/{personId}";
		Map<String, Integer> map= new HashMap()<String, Integer>();
		map.put("personId", personId);
		String hobby= RestTemplate.getForObject(url, String.class,map);
		
		PersonEntity entity= personRepository.getById(personId);
		
		PersonResponse resp= new PersonResponse();
		resp.setPersonId(entity.getPersonId());
		resp.setName(entity.getName());
		resp.setAge(entity.getAge());
		resp.setHobby(hobby);
		
		return resp;
	}
}
