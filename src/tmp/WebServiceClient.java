package tmp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Created by artemsolonin on 15.05.2017.
 */
public class WebServiceClient {

    public static void main(String[] args) throws MalformedURLException{
        URL url = new URL("http://localhost:8080/PersonService?wsdl");
        PersonService personService = new PersonService(url);
        List<Person> persons = personService.getPersonWebServicePort().getPersons();
        for(Person person : persons){
            System.out.println("name: "+person.getName()+ ", age: " + person.getAge());
        }

        System.out.print("Total persons: " + persons.size());
    }
}
