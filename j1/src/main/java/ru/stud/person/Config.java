package ru.stud.person;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.stud.person.filter.GuidPersonFilter;
import ru.stud.person.filter.GuidPersonFilterByGenderAndAge;
import ru.stud.person.mapper.PersonMapper;
import ru.stud.person.mapper.PersonMapperFromJsonImpl;

@Configuration
@ComponentScan("ru.stud.person")
public class Config {

    @Bean("personMapper")
    public PersonMapper getPersonMapper(){
        return new PersonMapperFromJsonImpl();
    }

    @Bean("guidPersonFilter")
    public GuidPersonFilter getGuidPersonFilter(){
        return new GuidPersonFilterByGenderAndAge();
    }
}
