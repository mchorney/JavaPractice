package l13;

public class App {
    public static void main(String[] args) {
        Name jay = new Name("Jay", "Hopkins");
        Address jayAddress = new Address("123 Elm street", "Bronx", States.NY,12345);

        Name susan = new Name("Susan", "Hopkins");
        Address susanAddress = new Address("123 Elm street", "Bronx", States.NY,12345);

        Name mary = new Name("Mary", "Poppins");
        Address maryAddress = new Address("145 Mapple ave", "Brooklyn",States.NY,21547);

        Name jack = new Name("Jack", "Lam");
        Address jackAddress = new Address("41 Oak ct", "Little Falls",States.NJ,78927);

        Name ann = new Name("Anna","Shed");
        Address annAddress = new Address("58 Cherry pl", "Cherry Hill", States.NJ, 87978);

        Doctor pcp = new Doctor(jay,Specialization.PCP,jayAddress);
        Doctor cardyo2 = new Doctor(susan,Specialization.CARDIOLOGYST,susanAddress);
        Doctor pediatric = new Doctor(mary,Specialization.PEDIATRIC, maryAddress);
        Doctor podiatric = new Doctor(jack,Specialization.PODIATRIC,jackAddress);
        Doctor cardiologyst = new Doctor(ann,Specialization.CARDIOLOGYST,annAddress);

        Doctor[] doctors = new Doctor[] {pcp,pediatric,podiatric,cardiologyst,cardyo2};
        Address mountSinaiAddress = new Address("150 E 42nd St", "NYC",States.NY,10017);

        Hospital mountSinai = new Hospital("Mount Sinai Hospital",mountSinaiAddress,doctors);


        String jaysStreetAddress = mountSinai.getDoctors()[0].getHomeAddress().getStreetAddress();
        String maryLastName = mountSinai.getDoctors()[1].getName().getLastName();

        System.out.println(jaysStreetAddress);
        System.out.println(maryLastName);
    }
}
