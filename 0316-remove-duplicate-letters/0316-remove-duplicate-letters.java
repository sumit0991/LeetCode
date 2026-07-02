class Solution {
    public String removeDuplicateLetters(String s) {
         int[] last = new int[26];
        boolean[] seen = new boolean[26];

        for (int i = 0; i < s.length(); i++)
            last[s.charAt(i) - 'a'] = i;

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (seen[ch - 'a'])
                continue;

            while (!stack.isEmpty() &&
                   stack.peekLast() > ch &&
                   last[stack.peekLast() - 'a'] > i) {

                seen[stack.removeLast() - 'a'] = false;
            }

            stack.addLast(ch);
            seen[ch - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty())
            ans.append(stack.removeFirst());

        return ans.toString();
    }
}