448. Find All Numbers Disappeared in an Array

Solution: xor a list from 1 to n with nums to get the missing nums 


class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        v = set([n for n in range(1,len(nums)+1)])
        return set(nums)^v
        
#Runtime: O(n) - single loop to n
#Space  : O(n) - single array with n values
        
