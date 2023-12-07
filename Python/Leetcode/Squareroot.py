def mySqrt(self, x):
    start = 0
    end = x if x==1 else int(x/2)

    while (start <= end):
        mid = (start + end)>>1 # This gets the mid since (>>1) is more live div by 2, (>>2) is like div by 4 and so on

        if mid * mid == x:
            return mid
        elif mid * mid > x:
            end = mid - 1
        else:
            start = mid + 1
    return end