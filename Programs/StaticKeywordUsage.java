public class StaticKeywordUsage {

    public String name;
    public int age;
    public static String address;

    public static void main(String[] args) {
        StaticKeywordUsage person1 = new StaticKeywordUsage();
        person1.name = "Kiran";
        person1.age = 26;
        person1.address = "Bangalore";

        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person1.address);

        StaticKeywordUsage person2 = new StaticKeywordUsage();

        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.address);

        //Even though person 2 is not defined, static variable value is initialsed for the whole class
        /**
         * Output:
         *   Kiran
         *   26
         *   Bangalore
         *   null
         *   0
         *   Bangalore
         */
    }
}
