public class Task1 {
    public static void execute()
    {
        StringBuilder result = new StringBuilder();
        int N = 15;
        char c1 = 'a';
        char c2 = 'b';
        for (int i = 0; i < N; i++ ) {
            if (i % 2 == 0) {
                result.append(c1);
            }
            if (i % 2 != 0) {
                result.append(c2);
            }
        }
        System.out.println(result.toString());
    }
}
