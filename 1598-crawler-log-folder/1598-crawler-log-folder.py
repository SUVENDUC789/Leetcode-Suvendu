class Solution(object):
    def minOperations(self, logs):
        """
        :type logs: List[str]
        :rtype: int
        """
        stack=[]

        for i in logs:
            if i !="./":
                if i!="../":
                    stack.append(i)
                else:
                    try:
                        stack.pop()
                    except:
                        pass
        c=0
        while stack != []:
            stack.pop()
            c=c+1
            
        return c
        