package MonBungalow;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import MonBungalow.dao.BungalowRepository;
import MonBungalow.dao.CategoryRepository;
import MonBungalow.entities.Bungalow;
import MonBungalow.entities.Category;
import net.bytebuddy.utility.RandomString;

@SpringBootApplication
public class MonBungalowApplication implements CommandLineRunner {
	@Autowired private BungalowRepository bungalowRepository;
	@Autowired private CategoryRepository categoryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MonBungalowApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		categoryRepository.save(new Category(null, "Solo", null));
		categoryRepository.save(new Category(null, "Doubles", null));
		categoryRepository.save(new Category(null, "Triples", null));
		categoryRepository.save(new Category(null, "Groupes", null));
		Random rnd = new Random();
		categoryRepository.findAll().forEach(c ->{
			bungalowRepository.save(new Bungalow(null, RandomString.make(6), RandomString.make(50), "", (100 + rnd.nextInt(600)), c));
			bungalowRepository.save(new Bungalow(null, RandomString.make(6), RandomString.make(50), "", (100 + rnd.nextInt(600)), c));
			bungalowRepository.save(new Bungalow(null, RandomString.make(6), RandomString.make(50), "", (100 + rnd.nextInt(600)), c));
			bungalowRepository.save(new Bungalow(null, RandomString.make(6), RandomString.make(50), "", (100 + rnd.nextInt(600)), c));
			bungalowRepository.save(new Bungalow(null, RandomString.make(6), RandomString.make(50), "", (100 + rnd.nextInt(600)), c));
			bungalowRepository.save(new Bungalow(null, RandomString.make(6), RandomString.make(50), "", (100 + rnd.nextInt(600)), c));
			bungalowRepository.save(new Bungalow(null, RandomString.make(6), RandomString.make(50), "", (100 + rnd.nextInt(600)), c));
			System.out.println(c.getName());
		
		});
		
	}

}
