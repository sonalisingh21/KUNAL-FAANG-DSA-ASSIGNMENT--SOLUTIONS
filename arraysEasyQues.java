/*
 * Arrays
 * 
 * Q1. Build Array from Permutation
 * https://leetcode.com/problems/build-array-from-permutation/description/
 * Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

 A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
 
  
 
 Example 1:
 
 Input: nums = [0,2,1,5,3,4]
 Output: [0,1,2,4,5,3]
 Explanation: The array ans is built as follows: 
 ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
     = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
     = [0,1,2,4,5,3]

SOLUTION =>
public class Arrays {
    public int[] buildArray(int[] nums) {
        
        int ans[]= new int[nums.length];
        for(int i = 0 ; i < ans.length ; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;}
        //only function is to be submitted in leetcode , and not the main class
=====================================================================================================================
=====================================================================================================================
Q2. Concatenation of Array
https://leetcode.com/problems/concatenation-of-array/description/
Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

 

Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]

SOLUTION:
public class Arrays {
    class Solution {
        public int[] getConcatenation(int[] nums) {
            int n = nums.length; 
            int ans[] = new int[2*n];
       
               // array will only iterate till n because original arrays length was till < n , 
               //rest of the length i.e  i+n will be filled again by nums[i]

               for( int  i = 0; i <n; i++){
                   ans[i]= nums[i];
                   ans[i + n ] = nums[i];
       
               }
       
               return ans;
           }
       }
        //only function is to be submitted in leetcode , and not the main class
 
}        
 
}    
=====================================================================================================================
=====================================================================================================================
Q3. **Running Sum of 1d Array**
https://leetcode.com/problems/running-sum-of-1d-array/description/
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.


Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

SOLUTION =>
class Solution {
    public int[] runningSum(int[] nums) {

        // int[] runningSum = new int[nums.length];

        for(int i = 1; i < nums.length; i++){
           nums[i] +=  nums[i - 1];
        }
     
        return nums;
    }
   
}
//   //only function is to be submitted in leetcode , and not the main class

=====================================================================================================================
=====================================================================================================================
q4. Richest Customer Wealth 
https://leetcode.com/problems/richest-customer-wealth/description/

You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.


Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.


SOLUTION =>

class Solution {
    public int maximumWealth(int[][] accounts) {
        //iterating over accounts array, row and then column;
        // and obtaining maximum amongst entire array and returning it;

        int max_wealth = Integer.MIN_VALUE;
        for(int[]person_account: accounts){
            
            int current_wealth = 0;
            for(int wealth:person_account){
                current_wealth+= wealth;
            }
        max_wealth = Math.max(current_wealth,max_wealth);
        }
        return max_wealth;
    }
}
//only function is to be submitted in leetcode , and not the main class
=====================================================================================================================
=====================================================================================================================

Q5. Shuffle the Array
https://leetcode.com/problems/shuffle-the-array/description/

Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

 

Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

SOLUTION =>
// first we will initate an array ,iterate count of array then we will insert elements into it since 
    // first element is arr[count]= nums[i] i.e X1  and second element is  Y1 which is present after xn,
    // we will insert  arr[count +1] = nums[i+1] and iterate to third element since two are already interted by 
    // incrementing count , count = count +2; lastly return array;

class Solution {
   
    public int[] shuffle(int[] nums, int n) {

        int arr[]= new int[nums.length];

        int count = 0; 

        for(int i = 0; i < n; i++){
           arr[count] =  nums[i];
           arr[count+1]= nums[i+n];

            count+= 2;
        }

        return arr;
        
    }
}
=====================================================================================================================
=====================================================================================================================

Q6.  Kids With the Greatest Number of Candies
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
There are n kids with candies. You are given an integer array candies, 
where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies,
denoting the number of extra candies that you have.
Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.


Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

//FIRST WE WILL FIND  THE KID HAVING MAXIMUM CANDIES i.e. finding maxcandy in the array 
// then we will give extracandies to each kid and, i.e. candy + extra candies present;
// post that we will compare if after giving the extra candies , kids have more candies than max candy;
// since it is given that  multiple kids can have the greatest number of candies , adding TRUE in array for this case
//  and  the kid that does not have max number of candy will be false in array


class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       int maxCandy= -1;

       for(int candy : candies){
        if( candy > maxCandy){
            maxCandy = candy;
        }

       }

       List<Boolean> res = new ArrayList<>(); 
       for(int candy : candies){
        if(candy + extraCandies >=max){
            res.add(true);
        }
        else{
            res.add(false);
        }
       }

       return res;

        
    }
}
=====================================================================================================================
=====================================================================================================================

Q7. Number of Good Pairs
https://leetcode.com/problems/number-of-good-pairs/description/

Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

 

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0

//initally number of goodpairs(result) = 0;
// first find count of each digit present in array AND store them in count array
// then find number of pairs of digit present in count array using count of each array
//  formula for finding pairs of similar digit using count = n*(n-1)/2; 
//  after finding pairs for each digit sum them together to get total number of good pairs;


class Solution {
    public int numIdenticalPairs(int[] nums) {

        int pairs = 0 ;
        //building count array
        int [] countArr = new int[101];
         
         for(int num : nums){
            //storing the count of each num in this array
            countArr[num]++;
         }

         for(int n : countArr){
            //finding good pairs for each element of countArr
            n = (n*(n-1))/2;
            pairs = pairs + n ;
        
         }
         return pairs;

    }
}
*/

public class arraysEasyQUES {
    
}
