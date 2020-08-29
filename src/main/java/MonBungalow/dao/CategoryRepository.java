package MonBungalow.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import MonBungalow.entities.Category;
@CrossOrigin(origins= "http://localhost:4200")
@RepositoryRestResource
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
