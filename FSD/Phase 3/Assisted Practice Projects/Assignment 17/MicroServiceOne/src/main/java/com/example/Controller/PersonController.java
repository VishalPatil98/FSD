package com.example.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Entity.PersonEntity;
import com.example.Service.PersonResponse;
import com.example.Service.PersonService;
@RestController
@RequestMapping("/api/person")
public class PersonController 
{
	@Autowired
	PersonService personservice;
	@PostMapping("/")
	public ResponseEntity<PersonEntity> addPerson(@RequestBody PersonEntity person)
	{
		PersonEntity obj= personservice.addPerson(person);
		return new ResponseEntity<PersonEntity>(obj,HttpStatus.CREATED);
	}
	//try to get all persons with Hobby
	@GetMapping"/{personId}")
	public PersonResponse getPerson(@PathVariable int personId)
		{
			return personService.getPerson(personId);
		}
}
