package com.iemr.helpline104.repository.location;

import java.util.ArrayList;
import java.util.Objects;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.iemr.helpline104.data.location.CityDetails;

@Repository
@RestResource(exported = false)
public interface LocationCityRepository extends CrudRepository<CityDetails, Integer> {

	@Query("select cityID, cityName from CityDetails where districtID = :id")
	public ArrayList<Objects[]> findBy(@Param("id") int id);

	@Query("select cityName from CityDetails where cityID = :id")
	public String findByCityID(@Param("id") int id);

}
