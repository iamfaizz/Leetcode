class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        String[] map={
            "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };
        result(digits,0,new StringBuilder(), res,map);
        return res;
        
    }
    void result(String digits, int ind, StringBuilder diary, List<String> res, String[] map){
        if(ind==digits.length()){
            res.add(diary.toString());
            return;
        }

        int digit=digits.charAt(ind)-'0';
        String choices=map[digit];
        for(int i=0;i<choices.length();i++){
            diary.append(choices.charAt(i));
            result(digits,ind+1,diary,res,map);
            diary.deleteCharAt(diary.length()-1);

        }
    }
}