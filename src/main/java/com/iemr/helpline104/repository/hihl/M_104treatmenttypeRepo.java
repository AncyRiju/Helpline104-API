package com.iemr.helpline104.repository.hihl;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iemr.helpline104.data.hihl.M_104treatmenttype;

@Repository
public interface M_104treatmenttypeRepo extends CrudRepository<M_104treatmenttype, Integer> {
	List<M_104treatmenttype> findByDeleted(Boolean deleted);
}