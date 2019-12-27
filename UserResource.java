package com.example.demo;




import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchDataSource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserResource
{
	@Autowired
	UsersRepository repo;
	@GetMapping("users")
	
public List<Users> getuser()
{
	List<Users> users= (List<Users>) repo.findAll();
	
	return users;

}
	@PostMapping("users")
	public Users postuser(Users users) {
		 repo.save(users);
		return users;	
	}
	@DeleteMapping("/users/{id}")
	public String Deleteuser(@PathVariable int id)
	{
		Users u=repo.getOne(id);
		repo.delete(u);
		return "Deleted";
	}
	
	@PutMapping("users")
	public Users updatetuser( Users users) {
		 repo.save(users);
		return users;	
	}
} 