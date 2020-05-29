package les11;

public class Cat {
        private String name;
        private String breed;
        private int age;

        public Cat(String name, String breed, int age){
            this.name=name;
            this.breed=breed;
            this.age=age;
        }
        public Cat(String name){
            this.name=name;
        };

        public void setName(String name){
            this.name=name;
        }
        public void setBreed(String breed){
            this.breed=breed;
        }
        public void setAge(int age){
            this.age=age;
        }

        public String getName(){
            return this.name;
        }
        public String getBreed(){
            return breed;
        }
        public int getAge(){
            return age;
        }

    }
