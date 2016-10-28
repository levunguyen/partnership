package org.hocviencntt.business.repository;

import java.util.List;

import org.hocviencntt.business.model.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BusinessRepository extends JpaRepository<Business, String> {

	@Query("select b from business b where b.username=:username")
	public List<Business> findByUserName(@Param("username")String username) ;
}