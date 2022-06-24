public class Codec {

    public String serialize(TreeNode root) {
        if(root==null)
            return "";
        Queue<TreeNode> x = new LinkedList<>();
        x.add(root);
        StringBuilder sb = new StringBuilder();
        while(!x.isEmpty()){
            int size = x.size();
            for(int i=0; i<x.size(); i++){
                TreeNode curr = x.poll();
                if(curr==null){
                    sb.append("N").append(",");
                    continue;
                }
                sb.append(curr.val).append(",");
                x.add(curr.left);
                x.add(curr.right);
            }
        }
        
        sb.setLength(sb.length()-1);
        return sb.toString();
    }

    public TreeNode deserialize(String data) {
        if(data.equals(""))
            return null;
        String[] arr = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> x = new LinkedList<>();
        x.add(root);
        for(int i=1; i<arr.length; i++){
            TreeNode curr = x.poll();
            if(!arr[i].equals("N")){
                curr.left = new TreeNode(Integer.parseInt(arr[i]));
                x.add(curr.left);
            }
            i++;
            if(!arr[i].equals("N")){
                curr.right = new TreeNode(Integer.parseInt(arr[i]));
                x.add(curr.right);
            }
        }
        return root;
    }
}