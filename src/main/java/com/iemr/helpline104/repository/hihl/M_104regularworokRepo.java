package com.iemr.helpline104.repository.hihl;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.helpline104.data.hihl.M_104regularworok;

@Repository
public interface M_104regularworokRepo extends CrudRepository<M_104regularworok, Integer> {
	List<M_104regularworok> findByDeleted(Boolean deleted);
}