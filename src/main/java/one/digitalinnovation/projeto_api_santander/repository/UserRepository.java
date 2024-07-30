package one.digitalinnovation.projeto_api_santander.repository;


import one.digitalinnovation.projeto_api_santander.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
