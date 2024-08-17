package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Bj22232_가희와파일탐색기 {
    private static class File {
        String name;
        String extension;

        File(String name, String extension) {
            this.name = name;
            this.extension = extension;
        }
    }


    private static int N, M;
    private static ArrayList<File> files;
    private static Set<String> extensionsSet;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        files = new ArrayList<>();
        extensionsSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), ".");
            String name = st.nextToken();
            String extension = st.nextToken();
            files.add(new File(name, extension));
        }

        for (int i = 0; i < M; i++) {
            String extension = br.readLine();
            extensionsSet.add(extension);
        }

        sortFiles();
        for (int i = 0; i < files.size(); i++) {
            sb.append(files.get(i).name).append('.').append(files.get(i).extension).append('\n');
        }
        System.out.println(sb);
    }

    private static void sortFiles() {
        Collections.sort(files, (o1, o2) -> {
            if (o1.name.equals(o2.name)) {
                if (extensionsSet.contains(o1.extension) && !extensionsSet.contains(o2.extension)) {
                    return -1;
                } else if (!extensionsSet.contains(o1.extension) && extensionsSet.contains(o2.extension)) {
                    return 1;
                } else {
                    return o1.extension.compareTo(o2.extension);
                }
            } else {
                return o1.name.compareTo(o2.name);
            }
        });
    }
}
