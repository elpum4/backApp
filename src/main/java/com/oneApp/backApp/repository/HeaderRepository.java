package com.oneApp.backApp.repository;

import com.oneApp.backApp.model.Header;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HeaderRepository extends JpaRepository<Header, Long>  {
    
}
