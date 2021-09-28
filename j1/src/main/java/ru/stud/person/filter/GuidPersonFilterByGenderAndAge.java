package ru.stud.person.filter;

import org.springframework.stereotype.Component;
import ru.stud.person.Person;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class GuidPersonFilterByGenderAndAge implements GuidPersonFilter{

    @Override
    public List<String> filter(List<Person> people) {
        return people.stream()
                .filter(person -> person.getGender().equals("male"))
                .filter(person -> person.getAge() >= 20)
                .filter(person -> person.getAge() <= 30)
                .map(Person::getGuid)
                .collect(Collectors.toList());
    }
}
