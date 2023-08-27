class Solution:
    def validMountainArray(self, arr: List[int]) -> bool:
        strctlyinc = False
        strctlydec = False
        
        for i in range(len(arr) - 1):
            if arr[i] > arr[i + 1]:
                if strctlyinc == False:
                    return False
                strctlydec = True
            elif arr[i] < arr[i + 1]:
                if strctlydec == True:
                    return False
                strctlyinc = True
            else:
                return False
        
        if strctlyinc and strctlydec:
            return True
        else:
            return False