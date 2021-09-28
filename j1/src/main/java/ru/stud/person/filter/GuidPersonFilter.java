package ru.stud.person.filter;

import ru.stud.person.Person;

import java.util.List;

public interface GuidPersonFilter {
    List<String> filter(List<Person> people);
}
