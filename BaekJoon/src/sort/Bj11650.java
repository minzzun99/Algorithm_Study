    package sort;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.Arrays;
    import java.util.Comparator;
    import java.util.StringTokenizer;

    public class Bj11650 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][2];
            for(int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr, new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {
                    int cmp = Integer.compare(a[0], b[0]);
                    if (cmp == 0) {
                        cmp = Integer.compare(a[1], b[1]);
                    }
                    return cmp;
                }
            });
            for(int j = 0; j < N; j++) {
                System.out.println(arr[j][0] + " " + arr[j][1]);
            }
        }
    }
