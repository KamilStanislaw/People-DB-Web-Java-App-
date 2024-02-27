package wasyluk.kamil.peopledbweb.data;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import wasyluk.kamil.peopledbweb.biz.model.Person;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

//@Component
public class PersonDataLoader implements ApplicationRunner {
    private PersonRepository personRepository;

    public PersonDataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (personRepository.count() == 0) {
            List<Person> people = List.of(
                    new Person(null, "Jacek", "Kierownik", LocalDate.of(1956, 2, 4), "your.name@email.com", new BigDecimal("70000"), null),
                    new Person(null, "Marta", "Dela", LocalDate.of(1948, 3, 28), "your.name@email.com", new BigDecimal("54000"), null),
                    new Person(null, "Dawid", "Gwiazda", LocalDate.of(1993, 5, 30), "your.name@email.com", new BigDecimal("39000"), null),
                    new Person(null, "Jan", "Bat", LocalDate.of(1996, 3, 12), "your.name@email.com", new BigDecimal("63000"), null),
                    new Person(null, "Kamil", "Bird", LocalDate.of(1989, 8, 3), "your.name@email.com", new BigDecimal("34000"), null),
                    new Person(null, "Janina", "North", LocalDate.of(1970, 1, 8), "your.name@email.com", new BigDecimal("80000"), null),
                    new Person(null, "Anna", "Salt", LocalDate.of(1968, 12, 18), "your.name@email.com", new BigDecimal("43000"), null),
                    new Person(null, "Mariola", "Uber", LocalDate.of(1999, 11, 17), "your.name@email.com", new BigDecimal("87000"), null),
                    new Person(null, "Paola", "Mouse", LocalDate.of(1998, 9, 14), "your.name@email.com", new BigDecimal("75000"), null),
                    new Person(null, "Marcel", "Sobota", LocalDate.of(1978, 7, 30), "your.name@email.com", new BigDecimal("47000"), null)
            );
            personRepository.saveAll(people);
        }
    }
}
