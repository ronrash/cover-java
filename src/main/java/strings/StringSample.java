package strings;

public class StringSample {
    public static void main(String[] args) {

        System.out.println(String.format("hello %s what is your %d %c","rohit",12,'d'));

        System.out.println((char)('a')+3);

        // print all acharacters
        for(int i=0;i<26;i++)
        {
            char ch = (char)('a'+i);
            System.out.printf(ch +",");
        }
    }
}
