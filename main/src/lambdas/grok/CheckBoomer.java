package lambdas.grok;

public class CheckBoomer implements CheckPerson {

    @Override
    public boolean test(Person p) {
        if (p.getAge() > 60) {
            return true;
        }
        return false;
    }

}
