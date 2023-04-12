class Solution {
    public String simplifyPath(String path) {
        String[] pathArray = path.split("/");
        Stack<String> st = new Stack<String>();

        for(String s : pathArray){
            if(!st.isEmpty() && s.equals("..")){
                st.pop();
            }
            else if(!s.equals("") && !s.equals(".") && !s.equals("..")){
                st.push(s);
            }
        }

        if(st.isEmpty()){
            return "/";
        }
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            String s = "/"+st.pop();
            str.insert(0,s);
        }
        return str.toString();
    }
}
