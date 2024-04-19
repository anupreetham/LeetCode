class Solution {
    public boolean repeatedSubstringPattern(String s) {
     String doubleStr=s+s;
     String findStr=doubleStr.substring(1,doubleStr.length()-1);
     return findStr.contains(s);

    }
}