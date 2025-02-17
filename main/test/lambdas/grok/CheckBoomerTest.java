package lambdas.grok;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class CheckBoomerTest {

    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;
    private CheckBoomer checker = new CheckBoomer();

    @Before
    public void setUp() throws Exception {
        person1 = new Person("Rowena", LocalDate.now().minusYears(15), Person.Sex.TRANS,"rowena@aol.com");
        person2 = new Person("Gary", LocalDate.now().minusYears(45), Person.Sex.MALE,"gary@aol.com");
        person3 = new Person("Autumn", LocalDate.now().minusYears(35), Person.Sex.INTERSEX,"autumn@aol.com");
        person4 = new Person("Winter", LocalDate.now().minusYears(65), Person.Sex.FEMALE,"autumn2@aol.com");
    }

    @Test
    public void test1() {
        Assert.assertFalse(checker.test(person1));
        Assert.assertFalse(checker.test(person2));
        Assert.assertFalse(checker.test(person3));
        Assert.assertTrue(checker.test(person4));
    }

    @Test
    public void printPersonsTest() {
        ArrayList<Person> roster = new ArrayList<Person>(Arrays.asList(person1,person2,person3,person4));
        Person.printPersons(roster,new CheckBoomer());
    }
}