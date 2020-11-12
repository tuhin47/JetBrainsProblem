import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final List<Integer> seq = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int it = scanner.nextInt();
        while(it-->0){
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            Collections.swap(seq, first, second);
        }
        seq.forEach(e -> System.out.print(e + " "));
    }
}