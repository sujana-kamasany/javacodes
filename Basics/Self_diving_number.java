class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
       final List<Integer> arr=new LinkedList();
        for(int i=left;i<=right;i++){
            if(valid(i)){
                arr.add(i);
            }
        }
        return arr;
    }
    public boolean valid(int n){
        final int original = n;
        while(n!=0){
        final int rem = n%10;
        n/=10;
        if(rem ==0 || original %rem!=0){
            return false;
        }
        }
    return true;
    }
}
