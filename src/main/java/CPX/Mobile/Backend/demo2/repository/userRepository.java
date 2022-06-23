package CPX.Mobile.Backend.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import CPX.Mobile.Backend.demo2.model.User;


public interface userRepository extends JpaRepository<User,Long> {
    
}
