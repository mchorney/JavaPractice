package les13;

public class App {
    public static void main(String[] args) {
        Name jay= new Name("Jay","Hopkins");
        Address jayAd= new Address("123 Elmstreet","Bronx",States.NY,12345);

        Name susan= new Name("Susan","Hopkins");
        Address susanAd= new Address("123 Elmstreet","Bronx",States.NY,12345);

        Name mary= new Name("Mary","Poppins");
        Address maryAd=new Address("145 Mapple Ave","Brooklyn",States.NY,21547);

        Name jack=new Name("Jack","Lam");
        Address jackAd=new Address("41 Oak ct","little Falls",States.NJ,78927);

        Name ann=new Name("Anna","Shed");
        Address annAd=new Address("58 Cherry Pl","Cherry Hill",States.NJ,87654);

        Doctor obgyn=new Doctor(jay,Specification.OBGYN,jayAd);
        Doctor card2=new Doctor(susan,Specification.CARDIOLOGYST,susanAd);
        Doctor surg=new Doctor(mary,Specification.SURGIST,maryAd);
        Doctor card=new Doctor(jack,Specification.CARDIOLOGYST,jackAd);
        Doctor ped=new Doctor(ann,Specification.PEDIATRIST,annAd);

        Doctor []doctors=new Doctor[]{obgyn,surg,card,ped,card2};
        Address mountSinaiAddres =new Address("159 E 42 St.","NYC",States.NY,10017);

        Hospital mtsin=new Hospital("Mount Sinai",mountSinaiAddres,doctors);

        String jayStreetAdd = mtsin.getDoctors()[0].getAddress().getStreetAddress();
        System.out.println(jayStreetAdd);

        String marylm=mtsin.getDoctors()[1].getName().getLastName();
        System.out.println(marylm);
    }
}
