package com.example.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Entity.PersonEntity;
@Repository
public interface PersonRepository extends JpaRepository<PersonEntity,Integer>
{

}
