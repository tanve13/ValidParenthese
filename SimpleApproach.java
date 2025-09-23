class Solution {
    public boolean isValid(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        return s.isEmpty();
    }
}

public class SimpleApproach {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.isValid("()"));     
        System.out.println(sol.isValid("()[]{}"));  
        System.out.println(sol.isValid("(]"));      
        System.out.println(sol.isValid("({[]})")); 
    }
}
