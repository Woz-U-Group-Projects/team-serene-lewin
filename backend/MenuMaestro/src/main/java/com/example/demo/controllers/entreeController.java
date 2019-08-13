import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Entree;


@RestController

public class entreeController {

	private static final ResponseEntity<Menu> entree = null;
	
	private EntreeRepository entreeRepository;

    public EntreeController(EntreeRepository entreeRepository) {
        this.entreeRepository = entreeRepository;
    }
	
	@GetMapping("/entree")
	public String getEntrees(Model model) {
		List <Entree> entree =new ArrayList<Entree>();
		
		 Connection con;
		 entreeRepository.findAll()
	
      }
	
	 @GetMapping("/entree/{id}")
	    public ResponseEntity<Entree> getEntree(@PathVariable(value="id") Integer id) {
	        Message foundEntree = dao.findById(id).orElse(null);

	        if(foundEntree == null) {
	            return ResponseEntity.notFound().header("Entree","Nothing found with that id").build();
	        }
	        return ResponseEntity.ok(foundEntree);
	    }
	

    @PostMapping("/entree")
    public ResponseEntity<Message> postMessage(@RequestBody Message message) {

       
        Entree createdEntree = dao.save(entree);

        return ResponseEntity.ok(createdEntree);
    }
    
    @DeleteMapping("/Entree/{id}")
    public ResponseEntity<Entree> deleteEntree(@PathVariable(value="id") Integer id) {
        Message foundEntree = dao.findById(id).orElse(null);

        if(foundEntree == null) {
            return ResponseEntity.notFound().header("Entree","Nothing found with that id").build();
        }else {
            dao.delete(foundEntree);
        }
        return ResponseEntity.ok().build();
    }
}
