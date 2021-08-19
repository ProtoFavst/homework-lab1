package homework.lab2;

public class Main {
    public static void main(String[] args) {
        Client.Builder builder = Client.builder()
                .debt(12)
                .bonus(14)
                .name("Vasya")
                .salary(100);

        Client client = builder.build();
        System.out.println(client);
    }
}
