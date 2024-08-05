package one.digitalinnovation.projeto_api_santander.service;

import one.digitalinnovation.projeto_api_santander.domain.model.User;


public interface UserService {
    User findById(Long id);
    User create (User userToCreate);
}
