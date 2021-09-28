package ru.stud.person.mapper;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import ru.stud.person.Person;

import java.io.File;
import java.io.IOException;
import java.util.List;
@Component
public class PersonMapperFromJsonImpl implements PersonMapper {
    @Override
    public List<Person> map() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File("src/main/resources/generated.json"), new TypeReference<List<Person>>() { });
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
