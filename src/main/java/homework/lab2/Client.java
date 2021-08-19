package homework.lab2;

import lombok.*;

    @ToString
    @Setter
    public class Client {
        private final int debt;
        private final int bonus;
        private final String name;
        private final int salary;

        public Client(int debt, int bonus, String name, int salary) {
            this.debt = debt;
            this.bonus = bonus;
            this.name = name;
            this.salary = salary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {

             int debt;
             int bonus;
             String name;
             int salary;

            Builder debt(int debt) {
                this.debt= debt;
                return this;
            }

            Builder bonus(int bonus) {
                this.bonus = bonus;
                return this;
            }

            Builder name(String name) {
                this.name = name;
                return this;
            }

            Builder salary(int salary) {
                this.salary = salary;
                return this;
            }

            public Client build() {
                return new Client(debt, bonus, name, salary);
            }
        }
}
