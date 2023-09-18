package com.klachkova.library.util;

import com.klachkova.library.modeles.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import com.klachkova.library.dao.PersonDAO;


@Component
public class PersonValidator implements Validator {
    private final PersonDAO personDAO;

    @Autowired
    public PersonValidator(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

    }

    // возможно понадобится для книги
    /*@Override
    public void validate(Object target, Errors errors) {
        Person person = (Person) target;

        if (personDAO.show(person.getEmail()).isPresent()){
            errors.rejectValue("email", "","This email is already taken");
        }
    }*/
}
