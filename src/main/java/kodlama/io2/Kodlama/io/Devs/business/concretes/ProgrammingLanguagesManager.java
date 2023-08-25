package kodlama.io2.Kodlama.io.Devs.business.concretes;

import kodlama.io2.Kodlama.io.Devs.business.abstracts.ProgrammingLanguagesService;
import kodlama.io2.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguagesRepository;
import kodlama.io2.Kodlama.io.Devs.entities.conceretes.ProgrammingLanguages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguagesManager implements ProgrammingLanguagesService {
    private ProgrammingLanguagesRepository programmingLanguagesRepository;

    @Autowired
    public ProgrammingLanguagesManager(ProgrammingLanguagesRepository programmingLanguagesRepository) {
        this.programmingLanguagesRepository = programmingLanguagesRepository;
    }

    @Override
    public List<ProgrammingLanguages> getAll() {
        return programmingLanguagesRepository.gelAll();
    }

    @Override
    public void add(ProgrammingLanguages newLanguage) {
        if (newLanguage != null) {
            programmingLanguagesRepository.add(newLanguage);
        } else {
            throw new IllegalArgumentException("New programming language cannot be null.");
        }
    }

    @Override
    public void delete(int id) {
        programmingLanguagesRepository.delete(id);
    }

    @Override
    public void update(ProgrammingLanguages updatedLanguage) {
        if (updatedLanguage != null) {
            programmingLanguagesRepository.update(updatedLanguage);
        } else {
            throw new IllegalArgumentException("Updated programming language cannot be null.");
        }
    }

    @Override
    public ProgrammingLanguages getById(int id) {
        return programmingLanguagesRepository.getById(id);
    }
}
