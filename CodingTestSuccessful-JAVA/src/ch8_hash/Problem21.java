package ch8_hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Problem21 {
    public String[] solution(String[] record) {
        HashMap<String, String> msg = new HashMap<>();
        msg.put("Enter", "님이 들어왔습니다.");
        msg.put("Leave", "님이 나갔습니다.");
        HashMap<String, String> hashMap = new HashMap<>();
        StringTokenizer st;
        String state, uid, nickname;
        for (int i = 0; i < record.length; i++) {
            st = new StringTokenizer(record[i], " ");
            state = st.nextToken();
            uid = st.nextToken();

            if (state.equals("Enter") || state.equals("Change")) {
                nickname = st.nextToken();
                hashMap.put(uid, nickname);
            }
        }

        ArrayList<String> answer = new ArrayList<>();

        for (String str : record) {
            String[] cmd = str.split(" ");
            if (msg.containsKey(cmd[0])) {
                answer.add(hashMap.get(cmd[1]) + msg.get(cmd[0]));
            }
        }

        return answer.toArray(new String[0]);
    }
}
