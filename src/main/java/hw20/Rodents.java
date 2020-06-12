package hw20;


    public abstract class Rodents implements Mammals {
        protected String name;
        protected String type;

        public Rodents(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public abstract String myName();
}
