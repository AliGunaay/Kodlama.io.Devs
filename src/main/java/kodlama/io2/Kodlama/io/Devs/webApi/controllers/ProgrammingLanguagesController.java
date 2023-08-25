package kodlama.io2.Kodlama.io.Devs.webApi.controllers;

import kodlama.io2.Kodlama.io.Devs.business.abstracts.ProgrammingLanguagesService;
import kodlama.io2.Kodlama.io.Devs.entities.conceretes.ProgrammingLanguages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
    private ProgrammingLanguagesService programmingLanguagesService;

    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguagesService programmingLanguagesService) {
        this.programmingLanguagesService = programmingLanguagesService;
    }

    @GetMapping("/getall")
    public List<ProgrammingLanguages> getAll() {
        return programmingLanguagesService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody ProgrammingLanguages programmingLanguage) throws Exception{
        programmingLanguagesService.add(programmingLanguage);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) throws Exception{
        programmingLanguagesService.delete(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody ProgrammingLanguages programmingLanguage) throws Exception {
        programmingLanguagesService.update(programmingLanguage);
    }

    @GetMapping("/get/{id}")
    public ProgrammingLanguages getById(@PathVariable(name = "id") int id) throws Exception {
        return programmingLanguagesService.getById(id);
        }

}
