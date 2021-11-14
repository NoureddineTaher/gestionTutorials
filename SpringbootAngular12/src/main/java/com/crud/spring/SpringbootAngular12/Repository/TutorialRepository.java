package com.crud.spring.SpringbootAngular12.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.spring.SpringbootAngular12.entity.*;

public interface TutorialRepository extends JpaRepository<Tutorial, Long>{
	
	
	  List<Tutorial> findByPublished(boolean published);
	  List<Tutorial> findByTitleContaining(String title);

}
