package LinkedLists.CircularLinkedLIst;

public class HappyNumber {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = square(slow);
            fast = square(square(fast));
        }while(slow != fast);
        if (slow == 1){
            return true;
        }else{
            return false;
        }
    }
    private int square(int number){
        int ans = 0;
        while(number > 0){
            int rem = number % 10;
            ans += rem*rem;
            number /= 10;
        }
        return ans;
    }
}
