package wasyluk.kamil.peopledbweb.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import wasyluk.kamil.peopledbweb.biz.model.Person;

import java.util.Set;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long>, PagingAndSortingRepository<Person, Long> {

    @Query(nativeQuery = true, value = "SELECT PHOTO_FILE_NAME FROM PERSON WHERE ID IN :ids")
    public Set<String> findFileNamesByIds(@Param("ids") Iterable<Long> ids);
}
