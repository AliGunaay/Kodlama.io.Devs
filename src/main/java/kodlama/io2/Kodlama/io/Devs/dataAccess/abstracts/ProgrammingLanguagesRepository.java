package kodlama.io2.Kodlama.io.Devs.dataAccess.abstracts;

import kodlama.io2.Kodlama.io.Devs.entities.conceretes.ProgrammingLanguages;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProgrammingLanguagesRepository {
    List<ProgrammingLanguages> gelAll();
    void add(ProgrammingLanguages programmingLanguages);
    void delete(int id);
    void update(ProgrammingLanguages programmingLanguages);
    ProgrammingLanguages getById(int id);
}
