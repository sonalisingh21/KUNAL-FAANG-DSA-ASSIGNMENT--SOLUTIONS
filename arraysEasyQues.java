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
 */

public class arraysEasyQUES {
    
}
