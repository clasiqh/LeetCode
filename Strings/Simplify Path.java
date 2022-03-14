class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Deque<String> x = new ArrayDeque<>();
        for (String str : arr) {
            if (str.equals("") || str.equals("."))
                continue;
            else if (str.equals("..")) {
                if (!x.isEmpty())
                    x.removeLast();
            } else
                x.add(str);
        }

        StringBuilder sb = new StringBuilder();
        while (!x.isEmpty()) {
            sb.append("/");
            sb.append(x.poll());
        }

        if (sb.length() == 0)
            sb.append("/");

        return sb.toString();
    }
}