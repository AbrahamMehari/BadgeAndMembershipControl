package edu.miu.cs.badgeandmembershipcontrol.aspect.repo;

import edu.miu.cs.badgeandmembershipcontrol.aspect.domain.exception;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface exceptionRepo extends CrudRepository<exception, Long> {
}
