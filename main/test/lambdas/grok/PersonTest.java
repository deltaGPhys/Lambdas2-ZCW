package lambdas.grok;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import lambdas.grok.Person;
import java.time.LocalDate;

public class PersonTest {

    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;

    @Before
    public void setUp() throws Exception {
        person1 = new Person("Rowena", LocalDate.now().minusYears(15), Person.Sex.TRANS,"rowena@aol.com");
        person2 = new Person("Gary", LocalDate.now().minusYears(45), Person.Sex.MALE,"gary@aol.com");
        person3 = new Person("Autumn", LocalDate.now().minusYears(35), Person.Sex.INTERSEX,"autumn@aol.com");
        person4 = new Person("Winter", LocalDate.now().minusYears(65), Person.Sex.FEMALE,"autumn2@aol.com");
    }

    @Test
    public void getAge() {
        Assert.assertEquals(15,person1.getAge());
        Assert.assertEquals(45,person2.getAge());
        Assert.assertEquals(35,person3.getAge());
        Assert.assertEquals(65,person4.getAge());
    }

}