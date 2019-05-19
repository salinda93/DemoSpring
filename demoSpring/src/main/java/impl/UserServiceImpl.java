package impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.UserDTO;
import repositories.UserRepository;
import services.UserServices;


@Service
public class UserServiceImpl implements UserServices {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<UserDTO> findAllUsers() {
		List<UserDTO> allusers = userRepository.findAll();
		return allusers;
		
		
		
	}

	@Override
	public String saveUser(UserDTO userdata) {
		userRepository.save(userdata);
		return "data saved";
	}

	@Override
	public String updateUser(UserDTO newUserData) {
		
		String msg = null;
		if(newUserData.getId() != null) {
			userRepository.save(newUserData);
		    msg = "Data Updated";	
	}
		
	else {
		msg = "Errow";
	}
	
	return msg;
	}

	@Override
	public UserDTO findById(Integer id) {
		return userRepository.findOne(id);
		
	}

	
}
