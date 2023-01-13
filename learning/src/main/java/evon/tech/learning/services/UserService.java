package evon.tech.learning.services;

import java.util.List;

import evon.tech.learning.dtos.UserDto;


public interface UserService {
    //create

   UserDto createUser( UserDto userDto);
    // update

    UserDto updateUser( UserDto userDto , String userId);
    
    //delete

    void deleteUser(String userId);


    //get all user

    List<UserDto> getAllUsers();

    //get single user by id


    UserDto getUserById(String userId);

    //get single user by email

    UserDto getUserByEmail(String email);


    //search user

    List<UserDto> searchUser(String keywords);

    //other user specific details
}
