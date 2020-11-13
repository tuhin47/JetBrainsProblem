import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        List<List<Integer>> all = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            List<Integer> seq = new ArrayList<>();
            for (int j = 0; j < column; j++) {
                seq.add(scanner.nextInt());
            }
            all.add(seq);
        }
        int it = scanner.nextInt();
        it = it % row;
        List<List<Integer>> result
                = new ArrayList<>();
        result.addAll(all.subList(row-it, row));
        result.addAll(all.subList(0,row-it ));

        result.forEach(list ->
        {
            list.forEach(l -> System.out.print(l + " "));
            System.out.println();
        });
    }
}