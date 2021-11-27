package com.vksk;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Long>{

	void deleteById(Long id);

	Optional<CustomerEntity> findById(Long id);

	void delete(Long id);

}
