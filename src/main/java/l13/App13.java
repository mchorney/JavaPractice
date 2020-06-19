package l13;

public class App13 {
    public static void main(String[] args) {
        Name jay = new Name("Jay", "Hopkins");
        Address jayAddress = new Address("123 Elm Street", "Westminster", States.CA, 40000);

        Name mary = new Name("Mary", "Poppins");
        Address maryAddress = new Address("456 Highway Street", "Westminster", States.CA, 40000);

        Name jack = new Name("Jack", "Lamb");
        Address jackAddress = new Address("450 Aspen Street", "Los-Angeles", States.CA, 40002);

        Name irina = new Name("Irina", "Sidorova");
        Address irinaAddress = new Address("93 Baker Street", "Saint-Peter", States.CA, 323596);

        Doctor pcp = new Doctor(jay,Specialization.PCP,jayAddress);
        Doctor pediatrician = new Doctor(mary, Specialization.CARDIOLOGYST, maryAddress);

        Doctor[] doctors = new Doctor [] {pcp, pediatrician};
        Address mountSinaiAddress = new Address("150 E42nd St", "Mount Sinai", States.NY, 30056);

        Hospital mountSinai= new Hospital("Mount Sinai Hospital", mountSinaiAddress,doctors);

        Hospital SacredHearts = new Hospital("Sacred Hearts",mountSinaiAddress,doctors);


        String maryLastn = mountSinai.getDoctors()[1].getName().getLastName();
        System.out.println(maryLastn);

    }
}
