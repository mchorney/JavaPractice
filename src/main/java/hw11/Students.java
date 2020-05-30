package hw11;

public class Students {

        private String lastname;
        private int age;
        private String hobby;
        private String [] subjects;


        public Students (String lastame, int age, String hobby,String[]subjects ){
            this.lastname = lastname;
            this.age = age;
            this.hobby = hobby;
            this.subjects=subjects;
        }

        public Students (){};
        public Students (String lastname, int age) {
            this.lastname = lastname;
            this.age = age;

        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public void setAge (int age){
            this.age = age;
        }

        public void setHobby (String hobby){
            this.hobby = hobby;
        }

        public void setSubjects (String [] subjects){
            this.subjects = subjects;
        }

        public String getLastname(){
            return lastname;
        }

        public int getAge() {
            return age;
        }

        public String getHobby (){
            return hobby;
        }

        public String [] getSubjects (){
            return subjects;
        }

        public void printOut() {
                System.out.println("Last Name = " + lastname + "\nAge = " + this.age + "\nHobby= " + this.hobby + "\nSubjects= " + this.subjects);

            }


    }












