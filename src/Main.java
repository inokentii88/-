public class Main {
    public static void main(String[] args) {

    }
    abstract class Person {
     private String name;
     private int age;
     private String surname;
     private int weight;
     private String hobbi;
     private String personID;
     private  void walk(){
         System.out.println(name + "is walked");
     }
     public String getName(){
         return this.name;
     }
        public int getAge(){
            return this.age;
        }
        public String getSurname(){
            return this.surname;
        }
        public int getWeight(){
            return this.weight;
        }
        public String getHobbi(){
            return this.hobbi;
        }
        public String getPersonID(){
            return this.personID;
        }
        public String setName(String name){
         this.name = name;
            return this.name;
        }
        public int setAge(int age){
            this.age = age;
            return this.age;
        }
        public String setSurame(String surname){
            this.surname = surname;
            return this.surname;
        }
        public int setWeight(int weight){
            this.weight = weight;
            return this.weight;
        }
        public String setHobbi(String hobbi){
            this.hobbi = hobbi;
            return this.hobbi;
        }
        public String setPersonID(String personID){
            this.personID = personID;
            return this.personID;
        }
        public Person ( String name, int age, String surname, int weight, String hobbi, String personID) {
            this.name = name;
            this.age = age;
            this.surname = surname;
            this.weight = weight;
            this.hobbi = hobbi;
            this.personID = personID;
        }
    }
    class Student extends Person{
        private String courseOfStady;
        private String achievements;
        private int estimates;
        public Student (String name, int age, String surname, int weight, String hobbi, String personID, String courseOfStady, String achievements, int estimates){
            super(name, age, surname, weight, hobbi, personID);
            this.courseOfStady = courseOfStady;
            this.achievements = achievements;
            this.estimates = estimates;
        }
    }
}