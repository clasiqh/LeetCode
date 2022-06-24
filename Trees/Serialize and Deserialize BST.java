public class Codec {
    int i = 0;

    public String serialize(TreeNode root) {
        StringBuilder x = new StringBuilder();
        preOrder(root, x);
        x.setLength(x.length() - 1);
        return x.toString();

    }

    public TreeNode deserialize(String data) {
        String[] x = data.split(",");
        return make(x);
    }

    TreeNode make(String[] x) {
        if (x[i].equals("N")) {
            i++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(x[i]));
        i++;
        root.left = make(x);
        root.right = make(x);
        return root;
    }

    void preOrder(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("N").append(",");
            return;
        }
        sb.append(root.val).append(",");
        preOrder(root.left, sb);
        preOrder(root.right, sb);

    }
}