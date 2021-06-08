import java.util.Comparator;
import java.util.PriorityQueue;

public class PQEXAMPLE {
    public static void main(String[] args) {
        human Mohit = new human("Mohit", 20, 20000);
        System.out.println(Mohit);
        human Amit = new human("Amit", 26, 60000);
        System.out.println(Amit);
        human Raman = new human("Raman", 20, 10000);
        System.out.println(Raman);
        PriorityQueue<human> queue = new PriorityQueue<>(new Comparator<human>() {
            @Override
            public int compare(human o1, human o2) {

                return o1.age != o2.age ? o2.age - o1.age : o2.salary - o1.salary;

            }
        });
        queue.add(Mohit);
        queue.add(Amit);
        queue.add(Raman);
        System.out.println(queue.remove());
//        queue.add(2);
//        queue.add(12);
//        queue.add(10);
//        queue.add(4);
//        System.out.println(queue.remove());
        System.out.println(queue.remove());
//        queue.add(1);
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
    }

    private static class human {
        private String name;
        private int age;
        private int salary;

        public human(String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return String.format("{ %s: %d : %d}", name, age, salary);
        }
    }
}

