l1=[0,1,4,5]
j = l1[0]
l2=[]
for i in range(len(l1)):
    if (j==l1[i]):
        j=j+1
        continue

    else:
        l2.append(j)
        i=i-1
    j=j+1
print(l2)
for i in l2:
    print(i,end=",")
print("are missing")
