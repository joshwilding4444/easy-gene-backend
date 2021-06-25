package com.easygene.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.easygene.entity.Conversion;

@Repository
public interface ConversionRepository extends JpaRepository<Conversion, Integer> {
	public List<Conversion> findByUsername(String username);
}
