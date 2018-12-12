package com.badgeorama.adalovelace.badgegenerator.repository;

import com.badgeorama.adalovelace.badgegenerator.model.Badge;
import org.springframework.data.repository.CrudRepository;


public interface BadgeRepo extends CrudRepository<Badge, Long> {
}
