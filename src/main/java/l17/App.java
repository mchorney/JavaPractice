package l17;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {

        HashMap<String,String> stringStringHashMapOne = new HashMap<>();
        stringStringHashMapOne.put("Dog","Amadeus");
        stringStringHashMapOne.put("Cat","Fedor");
        stringStringHashMapOne.put("Parakeet","Blueberry");
        stringStringHashMapOne.put("Lizard","Spock");
        System.out.println(stringStringHashMapOne);
        stringStringHashMapOne.replace("Lizard", "Coma");
        System.out.println(stringStringHashMapOne);
        stringStringHashMapOne.remove("Cat");
        System.out.println(stringStringHashMapOne);
        System.out.println(stringStringHashMapOne.get("Dog"));
        stringStringHashMapOne.forEach ((k, v) -> System.out.println("Key " + k + " and value " + v));

        HashMap<Integer,String> stringStringHashMapTwo = new HashMap<>();
        stringStringHashMapTwo.put(1988, "Die Hard");
        stringStringHashMapTwo.put(1999, "The Sixth Sense");
        stringStringHashMapTwo.put(1994, "Pulp Fiction");
        stringStringHashMapTwo.put(1997, "The Fifth Element");
        stringStringHashMapTwo.put(1998, "Armageddon");
        stringStringHashMapTwo.put(2000, "Unbreakable");
        System.out.println(stringStringHashMapTwo);
        stringStringHashMapTwo.replace(1988, "Die Hard with a Vengeance");
        System.out.println(stringStringHashMapTwo);
        System.out.println(stringStringHashMapTwo.remove(1998, "Armageddon"));
        System.out.println(stringStringHashMapTwo.get(1994));
        stringStringHashMapTwo.forEach((key, value) -> System.out.println(value));

        Authenticator bwAuth = new Authenticator("Awesome", "Password", 1758);
        Authenticator sjAuth = new Authenticator("Gorges", "1234", 5878);
        Authenticator qtAuth = new Authenticator("Crazy", "umaThurman", 1214);
        Authenticator jtAuth = new Authenticator("DanceMan", "Hello1234", 5548);
        Authenticator utAuth = new Authenticator("Beautiful", "MyPassword", 6951);

        PersonalInformation bw = new PersonalInformation("Bruce", "Willis", 1);
        PersonalInformation sj = new PersonalInformation("Samuel", "Jackson", 2);
        PersonalInformation slj = new PersonalInformation("Samuel", "L. Jackson", 2);
        PersonalInformation qt = new PersonalInformation("Quentin", "Tarantino", 3);
        PersonalInformation jt = new PersonalInformation("John", "Travolta", 4);
        PersonalInformation ut = new PersonalInformation("Uma", "Thurman", 5);

        HashMap<Authenticator, PersonalInformation> employees = new HashMap<>();
        employees.put(bwAuth, bw);
        employees.put(sjAuth, sj);
        employees.put(qtAuth, qt);
        employees.put(jtAuth, jt);
        employees.replace(sjAuth, slj);
        System.out.println(employees.get(sjAuth).EmployInfo());
        employees.forEach((auth, persona) -> System.out.println(persona.EmployInfo() + " " + auth.info()));
    }
}
