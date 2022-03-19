package com.example.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Entity.HobbyEntity;
@Repository
public interface HobbyRepository extends JpaRepository<HobbyEntity, Integer>
{

}
