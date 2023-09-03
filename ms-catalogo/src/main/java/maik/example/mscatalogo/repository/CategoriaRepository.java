package maik.example.mscatalogo.repository;
import maik.example.mscatalogo.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
}
