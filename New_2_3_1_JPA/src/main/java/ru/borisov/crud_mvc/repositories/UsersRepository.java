package ru.borisov.crud_mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.borisov.crud_mvc.models.User;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
}
