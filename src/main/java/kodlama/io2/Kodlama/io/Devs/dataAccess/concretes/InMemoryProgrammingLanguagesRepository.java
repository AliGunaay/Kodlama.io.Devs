package kodlama.io2.Kodlama.io.Devs.dataAccess.concretes;

import kodlama.io2.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguagesRepository;
import kodlama.io2.Kodlama.io.Devs.entities.conceretes.ProgrammingLanguages;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgrammingLanguagesRepository implements ProgrammingLanguagesRepository {

    private final List<ProgrammingLanguages> programmingLanguages;

    public InMemoryProgrammingLanguagesRepository() {
        programmingLanguages = new ArrayList<>();
        programmingLanguages.add(new ProgrammingLanguages(1, "C#"));
        programmingLanguages.add(new ProgrammingLanguages(2, "Java"));
        programmingLanguages.add(new ProgrammingLanguages(3, "Python"));
    }

    @Override
    public List<ProgrammingLanguages> gelAll() {
        return programmingLanguages;
    }

    @Override
    public void add(ProgrammingLanguages newLanguage) {
        programmingLanguages.add(newLanguage);
    }

    @Override
    public void delete(int id) {
        ProgrammingLanguages languageToRemove = getById(id);
        if (languageToRemove != null) {
            programmingLanguages.remove(languageToRemove);
        }
    }

    @Override
    public void update(ProgrammingLanguages updatedLanguage) {
        ProgrammingLanguages languageToUpdate = getById(updatedLanguage.getId());
        if (languageToUpdate != null) {
            languageToUpdate.setName(updatedLanguage.getName());
        }
    }

    @Override
    public ProgrammingLanguages getById(int id) {
        for (ProgrammingLanguages language : programmingLanguages) {
            if (language.getId() == id) {
                return language;
            }
        }
        return null;
    }
}
