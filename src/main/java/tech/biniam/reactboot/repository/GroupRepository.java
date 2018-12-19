package tech.biniam.reactboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.biniam.reactboot.model.Group;

import java.util.List;

public interface GroupRepository extends JpaRepository<Group, Long> {
    Group findByName(String name);
}