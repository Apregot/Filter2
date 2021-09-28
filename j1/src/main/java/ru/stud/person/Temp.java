package ru.stud.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.stud.person.filter.GuidPersonFilter;
import ru.stud.person.mapper.PersonMapper;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class Temp {
    @Autowired
    PersonMapper personMapper;

    @Autowired
    GuidPersonFilter guidPersonFilter;

    @PostConstruct
    private void temp(){
        List<Person> personList = personMapper.map();
        List<String> guildList = guidPersonFilter.filter(personList);
        System.out.println(guildList);
    }
}
