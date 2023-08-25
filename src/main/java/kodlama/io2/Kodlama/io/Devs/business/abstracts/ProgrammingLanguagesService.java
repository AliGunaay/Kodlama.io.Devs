package kodlama.io2.Kodlama.io.Devs.business.abstracts;

import kodlama.io2.Kodlama.io.Devs.entities.conceretes.ProgrammingLanguages;

import java.util.List;

public interface ProgrammingLanguagesService {
    List<ProgrammingLanguages> getAll();

    void add(ProgrammingLanguages newLanguage);
    void delete(int id);
    void update(ProgrammingLanguages updatedLanguage);
    ProgrammingLanguages getById(int id);

}
