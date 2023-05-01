class Solution {
    public double average(int[] salary) {
        double sum=0,c=0;
        Arrays.sort(salary);
        for(int i=1 ; i< salary.length -1 ;i++){
            sum+=salary[i];
            ++c;
        }
        
        double res = sum/c;
        return res;
        
        
    }
}