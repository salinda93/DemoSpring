package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.UserDTO;

public interface UserRepository extends JpaRepository<UserDTO, Integer>{

	UserDTO findOne(Integer id);
	
	//getAll users
	//findby ID
	//update
	//delete
	//custom query

}
