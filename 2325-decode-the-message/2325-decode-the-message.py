class Solution:
    def decodeMessage(self, key: str, message: str) -> str:
        map123="abcdefghijklmnopqrstuvwxyz"
        key=key.replace(" ","")
        a= {}
        i=0
        for item in key:
            a[item]=-1
        for key1,value in a.items():
            a[key1]=map123[i]
            i=i+1
        # print(a)
        newMessage=''
        for i in message:
            if i != ' ':
                newMessage=newMessage+a[i]
            else:
                newMessage=newMessage+' '

        return newMessage
        