class Solution(object):
    def plusOne(self, d):
        for i in range(len(d)):
            d[i] = str(d[i])
        
        d=''.join(d)
        d=int(d)+1
        d=str(d)
        
        a=[]
        for i in d:
            a.append(int(i))
            
        return a


        