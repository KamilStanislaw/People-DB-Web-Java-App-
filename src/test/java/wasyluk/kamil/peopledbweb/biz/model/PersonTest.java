package wasyluk.kamil.peopledbweb.biz.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class PersonTest {

    @Test
    public void canParse() {
        String csvLine = "687793,Mr.,  Fausto,P,Esqueda,M,fausto.esqueda@aol.com,Randal Esqueda,Yang Esqueda,Cullens, 4/23/1971, 10:25:52 AM,49.39,75,10/29/1998,Q4,H2,1998,10,October,Oct,29,Thursday,Thu,21.85,60101,5%,095-02-0857,216-722-2112,Somerdale,Tuscarawas,Somerdale,OH,44678,Midwest,fpesqueda,lX!iJCJF@[f-/F";
        Person person = Person.parse(csvLine);
        assertThat(person.getDob()).isEqualTo(LocalDate.of(1971,4,23));
    }

}