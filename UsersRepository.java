package com.example.demo;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UsersRepository extends CrudRepository<Users, Integer>

{

	Users getOne(int id);

	


}
