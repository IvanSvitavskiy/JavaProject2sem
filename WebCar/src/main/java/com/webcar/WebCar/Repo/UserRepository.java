package com.webcar.WebCar.Repo;

import com.webcar.WebCar.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
