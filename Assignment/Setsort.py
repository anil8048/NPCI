set1={5,8,4,12,3,2,32,11}
list1=list(set1)
print(list1)
for i in range(len(list1)):
    for j in range(i+1,len(list1)):
        if(list1[i]<list1[j]):
            temp=list1[i]
            list1[i]=list1[j]
            list1[j]=temp
print(list1)
