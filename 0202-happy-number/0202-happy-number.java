class Solution {
    public boolean isHappy(int n) {
      String num_str=Integer.toString(n);
        ArrayList<Integer> digits= new ArrayList<>();
        while(num_str.length()>1){
            digits.clear();
             for(int i=0; i<num_str.length(); i++){
                char c1=num_str.charAt(i);
                digits.add(Character.getNumericValue(c1));
        }
         n=0;
        for(int j=0; j<digits.size(); j++){
                n=n+digits.get(j)*digits.get(j);
        }
            num_str=Integer.toString(n);

        }
        if(n==1 || n==7){
            return true;
        }
        return false;
        }
    }
