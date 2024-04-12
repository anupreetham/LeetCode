class Solution {
    public String reverseVowels(String s) {
        char temp=' ';
     char[] ch= s.toCharArray();
     int last=ch.length;
     for(int i=0; i<ch.length; i++){
        if(ch[i]=='A' || ch[i]=='E'|| ch[i]=='I' || ch[i]=='O' || ch[i]=='U' || ch[i]=='a' || ch[i]=='e'|| ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
            for(int j=last-1; j>i; j--){
                if(ch[j]=='A' || ch[j]=='E'|| ch[j]=='I' || ch[j]=='O' || ch[j]=='U'|| ch[j]=='a' || ch[j]=='e'|| ch[j]=='i' || ch[j]=='o' || ch[j]=='u'){
                    temp=ch[j];
                    ch[j]=ch[i];
                    ch[i]=temp;
                    last =j;
                    break;
                } 
            }
        }
     }
    String str = new String(ch);
    return str;
    }
}